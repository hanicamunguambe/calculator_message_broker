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

/**
 * @Autora Hanica Munguambe
 * @Data 13.11.21 17:27
 **/

@RestController
@RequestMapping("/calculator")

public class RestControler {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping("/adicionar")
    public ResponseEntity<Resposta> adicionar(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {
        Resultado resultado = new Resultado();
        resultado.setResultado((float) a + (float) b);
        rabbitMQSender.send(resultado);
        Resposta response = new Resposta("Operador adicionar executado e adicionado a quee com sucesso");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/subtrair")
    public ResponseEntity<Resposta> subtrair(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {

        Resultado resultado = new Resultado();
        resultado.setResultado((float) a - (float) b);
        Resposta response = new Resposta("Operador subtrair executado e adicionado a quee com sucesso");
        rabbitMQSender.send(resultado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @GetMapping("/multiplicar")
    public ResponseEntity<Resposta> multiplicar(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {

        Resultado resultado = new Resultado();
        resultado.setResultado((float) a * (float) b);
        Resposta response = new Resposta("Operador multiplicar executado e adicionado a fila com sucesso");
        rabbitMQSender.send(resultado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/dividir")
    public ResponseEntity<Resposta> dividir(@RequestParam(required = false) int a, @RequestParam(required = false) int b) {

        Resultado resultado = new Resultado();
        resultado.setResultado((float) a / (float) b);
        Resposta response = new Resposta(" Operador dividir executado e adicionado a fila com sucesso");
        rabbitMQSender.send(resultado);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
