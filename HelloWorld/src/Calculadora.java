import java.util.Scanner;

public class Calculadora {                                      //Calculadora simple con opcion de preguntar si o no.
    public static void main(String[] args) {
/*    String a = "Ricardito";
    String b = "Marilyn";
    String c = "Ricardo";
    String d = "Mima";
 } */
        Scanner T = new Scanner(System.in);
        char opc = 'y';
        while (opc == 'y') {
            for (boolean i = false; i == false && opc == 'y'; ) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese primer numero");
                int num1 = leer.nextInt();
                //System.out.println("num1 = " + num1);
                System.out.println("Ingrese el segundo numero");
                int num2 = leer.nextInt();
                //System.out.println("num2 = " + num2);

                System.out.println("Elija operacion: ");
                System.out.println("Sumar [1]");
                System.out.println("Restar [2]");
                System.out.println("Multiplicar [3]");
                System.out.println("Dividir [4]");
                System.out.println("Finalizar operaciones [5]");
                int operator = leer.nextInt();

                int resultado;
                if (operator == 1) {
                    resultado = num1 + num2;
                    System.out.println("resultado = " + resultado);
                }
                if (operator == 2) {
                    resultado = num1 - num2;
                    System.out.println("resultado = " + resultado);
                }
                if (operator == 3) {
                    resultado = num1 * num2;
                    System.out.println("resultado = " + resultado);
                }
                if (operator == 4) {
                    float num1F = num1;
                    float num2F = num2;
                    float resultadoDiv = num1F / num2F;
                    System.out.println("resultado = " + resultadoDiv);
                }
                if (operator == 5) {
                    i = true;
                    System.out.println("Fin de operaciones");
                }
                System.out.println("Desea realizar otra operacion: Y/N?");
                opc = T.next().charAt(0);
            }
        }
    }
}

