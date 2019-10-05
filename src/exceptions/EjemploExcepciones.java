/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s109e19
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            int number = -6;
             if(number<0){
                 throw new MyNumberException(CodigoErrores.POSITIVOS);
             }
            
            if(number % 2 == 0){
                //Lanzar excepción 300: Solo se permite impares
                throw new MyNumberException(CodigoErrores.IMPARES);
            }
            else {
                throw  new MyNumberException(CodigoErrores.PARES);
            }
           
            //convertirNumeros();
            // lanzarExcepcion();
           // lanzarExcepcionConThrows();
           //ejecucionDeDatos();
            
          //  System.out.println("Mensaje despues de convertir numeros");
        } catch (Exception ex) {
            System.out.println("Capturando la excepcion desde el main");
            System.out.println(ex);
        }
    }
    
    public static void ejecucionDeDatos() throws Exception{
            lanzarExcepcionConThrows();
    }

    public static void convertirNumeros() {
        try {
            //Bloque a ejecutar 
            Integer wrapperInteger = new Integer("hola Mundo");
            System.out.println("Esto se ejecuta o no?");
        } catch (Exception e) {
            //Ingresa al catch
            System.out.println("Ingresa al catch" + e.toString());
        } finally {
            System.out.println("Ejecución en el finally");
        }
    }
    
    public static void lanzarExcepcion(){
        try {
            System.out.println(" Inicio para lanzar una excepción ");
            throw new Exception("Esta es la excepción lanzada. ");
           // System.out.println("Este código no se ejecuta.");
        } catch (Exception ex) {
            System.out.println("Capturar la excepción");
            System.out.println(ex);
        }
    }
    
    public static void lanzarExcepcionConThrows() throws Exception{
         throw new Exception("Esta es la excepción lanzada desde el método con throws. ");
    }

}
