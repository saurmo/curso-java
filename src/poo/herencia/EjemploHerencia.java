/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia;

/**
 *
 * @author s109e19
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona personaUno = new Persona();
        personaUno.setNombre("JUAN");
        personaUno.imprimirPersona();
        
        Persona personaDos = new Persona("CARLOS", 20, 3000000.0);
        personaDos.imprimirPersona();
        
        Estudiante estudianteUno = new Estudiante();
        estudianteUno.setNombre("SAMUEL");
        estudianteUno.imprimirPersona();
        
        System.out.println(personaUno);
    }
    
}
