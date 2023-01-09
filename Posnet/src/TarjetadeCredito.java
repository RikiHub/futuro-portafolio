public class TarjetadeCredito {
    private entidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String numero;
    private double saldo;
    private Persona titular;

    public TarjetadeCredito(entidadFinanciera entidadFinanciera, String entidadBancaria, String numero, double saldo, Persona titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
