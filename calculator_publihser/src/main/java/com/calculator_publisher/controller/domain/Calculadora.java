package com.calculator_publisher.controller.domain;

/**
 * @Author Hanica Munguambe
 * @Author 13/11/2021 17:22
 */

public class Calculadora {
    private int a,b;

    public Calculadora() {}

    public Calculadora(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int geA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
