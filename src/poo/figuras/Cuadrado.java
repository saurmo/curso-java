/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.figuras;

/**
 *
 * @author s109e19
 */
public class Cuadrado extends Figura {

    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    

    @Override
    public String obtenerNombre() {
        return super.getNombre() + " es de tipo Cuadrado.";
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerVolumen() {
        return 0;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerArea() {
        return this.lado * this.lado;
//To change body of generated methods, choose Tools | Templates.
    }

}
