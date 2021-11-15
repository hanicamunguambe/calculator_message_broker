package com.calculator_publisher.controller.domain;

import java.math.BigDecimal;

/**
 * @Author Hanica Munguambe
 * @Author 14/11/2021 23:20
 */
public class Resultado {

    private BigDecimal resultado;

    public Resultado() {}

    public Resultado(BigDecimal resultado){ this.resultado=resultado;}

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }
}
