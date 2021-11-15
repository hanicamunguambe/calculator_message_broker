package com.rest_consumer.controller.domain;

import java.math.BigDecimal;

/**
 * @Author Hanica.Munguambe
 * @Author 15/11/2021 05:21
 */
public class Resultado {

    private BigDecimal resultado;

    public Resultado() {
    }

    public Resultado (BigDecimal resultado){ this.resultado=resultado;}

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }
}
