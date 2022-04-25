package com.programacion.ExemploXenerica.coleccions;

public class Revista extends Publicacion{
    private String tematica;

    public Revista() {
    }

    public Revista(String tematica) {
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
