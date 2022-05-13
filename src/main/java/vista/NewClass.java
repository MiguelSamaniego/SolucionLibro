/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.LibroImpreso;
import modelo.Libro;
import modelo.Cliente;
import modelo.LibroDigital;
import modelo.LibroImpreso;
import modelo.Venta;
import controlador.ControladorCliente;
import controlador.ControladorLibroDigital;
import controlador.ControladorLibroImpreso;
import controlador.ControladorVenta;

/**
 *
 * @author pcuser
 */
public class NewClass {

    public static void main(String[] args) {
        ControladorCliente controladorCliente = new ControladorCliente();
        ControladorLibroDigital controladorLibroDigital=new ControladorLibroDigital();
        ControladorLibroImpreso controladorLibroImpreso= new ControladorLibroImpreso();
        ControladorVenta controladorVenta = new ControladorVenta();
       
        
        var libroImpreso = new LibroImpreso(1, "titulo", " autor", "edicion", 2.30);
        var LibroDigital = new LibroDigital(2, "titulo", "autor", "edicion", 1.3);
        var cliente = new Cliente(1, "1400789721", "Miguel Angel Samaniego Calle", 200);

      
        
        
        System.out.println(controladorVenta.IntentarVenta(0, cliente, LibroDigital, LibroDigital.getPrecio(), LibroDigital.obtenerPrecio()));
        cliente.setCredito(cliente.getCredito()-LibroDigital.precioComision());
        
        System.out.println(controladorVenta.IntentarVenta(0, cliente, libroImpreso, libroImpreso.getPrecio(), libroImpreso.obtenerPrecio()));
        
        cliente.setCredito(cliente.getCredito()-libroImpreso.precioComision());
        
        

    }
}
