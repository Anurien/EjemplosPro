package com.programacion.ExemploInterfaces;

public class Gato extends Animal implements IDomestico{

    @Override
    public void falar() {
        System.out.println("miau miau");

    }

    @Override
    public void nombrar() {
        System.out.println("Pechuga Villaroy");

    }
}
