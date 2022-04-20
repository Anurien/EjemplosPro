package com.programacion.ExemploPolimorfismo;

import com.programacion.ExemploPolimorfismo.subclases.Empregado;
import com.programacion.ExemploPolimorfismo.subclases.Tenista;

public class EjemploPolimorf {
    public static void main(String[] args) {
        //Persoa p = new Persoa("per", 20);
        Empregado em = new Empregado("emp", 30, 1500f);
        Tenista te = new Tenista("ten", 18, 5);
        //System.out.println(p);
        System.out.println(em);
        System.out.println(te);
        //amosar(p);
        amosar(em);
        amosar(te);
    }

    public static void amosar(Persoa ob) {
        System.out.println(ob);
    }
}
