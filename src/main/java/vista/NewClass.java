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
import java.util.Scanner;

/**
 *
 * @author pcuser
 */
public class NewClass {

    public static void main(String[] args) {
        ControladorCliente controladorCliente = new ControladorCliente();
        ControladorLibroDigital controladorLibroDigital = new ControladorLibroDigital();
        ControladorLibroImpreso controladorLibroImpreso = new ControladorLibroImpreso();
        ControladorVenta controladorVenta = new ControladorVenta();
        Scanner teclado = new Scanner(System.in);
        System.out.println("_______________Comercio Electrónico De Libros ______________");
        System.out.println("Ingresa Datos del Libro");
        System.out.println("Ingresa un codigo:");
        var id = teclado.nextInt();
        System.out.println("Ingresa un Titulo:");
        var titulo = teclado.next();
        System.out.println("Ingresa un Autor:");
        var autor = teclado.next();
        System.out.println("Ingresa una Edicion:");
        var edicion = teclado.next();
        System.out.println("Ingresa El precio:");
        var precio = teclado.nextDouble();
        System.out.println("Seleciona el tipo de Libro");
        System.out.println("1: Para Libro Digital");
        System.out.println("2: Para Libro Impreso");
        var tipoLibro = teclado.nextInt();
        System.out.println("Ingrese los datos del Cliente");
        System.out.println("Ingrese el codigo");
        var idC = teclado.nextInt();
        System.out.println("ingrese la cedula");
        var cedula = teclado.next();
        System.out.println("Ingrese el NombreCompleto");
        var nombreC = teclado.next();
        System.out.println("Ingrese el credito");
        var credito = teclado.nextDouble();
        var cliente = new Cliente(idC, cedula, nombreC, credito);
        switch (tipoLibro) {
            case 1:
                var LibroDigital = new LibroDigital(id, titulo, autor, edicion, precio);

                System.out.println(controladorVenta.IntentarVenta(0, cliente, LibroDigital, LibroDigital.getPrecio(), LibroDigital.obtenerPrecio()));
                cliente.setCredito(cliente.getCredito() - LibroDigital.obtenerPrecio());
                break;
            case 2:
                var libroImpreso = new LibroImpreso(id, titulo, autor, edicion, precio);

                System.out.println(controladorVenta.IntentarVenta(0, cliente, libroImpreso, libroImpreso.getPrecio(), libroImpreso.obtenerPrecio()));
                cliente.setCredito(cliente.getCredito() - libroImpreso.obtenerPrecio());
                break;
            default:
                throw new AssertionError();
        }

    }
}
