package com.programacion.ExemploGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoClaseAnonima {
    JFrame marco;
    JPanel panel;
    JButton azul, verde;

    public void crearEventos() {
        marco = new JFrame();
        panel = new JPanel();
        azul = new JButton("Boton1");
        verde = new JButton("Boton2");

        marco.setBounds(100, 50, 650, 650);
        marco.setLocationRelativeTo(null);

        panel.setSize(600, 600);

        panel.add(azul);
        panel.add(verde);
        marco.add(panel);
        azul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.blue);
            }
        });
        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        });
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}
