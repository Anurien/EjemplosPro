package com.programacion.ExemploXenerica;

public class Alumno {
    String nome;
    int idado;

    public Alumno() {
    }

    public Alumno(String nome, int idado) {
        this.nome = nome;
        this.idado = idado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdado() {
        return idado;
    }

    public void setIdado(int idado) {
        this.idado = idado;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nome='" + nome + '\'' +
                ", idado=" + idado +
                '}';
    }
}
