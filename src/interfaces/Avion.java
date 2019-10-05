/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author s109e19
 */
public class Avion implements Voladores, Trasportador{

    @Override
    public void despegar() {
        System.out.println("Despegando AVION...");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando AVION");
    }

    @Override
    public boolean servirComida() {
        System.out.println("En el AVION si reparten comida.");
        return true;
    }

    @Override
    public void volar() {
        System.out.println("Volando AVION");
    }

    @Override
    public boolean horarioCumplido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidadPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double cantidadCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
