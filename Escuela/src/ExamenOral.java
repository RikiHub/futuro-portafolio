public class ExamenOral extends Examen{
   private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(String fecha, NivelSatisfaccion nivelSatisfaccion) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    public NivelSatisfaccion getNivelSatisfaccion() {
        return nivelSatisfaccion;
    }

    public void setNivelSatisfaccion(NivelSatisfaccion nivelSatisfaccion) {
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean Aprobo(){
        return nivelSatisfaccion != NivelSatisfaccion.Insuficiente;
    }
}
