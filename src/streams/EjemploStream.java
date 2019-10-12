/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import com.sun.javafx.collections.ElementObservableListDecorator;
import java.util.ArrayList;

/**
 *
 * @author s109e19
 */
public class EjemploStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        crearLista();
    }

    public static void crearLista() {
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Claudia");
        miLista.add("Juan David");
        miLista.add("Luis");
        miLista.add("LORENA");
        miLista.add("JOSÉ");
        miLista.add("CESAR");
        miLista.add("LUIS");

        miLista.stream()
                .filter((elemento) -> {
                    return elemento.length() >= 6;
                })
                .map((elemento) -> {
                    return "Estudiante:"+ elemento.toUpperCase();
                })
                .forEach((elemento) -> {
                    System.out.println(elemento);
                });

        for (int i = 0; i < miLista.size(); i++) {
            //Imprimir en uppercase los que tengan mas de 6 caracteres
            String nombre = miLista.get(i);
            if (nombre.length() >= 6) {
             //   System.out.println(nombre.toUpperCase());
            }
        }
    }

}
