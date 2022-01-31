package com.programacion.ExamploTaboa;

import com.programacion.ExemploArrayObxectos.LerDatos;

import javax.swing.*;

public class MetodosTaboa {
    public static int[][] crear(int[][] taboa) {
        for (int fila = 0; fila < taboa.length; fila++) {
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                taboa[fila][columna] = LerDatos.lerInt("valores enteiros");
            }
        }
        return taboa;
    }

    public static void amosar(int[][] taboa) {
        for (int fila = 0; fila < taboa.length; fila++) {
            System.out.println("\n");
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                System.out.print(taboa[fila][columna] + "  ");
            }
        }
    }

    public static void amosarTaboaCompleta(int[][] taboa, String[] set, String[] nomes) {
        for (int columna = 0; columna < set.length; columna++) {
            System.out.print("      " + set[columna]);
        }
        for (int fila = 0; fila < taboa.length; fila++) {
            System.out.print("\n" + nomes[fila] + "      ");
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                System.out.print(taboa[fila][columna] + "      ");
            }
        }
    }

    public static int[] sumarPuntos(int[][] taboa) {
        int suma = 0;
        int tam = LerDatos.lerInt("Tamaño array: ");
        int[] sumas = new int[tam];
        for (int fila = 0; fila < taboa.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                suma += taboa[fila][columna];
            }
            sumas[fila] = suma;
        }
        return sumas;
    }

    public static void amosarTaCompletaConSumas(int[][] taboa, String[] set, String[] nomes) {
        int[] total = MetodosTaboa.sumarPuntos(taboa);
        for (int columna = 0; columna < set.length; columna++) {
            System.out.print("      " + set[columna]);
        }
        for (int fila = 0; fila < taboa.length; fila++) {
            System.out.print("\n" + nomes[fila] + "      ");
            for (int columna = 0; columna < taboa[fila].length; columna++) {
                System.out.print(taboa[fila][columna] + "      ");
            }
            System.out.print("      "+total[fila]);
        }
    }
}
