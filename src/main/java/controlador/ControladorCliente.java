/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
/**
 *
 * @author pcuser
 */
public class ControladorCliente {
    private List<Cliente> listaClientes;

    public ControladorCliente() {
        listaClientes= new ArrayList<>();
    }

    public ControladorCliente(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public boolean crear(Cliente c){
        return listaClientes.add(c);
    }
    
    public boolean elimiar(Cliente c){
        return listaClientes.remove(c);
    }
    
    public Cliente buscar(int codigo){
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getCodigo()== codigo){
                return listaCliente;
            }
        }
        return null;
    }
    
    public void modificar(Cliente c, Cliente cNuevo){
        Cliente c1= buscar(c.getCodigo());
        listaClientes.set(c.getCodigo(), cNuevo);
        
        
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    
    
    
}
