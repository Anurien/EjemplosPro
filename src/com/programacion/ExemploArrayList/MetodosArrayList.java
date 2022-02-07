package com.programacion.ExemploArrayList;

import com.programacion.ExemploArrayObxectos.LerDatos;

import java.util.ArrayList;
import java.util.Iterator;

public class MetodosArrayList {
    public static ArrayList<Integer> engadir(ArrayList<Integer> lista) {
        int v = LerDatos.lerInt("teclea numero");
        lista.add(new Integer(v));
        return lista;
    }

    public static void amosar(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void amosarIterator(ArrayList<Integer> lista) {
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer v = it.next();
            System.out.println("***" + v);
        }

    }
}
