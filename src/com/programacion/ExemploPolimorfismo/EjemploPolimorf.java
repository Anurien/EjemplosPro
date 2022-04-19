package com.programacion.ExemploPolimorfismo;

import com.programacion.ExemploPolimorfismo.subclases.Empregado;
import com.programacion.ExemploPolimorfismo.subclases.Tenista;

public class EjemploPolimorf {
    public static void main(String[] args) {
        Persoa p = new Persoa("per",20);
        Empregado em= new Empregado("emp",30,1500f);
        Tenista te = new Tenista("ten",18,5);
    }
}
