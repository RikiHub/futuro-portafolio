public class EjemploOrdenes {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Catedral", "Gasa Esterilizada", 10000 ); 
        Producto producto2 = new Producto("Catedral", "Venda elastica", 8000);
        Producto producto3 = new Producto("Catedral", "Ibuprofeno_400G", 10000);
        Producto producto4 = new Producto("Catedral","Cefalexina", 12000);
        Producto producto5= new Producto("Catedral", "Loratadine", 7000);
        Producto producto6 = new Producto("Catedral", "Acido Fólico", 4000);
        Producto producto7 = new Producto("Catedral", "Sales de Rehidratación", 10000 );
        Producto producto8 = new Producto("Catedral", "Amprasolán", 8000);
        Producto producto9 = new Producto("Catedral", "Aspirina", 10000);
        Producto producto10 = new Producto("Catedral","Dipirona", 12000);
        Producto producto11 = new Producto("Catedral", "Diphenhydramine", 7000);
        Producto producto12 = new Producto("Catedral", "Leche Magnesia", 4000);
        
        Cliente cliente1 = new Cliente("Ricardo", "Caballin");
        Cliente cliente2 = new Cliente("Yilena", "Rodriguez");
        Cliente cliente3 = new Cliente("Alejandro", "Lafourcade");

        System.out.println("cliente3 = " + cliente3.getNombre() + ' ' + cliente3.getApellido());

        OrdenCompra orden1 = new OrdenCompra(" ");
        OrdenCompra orden2 = new OrdenCompra(" ");
        OrdenCompra orden3 = new OrdenCompra(" ");

    }

}