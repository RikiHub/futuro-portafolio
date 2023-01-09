import java.util.ArrayList;
import java.util.List;

public class CentroEducativo {
    private List<Alumno> alumnos = new ArrayList<>();


    public CentroEducativo() {}

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addAlumnos(Alumno e){
        this.alumnos.add(e);
    }

    public int cantAprobados(){
        int cant = 0;
        for (Alumno alumnos : alumnos){
            if(alumnos.Aprobo()){
                cant++;
            }
        }
        return cant;
    }
}
