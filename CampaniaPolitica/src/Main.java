public class Main {
    public static void main(String[] args) {

        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();
        PalomaMensajera paloma = new PalomaMensajera();
        TelefonoMovil samsung = new TelefonoMovil();

        p.agregarMensajero(paloma);
        p.agregarMensajero(samsung);
        p.agregarMensajero(new PalomaMensajera());
        p.hacerCampania();

    }
}