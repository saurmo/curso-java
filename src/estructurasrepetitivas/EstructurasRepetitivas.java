/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author s109e19
 */
public class EstructurasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Procedimiento con for
        // diasDeLaSemanaTxt();
       //Procedimiento con while
         diasDeLaSemanaWhile();
        impresionMatriz();
    }

    //Agregar a un arreglo los dias de la semana
    public static void diasDeLaSemanaTxt() {
        String[] diasSemana = new String[7];

        Scanner scanner = new Scanner(System.in);

        //INGRESO DE DATOS
        for (int i = 0; i < 7; i++) {
            //INGRESO DE DIA
            System.out.print("Ingrese el día " + (i + 1) + " de la semana: ");
            String dia = scanner.nextLine();
            System.out.println("Día ingresado es: " + dia);
            //Asignar el día ingresado al vector de diasSemana
            diasSemana[i] = dia;
        }
        //IMPRESIÓN DE DATOS
        for (int i = 0; i < diasSemana.length; i++) {
            String dia = diasSemana[i];
            System.out.println("El día de la semana es: " + dia);
        }

        // System.out.println("Primer día: " + diasSemana[0]);
        // System.out.println("Vector de dias: " + diasSemana);
    }

    public static void diasDeLaSemanaWhile() {
        String[] diasSemana = new String[7];

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < diasSemana.length) {
            System.out.print("Ingrese el día " + (i + 1) + " de la semana: ");
            String dia = scanner.nextLine();
            System.out.println("Día ingresado es: " + dia);
            //Asignar el día ingresado al vector de diasSemana
            diasSemana[i] = dia;
            i++;
        }
        i = 0;
        while (i < diasSemana.length) {
            String dia = diasSemana[i];
            System.out.println("El día de la semana es: " + dia);
            i++;
        }

    }

    public static void impresionMatriz() {
        int[][] miMatriz = new int[5][4];
        miMatriz[2][2] = 5;
        miMatriz[4][3] = 5;
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(miMatriz[fila][columna]);
            }
            System.out.println();
        }
    }
}
