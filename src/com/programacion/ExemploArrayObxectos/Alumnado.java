package com.programacion.ExemploArrayObxectos;

import javax.swing.*;
import java.util.Objects;

public class Alumnado implements Comparable {
    private String nome;
    private float nota;

    public Alumnado() {

    }

    public Alumnado(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnado{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnado alumnado = (Alumnado) o;
        return nota == alumnado.nota && nome.equals(alumnado.nome);
    }

    @Override
    public int hashCode() { //comprueba si el codigo es igual y luego compara el valor con equals, si el codigo es distinto ya no compara nada
        return Objects.hash(nome, nota);
    }

    @Override
    public int compareTo(Object o) {
        Alumnado al = (Alumnado) o;
        if (this.nome.compareToIgnoreCase(al.nome) > 0)
            return 1;
        else if (this.nome.compareToIgnoreCase(al.nome) < 0)
            return -1;
        else
            return 0;
    }
}
