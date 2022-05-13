/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.LibroImpreso;

/**
 *
 * @author pcuser
 */
public class ControladorLibroImpreso {
     private List<LibroImpreso> listaLibrosImpresos;

    public ControladorLibroImpreso() {
        listaLibrosImpresos= new ArrayList<>();
    }

    public ControladorLibroImpreso(List<LibroImpreso> listaLibrosDigitales) {
        this.listaLibrosImpresos = listaLibrosDigitales;
    }

 

  
    
    public boolean crear(LibroImpreso ld){
        return listaLibrosImpresos.add(ld);
    }
    
    public boolean elimiar(LibroImpreso ld){
        return listaLibrosImpresos.remove(ld);
    }
    
    public LibroImpreso buscar(int codigo){
        for (LibroImpreso librodigital : listaLibrosImpresos) {
            if (librodigital.getCodigo()== codigo){
                return librodigital;
            }
        }
        return null;
    }
    
    public void modificar(LibroImpreso c, LibroImpreso cNuevo){
         
      LibroImpreso c1= buscar(c.getCodigo());
        int posicion=0;
        for (LibroImpreso listaCliente : listaLibrosImpresos) {
            if(listaCliente.getCodigo()==c1.getCodigo()){
                //posicion=posicion+1;
                break;
            }
            posicion=posicion+1;
        }
        listaLibrosImpresos.set(posicion, cNuevo);
        
        
    }

    public List<LibroImpreso> getListaLibrosImpresos() {
        return listaLibrosImpresos;
    }

    public void setListaLibrosImpresos(List<LibroImpreso> listaLibrosImpresos) {
        this.listaLibrosImpresos = listaLibrosImpresos;
    }
        
    

    

    

}
