package com.calculator_publisher.controller;


import com.calculator_publisher.controller.domain.Resposta;
import com.calculator_publisher.controller.domain.Resultado;
import com.calculator_publisher.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


/**
 * @Autora Hanica Munguambe
 * @Data 15.11.21 05:16
 **/

@RestController
@RequestMapping("/calculator")

public class RestControler {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping("/adicionar")
    public ResponseEntity<Resposta> adicionar(@RequestParam(required = false) BigDecimal a, @RequestParam(required = false) BigDecimal b) {

        BigDecimal res1 = a.add(b);

        Resultado resultado = new Resultado();
        resultado.setResultado(res1);
        rabbitMQSender.send(resultado);
        Resposta response = new Resposta("Operador adicionar executado e adicionado a quee com sucesso");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/subtrair")
    public ResponseEntity<Resposta> subtrair(@RequestParam(required = false) BigDecimal a, @RequestParam(required = false) BigDecimal b) {

        BigDecimal res2 = a.subtract(b);
        Resultado resultado = new Resultado();
        resultado.setResultado(res2);
        Resposta response = new Resposta("Operador subtrair executado e adicionado a quee com sucesso");
        rabbitMQSender.send(resultado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @GetMapping("/multiplicar")
    public ResponseEntity<Resposta> multiplicar(@RequestParam(required = false) BigDecimal a, @RequestParam(required = false) BigDecimal b) {

        BigDecimal res3 = a.multiply(b);
        Resultado resultado = new Resultado();
        resultado.setResultado(res3);
        Resposta response = new Resposta("Operador multiplicar executado e adicionado a fila com sucesso");
        rabbitMQSender.send(resultado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/dividir")
    public ResponseEntity<Resposta> dividir(@RequestParam(required = false) BigDecimal a, @RequestParam(required = false) BigDecimal b) {

        BigDecimal res4 = a.divide(b);
        Resultado resultado = new Resultado();
        resultado.setResultado(res4);
        Resposta response = new Resposta(" Operador dividir executado e adicionado a fila com sucesso");
        rabbitMQSender.send(resultado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
