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
public class Empleado extends Persona{
    
    private int antiguedad;

    @Override
    public void imprimirPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularSalario() {
        double salario = this.getSalario();
        System.out.println("El salario del empleado es:" + salario);
    }
}
