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
public class Estudiante extends Persona {

    private String universidad;
    private double semestre;
    
    @Override
    public void imprimirPersona() {
        // super.imprimirPersona();
      //  System.out.println("El nombre del estudiante es: " + super.obtenerNombre());
        System.out.println("El nombre del estudiante es: " + this.nombreProtegido);
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        double salario = this.getSalario() - semestre;
        System.out.println("El salario de estudiante es: " + salario);
                //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
