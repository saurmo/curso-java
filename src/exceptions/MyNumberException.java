/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author s109e19
 */
public class MyNumberException extends Exception {
    
    private CodigoErrores codigoError;

    public MyNumberException(CodigoErrores codigoError) {
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {
        //Código de 100: Es para números negativos
      if(this.codigoError==CodigoErrores.POSITIVOS){
          return "Error: Solo se permiten números positivos";
      }
      // Código 200: Es para número pares
      if(this.codigoError==CodigoErrores.PARES){
          return "Error: Solo se permiten números pares";
      }
      
      // Código 300: Es para número impares
      if(this.codigoError==CodigoErrores.IMPARES){
          return "Error: Solo se permiten números impares";
      }
      return "Error: No definido";
      
    }
    
    
    
    
    
    
    
    
}
