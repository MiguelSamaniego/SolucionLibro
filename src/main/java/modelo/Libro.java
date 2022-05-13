/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pcuser
 */
public abstract class Libro<L> {
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String edicion;
    protected double precio;

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, String edicion, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double precioComision();
    
    public abstract double precioCalculado();
    
    
    public double obtenerPrecio(){
    
        return precioComision()+precioCalculado();
} 
    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", precio=" + precio + '}';
    }

    
    
    
    
}
