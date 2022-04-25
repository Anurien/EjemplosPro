package com.programacion.ExemploXenerica;

public class EjemploXenerica {
    public static void main(String[] args) {
        /*ClaseXenerica<Integer> obx = new ClaseXenerica<Integer>(5);
        System.out.println(obx.toString());
        Alumno al = new Alumno("Brais",25);
        ClaseXenerica<Alumno> alu = new ClaseXenerica<>(al);
        System.out.println(alu.toString());*/
        ClaseXenerica<Integer> obx = new ClaseXenerica<Integer>();
        obx.setDato(8);
        System.out.println(obx.toString());
    }
}
