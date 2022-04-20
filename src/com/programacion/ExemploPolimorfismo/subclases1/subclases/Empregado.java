package com.programacion.ExemploPolimorfismo.subclases1.subclases;

import com.programacion.ExemploPolimorfismo.Persoa;

public class Empregado extends Persoa {
    private float soldo;

    public Empregado() {
    }

    public Empregado(String nome, int idade, float soldo) {
        super(nome, idade);
        this.soldo = soldo;
    }

    public float getSoldo() {
        return soldo;
    }

    public void setSoldo(float soldo) {
        this.soldo = soldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empregado{" +
                "soldo=" + soldo +
                '}';
    }
    @Override
    public void amosar(){
        System.out.println(this);
    }
}
