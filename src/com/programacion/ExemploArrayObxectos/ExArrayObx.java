package com.programacion.ExemploArrayObxectos;

import javax.swing.*;

public class ExArrayObx {
    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos de la lista"));
        Alumnado listaAlumnos[] = new Alumnado[elementos];
        Alumnado alum1 = new Alumnado("aa", 5);
        Alumnado alum2 = new Alumnado("aa", 5);
        boolean res = (alum1 == alum2) ? true : false; //Forma abreviada del if/else
        Alumnado alum3= alum1;
        System.out.println(" == " + res);
        System.out.println("con equals " + alum1.equals(alum2)); //Equals se puede comparar Strings y objetos
        System.out.println("****** con equals " + alum3.equals(alum1));
        Metodos.crearArray(listaAlumnos);
        Metodos.amosarArray(listaAlumnos);
        //Metodos.ordenarLista(listaAlumnos);
        //Metodos.amosarArray(listaAlumnos);
        Metodos.buscarArray(listaAlumnos);
    }
}
