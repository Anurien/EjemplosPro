package com.programacion.ExemploGUI;

import javax.swing.*;

public class Ventana2  extends JFrame {
    public void crearVentana2(){
        setTitle("Ventana2");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,50,600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
