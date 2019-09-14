/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia;

/**
 *
 * @author s109e19
 */
public class Persona {

    private String nombre;
    protected String nombreProtegido;
    private int edad;
    private double salario;

    public Persona() {

    }

    public Persona(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.nombreProtegido = nombre;
    }

    /*
      public String obtenerNombre(){
        return this.nombre;
    }
    
    public void asignarNombre(String nombre){
        this.nombre =nombre;
        this.nombreProtegido =nombre;
    }
     */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

 

    public void imprimirPersona() {
        System.out.println("El nombre de la persona es: " + this.nombre);
    }
    
    public void calcularSalario(){
        
    }

    @Override
    public String toString() {
        return this.nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
