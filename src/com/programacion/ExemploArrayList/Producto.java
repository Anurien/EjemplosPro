package com.programacion.ExemploArrayList;

import java.util.Objects;

public class Producto {
    private int cod;
    private String nome;
    private String tipo;
    private float precio;
    private int stock;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return cod == producto.cod && Float.compare(producto.precio, precio) == 0 && stock == producto.stock && Objects.equals(nome, producto.nome) && Objects.equals(tipo, producto.tipo);
    }
}
