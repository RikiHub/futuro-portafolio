public class Posnet {
    public static final double recargoPorCuota = 0.03;
    public static final int MIN_CAT_CUOTA = 1;
    public static final int MAX_CAT_CUOTA = 6;

    public Ticket efectuarPago(TarjetadeCredito tarjeta, double montoAbonar, int cuotas){
        Ticket elticket = null;
        if (cuotas > MIN_CAT_CUOTA && cuotas < MAX_CAT_CUOTA){
            if (cuotas == 1){
                elticket. = montoAbonar;
            }
        }

        return elticket;
    }
}
