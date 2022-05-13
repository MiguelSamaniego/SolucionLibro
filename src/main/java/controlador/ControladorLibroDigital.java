/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.LibroDigital;

/**
 *
 * @author pcuser
 */
public class ControladorLibroDigital {
     private List<LibroDigital> listaLibrosDigitales;

    public ControladorLibroDigital() {
        listaLibrosDigitales = new ArrayList<>();
    }

    public ControladorLibroDigital(List<LibroDigital> listaClientes) {
        this.listaLibrosDigitales = listaClientes;
    }

  
    
    public boolean crear(LibroDigital ld){
        return listaLibrosDigitales.add(ld);
    }
    
    public boolean elimiar(LibroDigital ld){
        return listaLibrosDigitales.remove(ld);
    }
    
    public LibroDigital buscar(int codigo){
        for (LibroDigital librodigital : listaLibrosDigitales) {
            if (librodigital.getCodigo()== codigo){
                return librodigital;
            }
        }
        return null;
    }
    
    public void modificar(LibroDigital c, LibroDigital cNuevo){
      LibroDigital c1= buscar(c.getCodigo());
        int posicion=0;
        for (LibroDigital listaCliente : listaLibrosDigitales) {
            if(listaCliente.getCodigo()==c1.getCodigo()){
                //posicion=posicion+1;
                break;
            }
            posicion=posicion+1;
        }
        listaLibrosDigitales.set(posicion, cNuevo);
        
        
    }

    public List<LibroDigital> getListaClientes() {
        return listaLibrosDigitales;
    }

    public void setListaClientes(List<LibroDigital> listaClientes) {
        this.listaLibrosDigitales = listaClientes;
    }

   
    
}
