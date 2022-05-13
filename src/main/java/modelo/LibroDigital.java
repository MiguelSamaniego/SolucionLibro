/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.logging.Logger;

/**
 *
 * @author pcuser
 */
public class LibroDigital extends Libro<LibroDigital>{

    public LibroDigital() {
    }

    public LibroDigital(int codigo, String titulo, String autor, String edicion, double precio) {
        super(codigo, titulo, autor, edicion, precio);
    }
   

    
    
    
    
   

    @Override
    public double precioComision() {
        double comision = 2.3;
        
      return comision;
    }

    @Override
    public double precioCalculado() {
       return this.precio;
    }
}
