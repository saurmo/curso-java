/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

/**
 *
 * @author s109e19
 */
public class EjemplosPaqueteLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre = "Santiago";
        String nombre2 = "santiago";
        System.out.println("Equal:" + nombre.equals(nombre2));
        System.out.println("Equal:" + nombre.equalsIgnoreCase(nombre2));

        String apellido = "Urrego";

        // Santiago Urrego
        System.out.println("Con string:" + nombre + " " + apellido);

        StringBuffer nombreCompleto = new StringBuffer("Santiago");
        nombreCompleto.append(" Urrego");
        nombreCompleto.insert(0, "Hola:");
        nombreCompleto.deleteCharAt(4);

        String mensajeBienvenida = nombreCompleto.substring(0, 4);
        System.out.println("Con StringBuffer:" + nombreCompleto);
        System.out.println("Substring:" + mensajeBienvenida);
        System.out.println("Invertir :" + nombreCompleto.reverse());

        //Split
        mensajeBienvenida = "id;nombre;fecha;edad";
        String[] split = mensajeBienvenida.split(";");

        System.out.println(split[0] + " " + split[1]);

        //Character
        //   char miChar;
        //  Character mi_Char = 'p';
        //  Character mi_Char2 = 'A';
        //  boolean isDigit = Character.isDigit(mi_Char);
        //  System.out.println("El char es digito:" + isDigit);
        //   int compare = mi_Char.compareTo(mi_Char2);
        //   System.out.println("Comparacion: " + compare);
        //   System.out.println("Upper:" + Character.toUpperCase(mi_Char));
        //    System.out.println("Lower: " + Character.toLowerCase(mi_Char2));
// Crear nro aleatorio
        //  double nro1 = Math.random();
        //  System.out.println(nro1);
        //  double nro2 = Math.random() * 100;
        //  System.out.println(nro2);
        //   System.out.println("Nro redondeado:" + Math.round(nro2));
        //  System.out.println("Nro redondeado menor:" + Math.floor(nro2));
        //   System.out.println("Nro redondeado mayor:" + Math.ceil(nro2));
    }

}
