public abstract class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void Concentrarse(){
        System.out.println("Concentrarse");
    }

    public void Viajar(){
        System.out.println("Viajar");
    }

    public abstract void Entrenamiento();

    public void PartidoFutbol(){
        System.out.println("Asiste al partido de Futbol (Clase padre)");
    }
}
