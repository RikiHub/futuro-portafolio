public class Perro extends Animales {
    private String raza;

    public Perro(String nombre, int edad, String vacuna, String genero, String raza) {
        super(nombre, edad, vacuna, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public void sonido() {
        System.out.println("Ladra");
    }
}
