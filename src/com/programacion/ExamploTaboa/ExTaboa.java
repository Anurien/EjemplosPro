package com.programacion.ExamploTaboa;

import com.programacion.ExemploArrayObxectos.LerDatos;

public class ExTaboa {
    public static void main(String[] args) {
        int filas= LerDatos.lerInt("Numero de filas");
        int columnas = LerDatos.lerInt("Numero de columnas");
        int [][]taboa= new int [filas][columnas];
    }
}
