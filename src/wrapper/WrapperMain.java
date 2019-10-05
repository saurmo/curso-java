/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

import java.util.ArrayList;

/**
 *
 * @author s109e19
 */
public class WrapperMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Wrappers ");

        // double de tipo primitivo
        double saldo = 5000.00;

        //Objeto de tipo Double
        Double wrapperSaldo = new Double("500.99");
        boolean isNan = wrapperSaldo.isNaN();
        int intSaldo = wrapperSaldo.intValue();
        System.out.println("Is nan " + isNan);
        System.out.println("Int value " + intSaldo);

        //ArrayList<int> lista;
        //ArrayList<Integer> lista;
        
        int edad=80;
        Integer wrapperEdad = new Integer(edad);
        Integer wrapperEdad2 = edad;
        
        System.out.println(wrapperEdad);
         System.out.println(wrapperEdad2);
    }

}
