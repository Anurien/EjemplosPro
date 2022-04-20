package com.programacion.ExemploPolimorfismo.subclases1.subclases;

import com.programacion.ExemploPolimorfismo.Persoa;

public class Marinero extends Persoa {
    private int dias;

    public Marinero() {
    }

    public Marinero(String nome, int idade, int dias) {
        super(nome, idade);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return super.toString() + "Marinero{" +
                "dias=" + dias +
                '}';
    }

    @Override
    public void amosar() {
        System.out.println(this);

    }
}
