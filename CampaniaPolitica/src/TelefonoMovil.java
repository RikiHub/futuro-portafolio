public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje{


    @Override
    public void enviarMensaje(String mess) {
        encender();
        System.out.println("SMS: " + mess);
    }
}
