package com.rest_consumer.controller;

import com.rest_consumer.service.RabbitMQConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Hanica.Munguambe
 * @Author 13/11/2021 18:42
 */

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    RabbitMQConsumer rabbitMQConsumer;


}
