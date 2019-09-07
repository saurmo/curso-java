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
        int[] vect = new int[3];
        vect[0]=558;
        vect[1]=748;
        vect[2]=398;
        int punt=0, pos=0;
        NewClass n = new NewClass();
        System.out.println(n.evaNum(vect, punt, pos));
    }
    

}
