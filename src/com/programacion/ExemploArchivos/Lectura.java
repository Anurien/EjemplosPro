package com.programacion.ExemploArchivos;

import java.io.File;
import java.io.FileNotFoundException;
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
        }
        finally {
            sc.close();
        }
    }
}
