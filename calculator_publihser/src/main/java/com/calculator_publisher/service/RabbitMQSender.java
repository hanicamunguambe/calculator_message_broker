package com.calculator_publisher.service;

import com.calculator_publisher.controller.domain.Resultado;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("calculator.exchange")
	private String exchange;
	
	@Value("calculator.routingkey")
	private String routingkey;	

	public void send(Resultado resultado) {
		amqpTemplate.convertAndSend(exchange, routingkey, resultado);

	}
}