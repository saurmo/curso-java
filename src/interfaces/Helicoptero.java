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
public class Helicoptero implements Voladores {

    @Override
    public void despegar() {
        System.out.println("Despegando HELICOPTERO");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando HELICOPTERO");
    }

    @Override
    public boolean servirComida() {
        System.out.println("En el HELICOPTERO NO sirven comida");
        return false;
    }

    @Override
    public void volar() {
        System.out.println("Volando HELICOPTERO");
    }
    
}
