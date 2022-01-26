package com.programacion.ExemploInterfaces;

public interface IDomestico {
    // a interfaz pode ter tamen constantes
    void nombrar(); //esto es lo mismo que poner public abstract void nombrar
    public default void robotizar(){
        System.out.println("animal robotizado");
    }
}
