package com.programacion.ExemploArrayObxectos;

import javax.swing.*;

public class LerDatos {
    public static float lerFloat(String mensaje) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return nota;
    }
    public static String lerString(String mensaje) {
        String nome = (JOptionPane.showInputDialog(mensaje));
        return nome;
    }
    public static int lerInt(String mensaje) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return nota;
    }
}
