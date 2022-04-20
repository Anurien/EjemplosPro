package com.programacion.ExemploPolimorfismo.subclases1.subclases;

import com.programacion.ExemploPolimorfismo.Persoa;

public class Tenista extends Persoa {
    private int partidosXogados;

    public Tenista() {
    }

    public Tenista(String nome, int idade, int partidosXogados) {
        super(nome, idade);
        this.partidosXogados = partidosXogados;
    }

    public int getPartidosXogados() {
        return partidosXogados;
    }

    public void setPartidosXogados(int partidosXogados) {
        this.partidosXogados = partidosXogados;
    }

    @Override
    public String toString() {
        return super.toString() + "Tenista{" +
                "partidosXogados=" + partidosXogados +
                '}';
    }
    @Override
    public void amosar(){
        System.out.println(super.toString()+partidosXogados);
    }
}
