package com.programacion.ExemploArray;

import javax.swing.*;

public class ExemploArray {
    public static void main(String[] args) {
        int opcion;
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos de la lista"));
        float[] notas = new float[elementos];
        MetodosArray obx1 = new MetodosArray();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Crear array \n2. Amosar array \n3. Buscar Elemento \n4. Ordenar elementos \n5. Copiar lista \n6. Borrar elemento \n7. Engadir elemento"));
            switch (opcion) {
                case 1:
                    notas = obx1.crearArray(notas);
                    break;
                case 2:
                    MetodosArray.amosarArray(notas);
                    break;
                case 3:
                    int pos = MetodosArray.buscarElemento(notas);
                    break;
                case 4:
                    MetodosArray.ordenarElementos(notas);
                    break;
                case 5:
                    notas = MetodosArray.copiarLista(notas);
                    break;
                case 6:
                    notas = MetodosArray.borrarElemento(notas);
                    break;
                case 7:
                    notas = MetodosArray.engadirElemento(notas);
                    break;
                case 8:
                    obx1.salir();
                    break;
                default:
                    System.out.println("***** Opcion incorrecta");


            }

        } while (opcion < 9);

    }
}

