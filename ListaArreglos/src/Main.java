import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


/*        String [] a = new String[9];

        a[3] = "Pepe";

        List<String> c = new ArrayList<>();
        List<String> b = new LinkedList<>();


        c.add("Pepe");
        c.add("Pepe");
        c.add("Pepe");
        c.add("Pepe");
        c.add("Pepe");
        c.add(5, "ALejandro");

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }*/

        ArrayList<String> nombreArrayList = new ArrayList<String>();
        nombreArrayList.add("Elemento"+0);
        nombreArrayList.add("Elemento"+1);
        nombreArrayList.add("Elemento"+2);
        nombreArrayList.add("Elemento"+0);
        int n=4;
        nombreArrayList.add(4,"Elemento"+4);

        for(int i=0;i<nombreArrayList.size();i++){
            System.out.println(nombreArrayList.get(i));
        }

        System.out.println(nombreArrayList.contains("Elemento2")); //Pregunta si existe un Elemento dentro de la lista
        System.out.println("***********************************************************************************");
        System.out.println(nombreArrayList.indexOf("Elemento2"));   //Imprime el primer indice en ele que aparece el elemento
        System.out.println("***********************************************************************************");
        System.out.println(nombreArrayList.size());
        System.out.println("***********************************************************************************");
        System.out.println(nombreArrayList.get(0)); //Imprime el elemento de la posicion 0 de la lista
        System.out.println("***********************************************************************************");
        System.out.println(nombreArrayList.lastIndexOf("Elemento0")); //Imprime el último índice en que aparece el elemento

        System.out.println(nombreArrayList.iterator());

    }
}