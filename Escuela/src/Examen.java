public abstract class Examen implements Aprobable{
    protected String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean Aprobo(){
        return true;
    }
}
