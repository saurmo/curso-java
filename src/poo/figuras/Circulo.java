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
public class Circulo extends Figura{

    private double  radio;
    private Punto puntoCentral;

    public Circulo() {
    }
    


    public Circulo(double radio, Punto puntoCentral) {
        this.radio = radio;
        this.puntoCentral = puntoCentral;
    }

    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public String obtenerNombre() {
      return super.getNombre() + " es de tipo Circulo " + puntoCentral;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerVolumen() {
       return 0;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
}
