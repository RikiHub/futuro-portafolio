public class Main {
    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();

        Alumno pepe = new Alumno("123","Perez","Jose");
        Alumno ale = new Alumno("124","Lafourcade","Alejandro");
        Alumno ric = new Alumno("125", "Caballin","Ricardo");

        pepe.AgregarExamen(new ExamenEscrito("02/02/12",40,6));
        pepe.AgregarExamen(new ExamenOral("02/02/12",NivelSatisfaccion.Insuficiente));
        ric.AgregarExamen(new ExamenEscrito("02/02/12",65,8));
        ric.AgregarExamen(new ExamenOral("02/02/12",NivelSatisfaccion.Suficiente));
        ric.AgregarExamen(new ExamenOral("02/02/12",NivelSatisfaccion.Insuficiente));
        ale.AgregarExamen(new ExamenEscrito("02/02/12",80,6));
        ale.AgregarExamen(new ExamenOral("02/02/12",NivelSatisfaccion.Suficiente));

        c.addAlumnos(ale);
        c.addAlumnos(pepe);
        c.addAlumnos(ric);

        System.out.println("La cantidad de alumnos aprobados es: " + c.cantAprobados());
    }
}