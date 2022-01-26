package com.programacion.ExemploArray;

import javax.swing.*;
import java.util.Arrays;

public class MetodosArray {
    public float[] crearArray(float[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Float.parseFloat(JOptionPane.showInputDialog("Teclea nota"));
        }
        return lista;
    }

    public static void amosarArray(float[] lista) {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("1. for 1 \n2. for each \n3. clase Array"));
        switch (op) {
            case 1:
                for (int i = 0; i < lista.length; i++) {
                    JOptionPane.showMessageDialog(null, "Posicion " + i + " --> " + lista[i]);
                }
                break;
            case 2:
                for (float elemento : lista)
                    JOptionPane.showMessageDialog(null, "Posicion " + elemento);
                break;
            case 3:
                Arrays.toString(lista);
                break;
            default:
                System.out.println("opcion incorrecta");
        }
    }

    public static int buscarElemento(float[] lista) {
        float elebuscar = Float.parseFloat(JOptionPane.showInputDialog("Teclea nota a buscar"));
        int atopado = 0; //non está
        int posicion = 0;
        for (int i = 0; i < lista.length; i++) {
            if (elebuscar == lista[i]) {
                System.out.println((elebuscar + " está na lista"));
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

    public static void ordenarElementos(float[] lista) {
    /*    int aux;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    aux = (int) lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        } */
        Arrays.sort(lista);
    }

    public static float[] copiarLista(float[] lista) {
        Arrays.copyOf(lista, 8);
        return lista;
    }

    public static float[] borrarElemento(float[] lista) {
        int pos = MetodosArray.buscarElemento(lista);
        if (pos < 0)
            System.out.println("o elemento non está na lista");
        else {
            for (int i = pos; i < lista.length - 1; i++)
                lista[i] = lista[i + 1];
            lista = Arrays.copyOf(lista, lista.length - 1);
        }

        return lista;
    }

    public static float[] engadirElemento(float[] lista) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        float eleEngadir = Float.parseFloat(JOptionPane.showInputDialog("Teclea nota a engadir"));
        lista[lista.length - 1] = eleEngadir;

        return lista;
    }

    public void salir() {
        System.exit(0);
    }
}
