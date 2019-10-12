/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;

/**
 *
 * @author s109e19
 */
public class EjemploArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arbol miArbol = new Arbol();
        miArbol.addNodo(new Nodo(60));
        miArbol.addNodo(new Nodo(41));
        miArbol.addNodo(new Nodo(74));
        miArbol.addNodo(new Nodo(16));
        miArbol.addNodo(new Nodo(53));

        miArbol.mostrar();
        System.out.println("In Order");
        miArbol.mostrarInOrden();

        System.out.println("Pre Order");
        miArbol.mostrarPreOrden();

        System.out.println("Pos Order");
        miArbol.mostrarPostOrden();
    }

}
