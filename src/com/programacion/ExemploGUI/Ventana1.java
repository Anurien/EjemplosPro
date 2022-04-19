package com.programacion.ExemploGUI;

import javax.swing.*;

public class Ventana1 {
    JFrame marco;
    public void crearVentana1(){
        marco= new JFrame("Ventana1");
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setBounds(100,50,600,600);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }
}
