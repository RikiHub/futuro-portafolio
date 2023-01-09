public class ExamenEscrito extends Examen{
    private static final int MIN_NOT = 0;
    private static final int MAX_NOT = 10;
    private static final int APROB_NOT = 6;
    private static final int MAX_T = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(String fecha, int duracion, int nota) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    boolean aprobado(boolean aprobar){
        if((duracion < 90) && nota > 5){
           aprobar = true;
        }
        return aprobar;
    }

    @Override
    public boolean Aprobo(){
        return nota >= APROB_NOT && duracion <= MAX_T;
    }
}
