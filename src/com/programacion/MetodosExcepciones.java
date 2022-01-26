package com.programacion;

import javax.swing.*;

public class MetodosExcepciones {
    public int pedirEntero() {
        int entero = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        return entero;
    }

    public void divisionSenExcepcion() {
        int numerador, denominador, resultado;
        numerador = pedirEntero();
        denominador = pedirEntero();
        resultado = numerador / denominador;
        System.out.println("Division= " + resultado);
    }

    public void divisionConCondicional() {
        int numerador, denominador, resultado;
        numerador = pedirEntero();
        denominador = pedirEntero();
        if (denominador == 0)
            System.out.println("no se puede dividir entre cero");
        else {
            resultado = numerador / denominador;
            System.out.println("Division= " + resultado);
        }
    }

    public void divisionCapturaExcepcion() {
        int numerador, denominador, resultado;
        numerador = pedirEntero();
        denominador = pedirEntero();
        try {
            resultado = numerador / denominador;
            System.out.println("Division= " + resultado);
        }
        //catch(ArithmeticException exception){
        // System.out.println("Error 1 "+exception.toString());
        //}
        catch (Exception exception) {
            System.out.println("Error 1" + exception.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre");
        }
        System.out.println("Termina el programa");
    }

    public void divisionPropagarExcepcion() throws ArithmeticException {
        int numerador, denominador, resultado;
        numerador = pedirEntero();
        denominador = pedirEntero();
        if (denominador == 0) {
            throw new ArithmeticException("Ojo no se puede dividir entre cero");
        } else {
            resultado = numerador / denominador;
            System.out.println("Division= " + resultado);
        }
    }
}
