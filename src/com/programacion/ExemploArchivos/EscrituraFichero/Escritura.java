package com.programacion.ExemploArchivos.EscrituraFichero;

import com.programacion.ExemploArchivos.LecturaFichero.Lectura;
import com.programacion.ExemploArchivos.Xogador;

import java.io.*;
import java.util.ArrayList;

public class  Escritura {
    FileWriter fich;
    PrintWriter escribir;
    BufferedWriter bf;
    Xogador x;

    public void escribirmosNumeros(String nomeFichero) {
        try {
            fich = new FileWriter(nomeFichero, false);//si se le pone false o nada es para escribir asi que te borra lo que tengas
            escribir = new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            System.out.println("Fichero creado con exito");

        } catch (IOException e) {
            System.out.println("error escritura 1" + e.getMessage());
        } finally {
            escribir.close();
        }
    }


    public void engadirNumeros(String nomeFichero) {
        try {
            fich = new FileWriter(nomeFichero, true);//si se le pone false o nada es para escribir asi que te borra lo que tengas
            escribir = new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            System.out.println("Añadido con exito");

        } catch (IOException e) {
            System.out.println("error escritura 2" + e.getMessage());
        } finally {
            escribir.close();
        }
    }

    public void escribirBuffer(String nomeFich) {
        try {
            fich = new FileWriter(nomeFich);
            bf = new BufferedWriter(fich);
            bf.write("aaaaa");
            bf.write("bbbbb");
            bf.write("ccccc");
            bf.write("ddddd");
            bf.close();
            System.out.println("arquivo creado");
        } catch (IOException e) {
            System.out.println("error escritura 2" + e.getMessage());
        }finally {
            try {
                fich.close();
            } catch (IOException e) {
                System.out.println("no se pudo cerrar el archivo");
            }
        }
    }
    public void escribirObxectos (String nomeFich){
        try {
            fich = new FileWriter(nomeFich);
            escribir = new PrintWriter(nomeFich);
            x = new Xogador("aaaa",111);
            escribir.println(x);
            escribir.println(new Xogador("bbbb", 222));
            x = new Xogador("cccc",333);
            escribir.println(x.getNome()+","+x.getDorsal());
        } catch (IOException e) {
            System.out.println("Error escritura 3"+e.getMessage());
        }finally {
            escribir.close();
            try {
                fich.close();
            } catch (IOException e) {
                System.out.println("que no se pudo cerrar");
            }
        }
    }
    public void escribirObxectos1 (String nomeFich, File fichero){
        try {
            Lectura lectura = new Lectura();
            ArrayList<Xogador>lista = lectura.lerObxectos(fichero,",");
            fich = new FileWriter(nomeFich);
            escribir = new PrintWriter(nomeFich);
            //Xogador x;
            for(Xogador x: lista){
                escribir.println(x.getNome());
            }
        } catch (IOException e) {
            System.out.println("Error escritura 3.1"+e.getMessage());
        }finally {
            escribir.close();
            try {
                fich.close();
            } catch (IOException e) {
                System.out.println("que no se pudo cerrar");
            }
        }
    }
}
