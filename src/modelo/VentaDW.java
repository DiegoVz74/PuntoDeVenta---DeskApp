/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class VentaDW {
    @JsonProperty("_id")
    public String _id;

    @JsonProperty("fecha")
    private String fecha;

    @JsonProperty("hora")
    private String hora;

    @JsonProperty("vendedor")
    public Usuario vendedor;

    @JsonProperty("sucursal")
    private String sucursal;
    
    @JsonProperty("productos")
    private ArrayList<Producto> productos;

    @JsonProperty("total")
    private double total;

    @JsonProperty("subtotal")
    private double subtotal;

    @JsonProperty("iva")
    private double iva;

    @JsonProperty("ventasState")
    private boolean ventasState;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public boolean isVentasState() {
        return ventasState;
    }

    public void setVentasState(boolean ventasState) {
        this.ventasState = ventasState;
    }

   

}
