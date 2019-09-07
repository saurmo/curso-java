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
public class NewClass {
    public int evaNum(int[] num, int punt, int pos){
        if(pos>=num.length){
            return 0;
        }else if(Integer.toString(num[pos]).contains("5")){
            return evaNum(num, punt++, pos++);
        }else
            return evaNum(num, punt++, pos++);
    }
}
