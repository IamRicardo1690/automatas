/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

/**
 *
 * @author Ricardo S.M
 */
public class ArbolBinario<Tipo> {
    
    private NodoBinario<Tipo> raiz;
    
    // Tipos de recorrido
    public enum recorrido {PREORDEN, ENORDEN, POSTORDEN}
    
    /**
     * Constructor por default con nodo raíz
     * @param r 
     */
    public ArbolBinario(NodoBinario<Tipo> r) {
        raiz = r;
    }
    
    /**
     * Devuelve el nodo raíz del árbol
     * @return 
     */
    public NodoBinario<Tipo> getRaiz() {
        return raiz;
    }
    
    /**
     * Permite recorrer el árbol en el órden indicado
     * @param tipo 
     */
    public void recorrer(recorrido tipo) {
        switch(tipo) {
            case PREORDEN:
                System.out.println("Recorrido pre orden");
                raiz.preOrden();
                break;
            case ENORDEN:
                System.out.println("Recorrido en orden");
                raiz.enOrden();
                break;
            case POSTORDEN:
                System.out.println("Recorrido post orden");
                raiz.postOrden();
                break;
        }
        System.out.println();
    }
}