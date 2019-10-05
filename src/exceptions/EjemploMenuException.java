/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author s109e19
 */
public class EjemploMenuException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa una opción: \n A. Para bloque A  \n B. Para bloque B \n S. Para salir \n");
            String opcionMenu = scanner.next();
            while (!opcionMenu.equals("S")) {
                
                System.out.println("Ingrese el número 1:");
                double nro1 = scanner.nextDouble();
                
                System.out.println("Ingrese el número 2:");
                double nro2 = scanner.nextDouble();
                switch (opcionMenu) {
                
                    case "A":
                        System.out.println("Ejecucion bloque A");
                        double suma = sumar(nro1, nro2);
                        System.out.println("Resultado de suma: " + suma);
                        break;
                    case "B":
                        System.out.println("Ejecucion bloque B");
                        double division = dividir(nro1, nro2);
                        System.out.println("Resultado de suma: " + division);

                        break;
                    case "S":
                        System.out.println("Opción para salir.");
                        break;
                    default:
                        throw new MenuException();
                }
                System.out.print("Ingresa una opción: \n A. Para bloque A  \n B. Para bloque B \n S. Para salir");
                opcionMenu = scanner.next();
            }
        } catch (Exception e) {
            System.out.println("Capturar la excepción del menu");
            System.out.println(e);
        } finally {
            System.out.println("El programa ha finalizado.");
        }

    }
    
    public static double sumar(double numero1, double numero2){
        try {
            if(numero1<0 ) {
                throw new Exception("Esta suma solo recibe numeros positivos");
            }
            return numero1 + numero2;
        } catch (Exception e) {
            System.out.println("Excepción en suma:"+e);
            return 0;
        }
    }
    public static double dividir(double numero1, double numero2) throws Exception{
        if(numero2 == 0)
            throw new Exception("División por 0");
        return numero1/numero2;
    }

}
