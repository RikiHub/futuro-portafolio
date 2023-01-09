package com.ricardo;

public class Escenario {
    public static void main(String[] args) {
        LionelMessi messi = new LionelMessi();
        messi.correr();

        CristianoRonaldo cr7 = new CristianoRonaldo();
        cr7.correr();

        System.out.println("Datos de: " + (messi.nombre = "Messi"));
        System.out.println(messi.altura = 1.70);
        System.out.println(messi.edad = 34);
        messi.correr(true);

        System.out.println('\n' + "Datos de: " + (cr7.nombre = "Cristiano Ronaldo"));
        System.out.println(cr7.altura = 1.89);
        System.out.println(cr7.edad = 37);
        cr7.correr(true);
    }
}
