package com.programacion.ExemploGUI;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DistribucionComponentes {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public void componentes(String tipo) {
        marco = new JFrame(tipo);
        panel = new JPanel();
        panel.setSize(600, 600);
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");

    }

    public void pecharVentana() {
        marco.setLocationRelativeTo(null); //Posición relativa en la pantalla (null = centro)
        marco.setVisible(true); //Hacer la ventana visible
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE); //Se cierra la aplicación
    }

    public void layout2() {
        this.componentes("FlowLayout");
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        this.pecharVentana();
    }

    public void disBoxLayout() {
        this.componentes("BoxLayout");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        this.pecharVentana();
    }

    public void disBorderLayout() {
        this.componentes("BorderLayout");
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.EAST);
        panel.add(boton4, BorderLayout.WEST);
        panel.add(boton5, BorderLayout.CENTER);
        this.pecharVentana();
    }

    public void disGridLayout() {
        this.componentes("BoxLayout");
        panel.setLayout(new GridLayout(3, 2));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        this.pecharVentana();
    }
}