/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pcuser
 */
public class Venta {
    private int codigo;
    private Cliente cliente;
    private Libro libro;
    private double precio;
    private double precioTotal;

    public Venta() {
    }

    public Venta(int codigo, Cliente cliente, Libro libro, double precio, double precioTotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.libro = libro;
        this.precio = precio;
        this.precioTotal = precioTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Venta{" + "codigo=" + codigo + ", cliente=" + cliente + ", libro=" + libro + ", precio=" + precio + ", precioTotal=" + precioTotal + '}';
    }
    
    
    
    
}
