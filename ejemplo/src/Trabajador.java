public class Trabajador extends Persona {
    private double id;
    private String centroTrabajo;
    private int aniosExperiencia;

    public Trabajador(String nombre, int edad, double altura, int peso, Genero sexo) {
        super(nombre, edad, altura, peso, sexo);
    }

    public Trabajador(String nombre, int edad, double altura, int peso, Genero sexo, double id, String centroTrabajo, int aniosExperiencia) {
        super(nombre, edad, altura, peso, sexo);
        this.id = id;
        this.centroTrabajo = centroTrabajo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(String centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void mayorDeEdad(Persona p) {
        if (getEdad() > 17){
            System.out.println("puede trabajar");
        }
        else {
            System.out.println("no puede trabajar");
        }
    }
}
