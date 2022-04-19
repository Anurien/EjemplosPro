package com.programacion.ExemploGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoClaseInterna {
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
        azul.addActionListener(new EventoInterna());
        verde.addActionListener(new EventoInterna());
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    private class EventoInterna implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object o = event.getSource();
            if(o==verde)
                panel.setBackground(Color.green);
            else
                panel.setBackground(Color.BLUE);
        }

    }
}
