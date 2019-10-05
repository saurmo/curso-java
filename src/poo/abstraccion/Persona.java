/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abstraccion;

/**
 *
 * @author s109e19
 */
public abstract class Persona {

    private String nombre;
    protected String nombreProtegido;
    private int edad;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProtegido() {
        return nombreProtegido;
    }

    public void setNombreProtegido(String nombreProtegido) {
        this.nombreProtegido = nombreProtegido;
    }
    
    public abstract void imprimirPersona();
    
      public abstract void calcularSalario();

}
