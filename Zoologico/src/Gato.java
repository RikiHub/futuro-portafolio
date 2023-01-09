public class Gato extends Animales {

    public Gato(String nombre, int edad, String vacuna, String genero) {
        super(nombre, edad, vacuna, genero);
    }

    @Override
    public void sonido() {
        System.out.println("maulla");
    }
}
