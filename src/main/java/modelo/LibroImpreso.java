/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pcuser
 */
public class LibroImpreso  extends Libro<LibroImpreso>{

    public LibroImpreso() {
        
        
    }

    public LibroImpreso(int codigo, String titulo, String autor, String edicion, double precio) {
        super(codigo, titulo, autor, edicion, precio);
    }

    @Override
    public double precioComision() {
       return this.precio*0.02;
    }

    @Override
    public double precioCalculado() {
       return this.precio+20;
    }
}
