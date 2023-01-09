import com.sun.security.ntlm.Client;

import java.util.Date;

public class OrdenCompra extends Producto {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Client cliente;
    private String[] productos = new String[4];

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdentificador() {
        return identificador++;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Client getCliente() {
        return cliente;
    }

       public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
/*    public void addProducto(Producto){
        productos[] = Producto;
    }
    public int granTotal(precio producto){
        return precio*producto;
    }
*/
}
