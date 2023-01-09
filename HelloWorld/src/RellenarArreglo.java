import java.util.Scanner;

public class RellenarArreglo {                  //Rellenar Arreglo de cadenas
    public static void main(String[] args) {
        System.out.println("Cuantos miembros posee su familia?");
        Scanner miembros = new Scanner(System.in);
        int n = miembros.nextInt();
        String[] familia = new String[n];
        System.out.println(familia.length);
        String nombres;
        Scanner names = new Scanner(System.in);
        //System.out.println("recibe = " + recibe);
        for (int b = 0; b < familia.length; b++) {
            System.out.println("Introduzca los nombres de los integrantes de su familia: ");
            nombres = names.next();
            familia [b] = nombres;
            }
        System.out.println("Miembros de la familia: ");
        for (int c=0; c < familia.length; c++){
            System.out.println(familia[c]);
        }

    }
}
