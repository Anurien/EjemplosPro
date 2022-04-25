package com.programacion.ExemploXenerica.coleccions;

public class Publicacion <T>{
    private String nome;
    private float precio;

    public Publicacion() {
    }

    public Publicacion(String nome, float precio) {
        this.nome = nome;
        this.precio = precio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "nome='" + nome + '\'' +
                ", precio=" + precio +
                '}';
    }
}
