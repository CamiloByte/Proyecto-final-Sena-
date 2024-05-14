/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

/**
 *
 * @author ccara
 */
public class ActualizaFactura {
    
    int id_factura;
    String id_recepcionista;
    String id_cliente;
    String fecha_desde;
    String fecha_hasta;
    String tipo_de_habitacion;
    float valor_habitacion;
    String productos_consumidos;
    float valor_productos;
    float valor_total;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getId_recepcionista() {
        return id_recepcionista;
    }

    public void setId_recepcionista(String id_recepcionista) {
        this.id_recepcionista = id_recepcionista;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public String getTipo_de_habitacion() {
        return tipo_de_habitacion;
    }

    public void setTipo_de_habitacion(String tipo_de_habitacion) {
        this.tipo_de_habitacion = tipo_de_habitacion;
    }

    public float getValor_habitacion() {
        return valor_habitacion;
    }

    public void setValor_habitacion(float valor_habitacion) {
        this.valor_habitacion = valor_habitacion;
    }

    public String getProductos_consumidos() {
        return productos_consumidos;
    }

    public void setProductos_consumidos(String productos_consumidos) {
        this.productos_consumidos = productos_consumidos;
    }

    public float getValor_productos() {
        return valor_productos;
    }

    public void setValor_productos(float valor_productos) {
        this.valor_productos = valor_productos;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    
}
