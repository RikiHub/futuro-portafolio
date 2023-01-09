package Seleccion_Futbol;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    String nombreSeleccion;
    char grupo;
    boolean clasificaCuartosFinal;

    void Clasificado (){
        if (clasificaCuartosFinal){
            System.out.println(nombreSeleccion + " esta clasificado");
        } else {
            System.out.println("No clasifico");
        }
    }
    void imprimirSeleccion (){
        System.out.println(nombreSeleccion);
        System.out.println(grupo);
    }



    public static void main(String[] args) {
        Seleccion seleccion = new Seleccion();
        seleccion.nombreSeleccion = "Argentina";
        seleccion.grupo = 'C';
        seleccion.clasificaCuartosFinal = false;

        seleccion.imprimirSeleccion();
        seleccion.Clasificado();

        /*System.out.println(seleccion.nombreSeleccion);
        System.out.println(seleccion.grupo);
        System.out.println(seleccion.Clasificacion());*/

        /*for (int i=1; i<11;i++){
            System.out.println("Asiento # " + i);
        }*/

        int j=1;
        while (j<11){
            System.out.println("Asiento #" + j);
            j++;
        }

        //API
        List<String> Seleccion= new ArrayList<>();
        Seleccion.add("Alemania");
        Seleccion.add(seleccion.nombreSeleccion);

        System.out.println(Seleccion);

    }
}
