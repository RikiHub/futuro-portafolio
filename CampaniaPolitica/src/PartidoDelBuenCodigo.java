import java.util.ArrayList;

public class PartidoDelBuenCodigo {
    private ArrayList<EnviadorDeMensaje> mensajeros = new ArrayList<>();

    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(EnviadorDeMensaje mensajero){
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania(){
        for (EnviadorDeMensaje mensajero: mensajeros) {
            mensajero.enviarMensaje("vote por el CPGA");
        }
    }
}
