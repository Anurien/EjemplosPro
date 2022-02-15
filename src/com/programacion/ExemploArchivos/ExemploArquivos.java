package com.programacion.ExemploArchivos;

import java.io.File;

public class ExemploArquivos {
    public static void main(String[] args) {
        Lectura lec = new Lectura();
        File fic = new File("Nomes.txt"); //porque está en el directorio raiz
        lec.lerLiña(fic);
    }
}
