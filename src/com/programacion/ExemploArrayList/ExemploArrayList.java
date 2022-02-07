package com.programacion.ExemploArrayList;

import com.programacion.ExemploArrayObxectos.Metodos;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
      /*  ArrayList listaNumeros = new ArrayList();
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(3.6);
        listaNumeros.add("*****");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        } */
        ArrayList<Integer> listaNumeros2 = new ArrayList<Integer>();
        listaNumeros2.add(1);
        listaNumeros2.add(2);
        listaNumeros2.add(3);
      /*  listaNumeros.add(3.6);
        listaNumeros.add("*****");
        Solo enteiros */
        MetodosArrayList.engadir(listaNumeros2);
        MetodosArrayList.amosar(listaNumeros2);
        MetodosArrayList.amosarIterator(listaNumeros2);
        listaNumeros2.remove(2);
        listaNumeros2.add(2, 4);
        MetodosArrayList.amosar(listaNumeros2);
        listaNumeros2.remove(listaNumeros2.indexOf(2));
        MetodosArrayList.amosar(listaNumeros2);
//Copiar
        // ArrayList<Integer> listaNumero = new ArrayList<Integer>(listaNumero2);
        //Clase producto atributos: cod int, nome String, tipo String; precio float, stock int.
        //Implementa a clase comercio que conteña os metodos agregar eliminar obter, buscar por codigo, tamaño(cantidade de productos)
    }
}
