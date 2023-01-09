public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void dirigirPartido(){
        System.out.println("Dirige el partido");
    }
    //@Override
    public void Entrenamiento(){
        System.out.println(" dirige el entrenamiento (Clase Entrenador)");
    }

    //@Override
    public void PartidoFutbol(){
        System.out.println(" dirige el partido de Futbol (clase Entrenador)");
    }
}
