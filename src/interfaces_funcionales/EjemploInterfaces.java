/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_funcionales;

/**
 *
 * @author s109e19
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tester test = () -> {
            System.out.println(" Implementación metodo imprimir ");
        };
        
        test.imprimir();
test.imprimirDos();

            Tester test2 = () -> {
            System.out.println("Hola, implementacion test2 imprimir");
        };
        
        test2.imprimir();

    }

}
