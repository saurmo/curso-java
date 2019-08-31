/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author s109e19
 */
public class Operadores {

    private static int numeroA;
    private static int numeroB;

    public static void main(String[] args) {

        numeroA = 13;
        numeroB = 10;

        //Operador modulo
        int resultadoModulo = numeroA % 2;
        System.out.println("El modulo es: " + resultadoModulo);

        //Operador de incremento
        numeroA++; //Forma corta
        int resultadoIncremento = numeroA;

        numeroA = numeroA + 1; //Forma larga
        System.out.println("El resultado de incremento es: " + resultadoIncremento);

        //Operador de decremento
        numeroB--;
        numeroB = numeroB - 1;
        int resultadoDecremento = numeroB;
        System.out.println("El resultado de decremento es: " + resultadoDecremento);

        //Variable boolean tiene dos opciones {true, false}
        boolean estaVivo = true;
        estaVivo = !estaVivo;
        System.out.println("El valor de boolean es:" + estaVivo);

        //Sentencia condicinal if
        if (estaVivo == true) {
            System.out.println("Esta vivo.");
        } else {
            System.out.println("NO esta vivo.");
        }

        //Sentencia condiciona swith
        String inicialNombre = "Z";
        switch (inicialNombre) {
            case "A":
                System.out.println("Caso A");
                break;
            case "B":
                System.out.println("Caso A");
                break;
            default:
                System.out.println("Caso por defecto");
                break;
        }
    }

}
