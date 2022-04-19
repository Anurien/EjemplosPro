package com.programacion.ExemploGUI;

import javax.swing.*;
import java.awt.*;

public class Componentes {
    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField lineaTexto;
    JButton boton1, boton2;
    public void crearComponentes(){
        marco= new JFrame();
        panel = new JPanel();
        etiqueta = new JLabel("Etiqueta");
        lineaTexto = new JTextField();
        boton1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        marco= new JFrame("Ventana");
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setBounds(100,50,650,650);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        panel.setSize(600,600);
        panel.setLayout(null);
        etiqueta.setBounds(50,20,100,50);
        lineaTexto.setBounds(150, 20,250,50);
        boton1.setBounds(300,500,100,50);
        boton1.setBackground(Color.PINK);
        boton2.setBounds(200,500,100,50);
        boton2.setToolTipText("Limpia el texto");

        panel.add(etiqueta);
        panel.add(lineaTexto);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
    }
}
