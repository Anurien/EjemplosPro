package com.programacion.ExamploTaboa;

import com.programacion.ExemploArrayObxectos.LerDatos;

public class ExTaboa {
    public static void main(String[] args) {
        int filas = LerDatos.lerInt("Numero de filas: ");
        int columnas = LerDatos.lerInt("Numero de columnas: ");
        int[][] taboa = new int[filas][columnas];
        String []set= {"1 set", "2 set","3 set", "4 set","5 set", "Puntos totais"};
        String[]nomes= {"Rafa    ", "Medneded"};
        taboa = MetodosTaboa.crear(taboa);
       // MetodosTaboa.amosar(taboa);
        //MetodosTaboa.amosarTaboaCompleta(taboa,set,nomes);
       // MetodosTaboa.sumarPuntos(taboa);
        MetodosTaboa.amosarTaCompletaConSumas(taboa,set,nomes);

    }
}
