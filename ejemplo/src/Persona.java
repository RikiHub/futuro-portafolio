public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private int peso;
    private Genero sexo;

    public Persona(String nombre,int edad, double altura, int peso, Genero sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", sexo=" + sexo +
                '}';
    }

    public void mayorDeEdad(Persona p){
        if (edad > 17){
            System.out.println(nombre + " mayor de edad");
            boolean mayor = true;
        }
        else{
            System.out.println(nombre + " menor de edad");
            boolean mayor = false;
        }

    }
}
