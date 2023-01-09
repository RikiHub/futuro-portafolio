import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> ciudadano = new ArrayList<>();

        Persona pepe;
        Persona riki;

        ciudadano.add(pepe = new Trabajador("Pepe",30,1.70,69, Genero.MASCULINO));
        ciudadano.add(riki = new Trabajador("Riki",15,1.69,65, Genero.MASCULINO));

        System.out.println(ciudadano.get(0));
        System.out.println(ciudadano.get(1));

        riki.mayorDeEdad(riki);
        pepe.mayorDeEdad(riki);
    }
}