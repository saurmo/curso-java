/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_binarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author santiagourrego
 */
public class Arbol {
    
    public Arbol(){
        
    }

    /* Atributos */
    private Nodo raiz;

    /* Contructories */
    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void addNodo(Nodo nodo) {
        this.addNodo(nodo, this.raiz);
    }

    private void addNodo(Nodo nodo, Nodo raiz) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if (raiz == null) {
            this.setRaiz(nodo);
        } else {
            //Si es menor
            if (nodo.getValor() <= raiz.getValor()) {
                //Si el nodo de la izq esta vacio lo agrego
                if (raiz.getHijoIzquierdo()== null) {
                    raiz.setHijoIzquierdo(nodo);
                } else {
                    //Si no, llamo de nuevo la función para realizar la recursividad
                    addNodo(nodo, raiz.getHijoIzquierdo());
                }
            } else {
                if (raiz.getHijoDerecho() == null) {
                    raiz.setHijoDerecho(nodo);
                } else {
                    addNodo(nodo, raiz.getHijoDerecho());
                }
            }
        }
    }

    public void mostrar() {
        mostrar(raiz);
    }

    private void mostrar(Nodo tmp) {
        tmp.mostrar();
        if (tmp.getHijoIzquierdo() != null) {
            mostrar(tmp.getHijoIzquierdo());
        }
        if (tmp.getHijoDerecho() != null) {
            mostrar(tmp.getHijoDerecho());
        }
    }

    public void mostrarPreOrden() {
        mostrarPreOrden(raiz);
    }

    public void mostrarPreOrden(Nodo tmp) {
        tmp.mostrar();
        if (tmp.getHijoIzquierdo() != null) {
            mostrarPreOrden(tmp.getHijoIzquierdo());
        }
        if (tmp.getHijoDerecho() != null) {
            mostrarPreOrden(tmp.getHijoDerecho());
        }

    }

    public void mostrarInOrden() {
        mostrarInOrden(raiz);
    }

    public void mostrarInOrden(Nodo tmp) {

        if (tmp.getHijoIzquierdo() != null) {
            mostrarInOrden(tmp.getHijoIzquierdo());
        }
        tmp.mostrar();
        if (tmp.getHijoDerecho() != null) {
            mostrarInOrden(tmp.getHijoDerecho());
        }

    }

    public void mostrarPostOrden() {
        mostrarInOrden(raiz);
    }

    public void mostrarPostOrden(Nodo tmp) {

        if (tmp.getHijoIzquierdo() != null) {
            mostrarPostOrden(tmp.getHijoIzquierdo());
        }
      
        if (tmp.getHijoDerecho() != null) {
            mostrarPostOrden(tmp.getHijoDerecho());
        }
          tmp.mostrar();

    }

    private void imprimirEntreConNivel(Nodo tmp, int nivel) {
        if (tmp != null) {
            imprimirEntreConNivel(tmp.getHijoIzquierdo(), nivel + 1);

            System.out.println(tmp.getValor() + "(" + nivel + ") - ");
            imprimirEntreConNivel(tmp.getHijoDerecho(), nivel + 1);
        }
    }

    public void imprimirEntreConNivel() {
        imprimirEntreConNivel(raiz, 1);
        System.out.println();
    }

}

