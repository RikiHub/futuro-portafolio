public class Main {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p = new Persona("90050246129","Ricardo","Caballin","0972746335","caballiricardo@gmail.com");
        TarjetadeCredito t = new TarjetadeCredito(entidadFinanciera.CASTERMARD, "1234567890123456", "12345678", 15000, p);

        System.out.println("Tarjeta de crédito antes del pago: ");
        System.out.println(t);


    }
}