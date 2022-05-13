/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pcuser
 */
public class Cliente {
    
    private int codigo;
    private String cedula;
    private String nombresCompletos;
    private double credito;

    public Cliente() {
    }

    public Cliente(int codigo, String cedula, String nombresCompletos, double credito) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombresCompletos = nombresCompletos;
        this.credito = credito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombresCompletos() {
        return nombresCompletos;
    }

    public void setNombresCompletos(String nombresCompletos) {
        this.nombresCompletos = nombresCompletos;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombresCompletos=" + nombresCompletos + ", credito=" + credito + '}';
    }
    
    
    
    
}
