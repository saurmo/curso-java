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
public class Factura {

    private String nit;
    private double iva;
    private double valorSubTotal;
    private double valorTotal;

    public Factura() {
    }

    
    
    public Factura(String nit, double iva, double valorSubTotal, double valorTotal) {
        this.nit = nit;
        this.iva = iva;
        this.valorSubTotal = valorSubTotal;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return this.nit +" Total:"+ this.valorTotal;  //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
