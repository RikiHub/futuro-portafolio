import java.util.*;

public class Main {
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
    private static Object String;

    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador(1,"Vicente","Del Bosque",57,"284EZ89");
        Futbolista iniesta = new Futbolista(2,"Andres","Iniesta",28,6,"Interior Derecho");
        Masajista raulMatinez = new Masajista(3,"Raul","Martinez",41,"Licenciado en Fisioterapia",18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMatinez);

        //Concentración
        System.out.print("Todos los integrantes comienzan una concentración (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print("\n"+integrante.getNombre()+" "+integrante.getApellido()+" -> ");
            integrante.Concentrarse();
            }
        //Viajar
        System.out.print("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.print("\n"+integrante.getNombre()+" "+integrante.getApellido()+" -> ");
            integrante.Viajar();
            }

        //Entrenar
/*      System.out.println("Todos los integrantes participan en el entrenamiento");
        System.out.println(delBosque.getNombre()+" "+delBosque.getApellido()+"->");
        delBosque.Entrenamiento();
        System.out.println(iniesta.getNombre()+" "+iniesta.getApellido()+"->");
        iniesta.Entrenamiento();
        System.out.println(raulMatinez.getNombre()+" "+raulMatinez.getApellido()+"->");
        raulMatinez.Entrenamiento();

    //Entrenamiento
        System.out.print("Todos los integrantes participan en el entrenamiento (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print("\n"+integrante.getNombre()+" "+integrante.getApellido()+" -> ");
            integrante.Entrenamiento();
            }

        //Partido Futbol
        System.out.print("Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print("\n"+integrante.getNombre()+" "+integrante.getApellido()+" -> ");
            integrante.PartidoFutbol();
            }

        //Masaje
        System.out.println("Masaje: solamente el masajista y el futbolista participan en el masaje");
        System.out.println(raulMatinez.getNombre()+" "+raulMatinez.getApellido()+" -> ");
        raulMatinez.darMasaje();

        //Partido Futbol
        System.out.println("Partido de Futbol: Todos los integrantes pueden asistir (no es obligatorio para todos)");
        System.out.println(delBosque.getNombre()+" "+delBosque.getApellido()+"->");
        delBosque.PartidoFutbol();
        System.out.println(iniesta.getNombre()+" "+iniesta.getApellido()+"->");
        iniesta.PartidoFutbol();
        System.out.println(raulMatinez.getNombre()+" "+raulMatinez.getApellido()+"->");
        raulMatinez.PartidoFutbol();
 */
        List numero1 = new ArrayList();
        numero1.add("+5354962759");
        numero1.add("Ricardito");
        numero1.add("+5354962766");
        numero1.add("Mima");
        Map<Object,String> directorio = new HashMap<Object, java.lang.String>();
        directorio.get(numero1);
        System.out.println(directorio);
    }
}

