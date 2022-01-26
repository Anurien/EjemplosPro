package com.programacion.ExamploTaboa;

import com.programacion.ExemploArrayObxectos.LerDatos;

public class MetodosTaboa {
    public static int[][] crear(int[][] taboa) {
        for (int fila = 0; fila < taboa.length; fila++) {
            for (int columna = 0; columna < taboa[fila]; columna++) {
                taboa[fila][columna] = LerDatos.lerInt("filas");
            }
        }
        return taboa;
    }
}
