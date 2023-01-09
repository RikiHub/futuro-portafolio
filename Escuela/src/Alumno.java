import java.util.ArrayList;
import java.util.List;

public class Alumno implements Aprobable{
    protected String dni;
    protected String apellido;
    protected String nombre;

    public Alumno() {
    }

    public Alumno(String dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }

    List<Examen> examenes = new ArrayList<>();

    public void AgregarExamen(Examen e){
        examenes.add(e);
    }
    @Override
    public boolean Aprobo(){
        int i = 0;
        while(i < this.examenes.size() && this.examenes.get(i).Aprobo()){
            i++;
        }
        if (this.examenes.size() == i) {
            return true;
        }else{
            return false;
        }
    }
}
