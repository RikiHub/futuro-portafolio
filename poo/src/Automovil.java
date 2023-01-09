public class Automovil {

        private String fabricante;
        private String modelo;
        private String color;
        private double cilindrada;
        private int capacidadTanque = 40;

        public Automovil() {
        }

        public Automovil(String fabricante, String modelo){
                this.fabricante = fabricante;
                this.modelo = modelo;
        }
        public Automovil(String fabricante, String modelo, String color){
                this(fabricante, modelo);
                this.color = color;
        }
        public Automovil(String fabricante, String modelo, String color, Double cilindrada){
                this(fabricante, modelo, color);
                this.cilindrada = cilindrada;
        }
        public Automovil(String fabricante, String modelo, String color, Double cilindrada, int capacidadTanque){
                this(fabricante, modelo, color, cilindrada);
                this.capacidadTanque = capacidadTanque;
        }
        public String getFabricante() {
                return fabricante;
        }

        public String getModelo() {
                return modelo;
        }

        public String getColor() {
                return color;
        }

        public double getCilindrada() {
                return cilindrada;
        }

        public int getCapacidadTanque() {
                return capacidadTanque;
        }

        public String detalle(){

                return "\nfabricante = " + this.fabricante +
                        "\nmodelo = " + this.modelo +
                        "\ncolor = " + this.color +
                        "\ncilindrada = " + this.cilindrada;

        }
        public String acelerando(int rpm){
                return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
        }

        public String frenando(){
                return "El auto " + this.fabricante+ " " + this.modelo + " frenando...";
        }

        public float calcularConsumo(int km, float porcentajeBencina){
                return km/(capacidadTanque*porcentajeBencina);
        }

        public float calcularConsumo(int km, int porcentajeBencina){
                return km/capacidadTanque*(porcentajeBencina/100f);
        }


}
