package com.programacion.ExemploPolimorfismo;

import com.programacion.ExemploPolimorfismo.subclases.Empregado;
import com.programacion.ExemploPolimorfismo.subclases.Tenista;
import com.programacion.ExemploPolimorfismo.subclases1.subclases.Marinero;

import java.util.ArrayList;

public class EjemploPolimorf {
    public static void main(String[] args) {
        ArrayList<Persoa>lista = new ArrayList<>();
        //Persoa p = new Persoa("per", 20);
        Empregado em = new Empregado("emp", 30, 1500f);
        Tenista te = new Tenista("ten", 18, 5);
        Marinero ma = new Marinero("mar",50,6);
        //System.out.println(p);
        //System.out.println(em);
        //System.out.println(te);
        //amosar(p);
        //amosar(em);
        //amosar(te);
        Metodos.engadir(lista,em);
        //Metodos.amosar1(lista);
        Metodos.engadir(lista,te);
        //Metodos.amosar1(lista);
        Metodos.engadir(lista,ma);
        Metodos.amosar1(lista);
    }

    public static void amosar(Persoa ob) {
        System.out.println(ob);
    }
}
