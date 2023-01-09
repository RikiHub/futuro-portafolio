import java.util.ArrayList;
import java.util.List;

public class Centro {

    public int cantAprobados(List<Alumno> alumnos){

        List<Alumno> alumnosAprobados = new ArrayList<>();

        for (int i = 0; i < alumnos.size(); i++) {
            int examenesQueCumplen = 0;
            Alumno alumno = alumnos.get(i);
            for (int j = 0; j < alumno.getExamenes().size(); j++) {
                Examen examen = alumno.getExamenes().get(j);
                if(examen instanceof ExamenOral){
                    ExamenOral hijoOral = (ExamenOral) examen;
                    if(hijoOral.getNivelSatisfaccion() != NivelSatisfaccion.INSUFICIENTE){
                        examenesQueCumplen ++;
                    }
                }
                else{
                    ExamenEscrito hijoEscrito = (ExamenEscrito) examen;
                    if(hijoEscrito.getNota() >= 6 && hijoEscrito.getDuracion() < 90){
                        examenesQueCumplen ++;
                    }
                }
            }
            if(examenesQueCumplen == alumno.getExamenes().size()){
                alumnosAprobados.add(alumno);
            }
        }

        return alumnosAprobados.size();
    }
}
