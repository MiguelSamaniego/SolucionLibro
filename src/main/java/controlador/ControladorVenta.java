/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Libro;
import modelo.Venta;

/**
 *
 * @author pcuser
 */
public class ControladorVenta {
     private List<Venta> listaLibrosImpresos;
     
    public ControladorVenta( ) {
        listaLibrosImpresos= new  ArrayList<>();
        
    }

    public ControladorVenta(List<Venta> listaLibrosImpresos) {
        this.listaLibrosImpresos = listaLibrosImpresos;
    }


    
    public boolean crear(Venta ld){
        return listaLibrosImpresos.add(ld);
    }
    
    public boolean elimiar(Venta ld){
        return listaLibrosImpresos.remove(ld);
    }
    
    public Venta buscar(int codigo){
        for (Venta librodigital : listaLibrosImpresos) {
            if (librodigital.getCodigo()== codigo){
                return librodigital;
            }
        }
        return null;
    }
    
    public void modificar(Venta c, Venta cNuevo){
        Venta c1= buscar(c.getCodigo());
        listaLibrosImpresos.set(c.getCodigo(), cNuevo);
        
        
    }
    
    public String IntentarVenta(int codigo,Cliente cliente,Libro libro,double precio,  double precioFinal){
        if (cliente.getCredito()< libro.precioComision()){
            return "El cliente no tiene suficiente credito" ;
        }else{
            var venta = new Venta(codigo, cliente, libro, precio, precioFinal);
            crear(venta);
            
            return venta.toString();
        }
    }

    public List<Venta> getListaLibrosImpresos() {
        return listaLibrosImpresos;
    }

    public void setListaLibrosImpresos(List<Venta> listaLibrosImpresos) {
        this.listaLibrosImpresos = listaLibrosImpresos;
    }

    

}
