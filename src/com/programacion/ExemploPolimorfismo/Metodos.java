package com.programacion.ExemploPolimorfismo;

import java.util.ArrayList;

public class Metodos {
    public static ArrayList<Persoa> engadir(ArrayList<Persoa> lista, Persoa p) {
        lista.add(p);
        return lista;
    }

    public static ArrayList<Persoa> amosar1(ArrayList<Persoa> lista) {
        for (Persoa l : lista) {
            System.out.println(l);
        }
        return lista;
    }
}
