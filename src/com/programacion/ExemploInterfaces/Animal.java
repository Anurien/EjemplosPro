package com.programacion.ExemploInterfaces;

public abstract class Animal {
    private String raza;

    public Animal() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public abstract void falar(); // so se implementa por ser abstracta
}
