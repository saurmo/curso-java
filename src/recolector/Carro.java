/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotores;

/**
 *
 * @author s109e19
 */
public class Carro {

    private String color;
    private int nroPuertas;
    private int modelo;
    private String marca;

    public Carro(String color, int nroPuertas, int modelo, String marca) {
        this.color = color;
        this.nroPuertas = nroPuertas;
        this.modelo = modelo;
        this.marca = marca;

    }

    public void acelerar() {

    }

    public void frenar() {

    }

    public double valorCarro() {
        //Primera condicion
        if (this.modelo > 2010 && this.nroPuertas == 4) {
            return 50000000;
        }
        //Segunda condicion
        if (this.modelo > 2010 && this.nroPuertas == 2) {
            return 40000000;
        }
        if (this.modelo <= 2010 && this.nroPuertas == 4) {
            return 40000000;
        }
        if (this.modelo <= 2010 && this.nroPuertas == 2) {
            return 40000000;
        }
        return 1000000;
    }

    public void imprimir() {
        System.out.println("El carro es de marca: " + this.marca);
        System.out.print(" de color " + this.color);
        System.out.print(" del modelo " + this.modelo);
        System.out.println("");
    }

}
