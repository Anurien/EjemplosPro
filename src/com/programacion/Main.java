package com.programacion;

public class Main {

    public static void main(String[] args) {
        MetodosExcepciones obxExcepciones = new MetodosExcepciones();
        // obxExcepciones.divisionSenExcepcion();
        //obxExcepciones.divisionConCondicional();
        obxExcepciones.divisionCapturaExcepcion();
        try {
            obxExcepciones.divisionPropagarExcepcion();
        } catch (ArithmeticException exception) {
            System.out.println("Erro 2" + exception.getMessage());
        }
        System.out.println("Fin del programa");
    }
}
