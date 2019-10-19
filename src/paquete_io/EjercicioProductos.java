/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author s109e19
 */
public class EjercicioProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            leerArchivo();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void leerArchivo() throws IOException {
        FileReader reader = new FileReader("productos.csv");
        BufferedReader miBuffer = new BufferedReader(reader);
        String linea = miBuffer.readLine();
        double acumulador = 0;
        int contador = 0;
        int[] tipos = new int[5];
        while (linea != null) {
            try {

                String[] columnas = linea.split(",");
                if (!columnas[3].equals("Precio")) {
                    double precio = Double.parseDouble(columnas[3]);
                    acumulador = acumulador + precio;
                    contador++;
                    System.out.println(columnas[0]);
                }
                //Obtener el tipo
                String tipo = columnas[2];
                switch (tipo) {
                    case "1":
                        tipos[0] = tipos[0] + 1;
                        break;
                    case "2":
                        tipos[1] = tipos[1] + 1;
                        break;
                    case "3":
                        tipos[2] = tipos[2] + 1;
                        break;
                    case "4":
                        tipos[3] = tipos[3] + 1;
                        break;
                    case "5":
                        tipos[4] = tipos[4] + 1;
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            //Leer la siguiente linea
            linea = miBuffer.readLine();
        }
        System.out.println("Promedio de productos:" + (acumulador / contador));
        
        System.out.println("Total 1:" + tipos[0] );
        System.out.println("Total 2:" + tipos[1] );
        System.out.println("Total 3:" + tipos[2] );
        System.out.println("Total 4:" + tipos[3] );
        System.out.println("Total 5:" + tipos[4] );
    }

}
