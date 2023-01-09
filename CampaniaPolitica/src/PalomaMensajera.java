public class PalomaMensajera extends Ave implements EnviadorDeMensaje {
    public void volarRapido(){
        System.out.println("volando rapido");
    }
    @Override
    public void enviarMensaje(String mess) {
        volarRapido();
        System.out.println("Llevando mensaje " + mess);
    }
}
