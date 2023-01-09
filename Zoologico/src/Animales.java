public abstract class Animales {
    protected String nombre;
    protected int edad;
    protected String vacuna;
    protected String genero;

    public Animales(String nombre, int edad, String vacuna, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.vacuna = vacuna;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public abstract void sonido();
}
