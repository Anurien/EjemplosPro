package com.programacion.ExemploInterfaces;

public class ExemploInterfaces {
    public static void main(String[] args) {
        //IDomestico obx1 = new IDomestico(); non podemos instanciar unha interface
        //Animal obx2 = new Animal(); non podemos instanciar obxetos dunha clase abstracta
        Gato obx3 = new Gato();
        obx3.falar();
        obx3.nombrar();
        //Instanciamos un Gato que referencia a Animal
        Animal obx4 = new Gato();
        obx4.falar();
        }


}
