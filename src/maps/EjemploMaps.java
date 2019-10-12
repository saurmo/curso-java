/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author s109e19
 */
public class EjemploMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearHashmap();
       // crearTreemap();
       crearLinkedHashMap();
    }

    public static void crearHashmap() {
        Map<Integer, String> miLista = new HashMap<>();
        miLista.put(55, "LORENA");
        miLista.put(6, "JOSÉ");
        miLista.put(77, "CESAR ");
        miLista.put(3, "LUIS ");
        
          miLista.forEach((llave, valor) -> {
            System.out.println("Llave " + llave + " valor " + valor);
        });

      
    }

    public static void crearTreemap() {
        Map<Integer, String> miLista = new TreeMap<>();
        miLista.put(55, "LORENA");
        miLista.put(6, "JOSÉ");
        miLista.put(77, "CESAR ");
        miLista.put(3, "LUIS ");

        miLista.forEach((llave, valor) -> {
            System.out.println("Llave " + llave + " valor " + valor);
        });
    }
    
       public static void crearLinkedHashMap() {
        Map<Integer, String> miLista = new LinkedHashMap<>();
        miLista.put(55, "LORENA");
        miLista.put(6, "JOSÉ");
        miLista.put(77, "CESAR ");
        miLista.put(3, "LUIS ");

        miLista.forEach((llave, valor) ->  System.out.println("Llave " + llave + " valor " + valor));
        
        
          for (Map.Entry<Integer, String> elemento : miLista.entrySet()) {
            Integer key = elemento.getKey();
            String value = elemento.getValue();
            System.out.println("Llave " + key + " valor " + value);
        }
    }

}
