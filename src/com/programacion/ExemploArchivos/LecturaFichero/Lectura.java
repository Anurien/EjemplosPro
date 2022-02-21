package com.programacion.ExemploArchivos.LecturaFichero;

import com.programacion.ExemploArchivos.Xogador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura {
    Scanner sc;

    public void lerLiña(File fich) {
        String nom;
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                nom = sc.nextLine();
                System.out.println(nom);
            }
        } catch (FileNotFoundException e) {
            System.out.println("error " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void lerNome(File fich) {
        try {
            sc = new Scanner(fich);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("erro2 " + e.toString());
        } finally {
            sc.close();
        }
    }

    public void lerConDelimitador(File fich, String delimitador) {
        try {
            sc = new Scanner(fich).useDelimiter(delimitador);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("erro3 " + e.toString());
        } finally {
            sc.close();
        }
    }

    public void amosarPares(File fich) {
        String cadena;
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                cadena = sc.nextLine();
                String[] lista = cadena.split(",");
                for (int i = 0; i < lista.length; i++) {
                    if (Integer.parseInt(lista[i]) % 2 == 0)
                        System.out.println(lista[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error 4" + ex.getMessage());
        } finally {
            sc.close();

        }
    }

    public ArrayList<Xogador> lerObxectos(File fich, String delimitador) {
        ArrayList<Xogador>lista = new ArrayList<Xogador>();
        Xogador xo;
        try {
            String cadea;
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                cadea = sc.nextLine();
                String[]linea=cadea.split(delimitador);
                xo= new Xogador(linea[0],Integer.parseInt(linea[1])); //se tiene que instanciar aqui dentro para que no sobrescriba el mismo espacio
                lista.add(xo);
               // System.out.println(cadea);
                //System.out.println(sc.nextLine());
            }
            for(Xogador x:lista){
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            System.out.println("erro 5" + e.getMessage());
        } finally {
            sc.close();
        }
        return lista;

    }
}
