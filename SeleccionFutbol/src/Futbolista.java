public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void jugarPartido() {
        System.out.println(" juega partido");
    }

    //@Override
    public void Entrenamiento(){
        System.out.println(" entrena (clase Futbolista)");
    }

    //@Override
    public void PartidoFutbol(){
        System.out.println("Juega el partido de fútbol (Clase Futbolista)");
    }
}
