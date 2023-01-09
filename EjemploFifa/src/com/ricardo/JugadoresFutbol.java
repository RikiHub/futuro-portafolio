package com.ricardo;

public abstract class JugadoresFutbol extends ConfederacionFutbol{
    int edad;
    double altura;
    String nombre;

    void correr (){
        System.out.println("Jugador corre");
    }
    void correr(boolean tieneBalon){
        System.out.println("Jugador corre mas lento");

    }
}
