package com.programacion.ExemploArrayObxectos;

import javax.swing.*;

public class Metodos {

    public static Alumnado[] crearArray(Alumnado[] listaAlumnos) {
        for (int i = 0; i < listaAlumnos.length; i++) {
            listaAlumnos[i] = new Alumnado(LerDatos.lerString("Nome: "), LerDatos.lerFloat("Nota: "));
        }
        /* for(int i = 0; i < listaAlumnos.length; i++){
            listaAlumos[i]= new Alumnado(LerDatos.lerString("nome: "), LerDatos.lerFloat("nota: "));
        }*/
        return listaAlumnos;
    }

    public static void amosarArray(Alumnado[] listaAlumnos) {
        //for (int i = 0; i < listaAlumnos.length; i++) {
        //  System.out.println("Nome: " + listaAlumnos.toString() + " --> " );
        //}
        for (Alumnado al : listaAlumnos) {
            JOptionPane.showMessageDialog(null, al);
        }
        //Tamen JOptionPane.showMessageDialog(null, listaAlumnos);

    }

    public static int buscarArray(Alumnado[] listaAlumnos) {
        String alumBuscar = JOptionPane.showInputDialog("Teclea nome a buscar");
        int atopado = 0; //non está
        int posicion = 0;
        for (int i = 0; i < listaAlumnos.length; i++) {
            listaAlumnos[i] = new Alumnado();
            if (alumBuscar.equals(listaAlumnos[i])) {
                System.out.println(("A nota de " + alumBuscar + " é " + listaAlumnos[i]));
                posicion = i;
                atopado = 1;
                break;
            }
        }
        if (atopado == 0) {
            System.out.println("non está");
            posicion = -1;
        }
        return posicion;
    }

    public static Alumnado[] ordenarLista(Alumnado[] listaAlumnos) {
        Alumnado aux;
        String aux2;
        for (int i = 0; i < listaAlumnos.length - 1; i++) {
            for (int j = i + 1; j < listaAlumnos.length; j++) {
                if (listaAlumnos[i].equals(listaAlumnos[j])) {
                    aux = listaAlumnos[i];
                    listaAlumnos[i] = listaAlumnos[j];
                    listaAlumnos[j] = aux;
                }
            }
        }
        return listaAlumnos;
    }
}

