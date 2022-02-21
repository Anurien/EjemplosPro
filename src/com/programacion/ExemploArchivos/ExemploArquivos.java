package com.programacion.ExemploArchivos;

import com.programacion.ExemploArchivos.EscrituraFichero.Escritura;
import com.programacion.ExemploArchivos.LecturaFichero.Lectura;

import java.io.File;
import java.io.FileWriter;

public class ExemploArquivos {
    public static void main(String[] args) {
        Lectura lec = new Lectura();
       /* File f = new File("Nomes.txt"); //porque está en el directorio raiz
        File fic = new File("/home/dam1/Escritorio/numeros.txt");
        lec.lerNome(f);
        lec.lerLiña(fic);
        lec.lerConDelimitador(f, LerDatos.lerString("escolle delimitador"));
        lec.lerLiña(f);*/
        File fi = new File("xogador.txt");
        lec.lerObxectos(fi, "\\s*,\\s*");
        Escritura esc = new Escritura();
        // esc.escribirmosNumeros("numEnteiros.txt");
       /* esc.engadirNumeros("numEnteiros.txt");
        esc.escribirBuffer("nomesBuffer.txt");*/
        //  esc.escribirObxectos("escribirXogadores.txt");
        File fi1 = new File("escribirXogadores.txt");
        lec.lerObxectos(fi1, "\\s*,\\s*");
    }

}
