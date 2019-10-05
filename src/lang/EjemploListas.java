/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author s109e19
 */
public class EjemploListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // listas();
        //listaFacturas();
       // pilas();
       colas();
    }

    public static void listaFacturas() {
        ArrayList<Factura> misFacturas = new ArrayList<>();

        Factura nro1 = new Factura("100", 19, 55000, 80000);
        misFacturas.add(nro1);

        Factura nro2 = new Factura("110", 19, 55000, 30000);
        misFacturas.add(nro2);
        System.out.println(misFacturas);

        Factura obtenerFactura1 = misFacturas.get(1);
        System.out.println(obtenerFactura1);
    }

    public static void listas() {
        ArrayList<String> miLista = new ArrayList<>();
        // Agregar elemento
        miLista.add("Claudia");
        miLista.add("Juan David");
        miLista.add("Luis");

        System.out.println(miLista);
        int size = miLista.size();
        System.out.println(size);

        //Obtener elemento
        try {
            String miEstudiante = miLista.get(2);
            System.out.println(miEstudiante);

            boolean existeEstudiante = miLista.contains("Claudia");
            System.out.println("Existe:" + existeEstudiante);

            boolean seElimino = miLista.remove("Luis");
            System.out.println("Se elimino:" + seElimino);
            System.out.println(miLista);

            String seEliminoPosicion = miLista.remove(0);
            System.out.println("Se elimino:" + seEliminoPosicion);
            System.out.println(miLista);

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    public static void pilas() {
        Stack<Integer> miPila = new Stack<>();
        miPila.add(1);  //Libro 1 base
        miPila.add(2);  //Libro 2 en el medio
        miPila.add(3);  //Libro 3 en la cima

        System.out.println("Size:" + miPila.size());
        System.out.println(miPila.pop()); //Eliminar nro
        System.out.println("Size:" + miPila.size());
        System.out.println(miPila.peek());

    }

    public static void colas() {
        Queue<String> miListaCola = new LinkedList<>();

        miListaCola.add(" Turno A");  // Turno 1
        miListaCola.add(" Turno B");  // Turno 2
        miListaCola.add("Turno C");  //Turno 3
        
        System.out.println("Size:"+miListaCola.size());
        System.out.println(miListaCola.poll());
         System.out.println("Size:"+miListaCola.size());
           System.out.println(miListaCola.peek());

    }
}
