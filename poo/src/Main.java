public class Main {
    public static void main(String[] args) {
        
        Automovil subaru = new Automovil("Subaru", "Impreza", "Gris", 2.0);
        System.out.println("El fabricante del auto es: " + subaru.getFabricante());

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);

        Automovil nissan = new Automovil("Nissan", "Skyline", "Azul y Gris", 3.2);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle() + '\n');

        System.out.println(subaru.acelerando(3500));
        System.out.println(mazda.frenando());

        System.out.println("El consumo del auto: " + subaru.getFabricante() + ' ' + subaru.calcularConsumo(300,0.6f));
        System.out.println("El consumo del auto: " + mazda.getFabricante() + ' ' + mazda.calcularConsumo(300, 60));

    }
}