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
public class NodoBinario<Tipo> {
    
    private Tipo valor;
    private NodoBinario<Tipo> padre;
    private NodoBinario<Tipo> nIzq;
    private NodoBinario<Tipo> nDer;  
    
    /**
     * Primer constructor. Únicamente asigna valor
     * @param v Valor para el nodo
     */
    public NodoBinario(Tipo v) {
        valor = v;
    }
    
    /**
     * Segundo constructor
     * @param ni Nodo Izquierdo
     * @param v Valor del nodo
     * @param nd Nodo derecho
     */
    public NodoBinario(NodoBinario<Tipo> ni, Tipo v, NodoBinario<Tipo> nd) {
        valor = v;
        if (ni != null) nIzq = ni;
        if (nd != null) nDer = nd;
    }
    
    /**
     * Tercer constructor
     * @param hijoIzquierdo Valor del nodo izquierdo
     * @param v Valor del nodo
     * @param hijoDerecho Valor del nodo derecho
     */
    public NodoBinario(Tipo hijoIzquierdo, Tipo v, Tipo hijoDerecho) {
        valor = v;
        if (hijoIzquierdo != null) nIzq = new NodoBinario<>(hijoIzquierdo);
        if (hijoDerecho != null) nDer = new NodoBinario<>(hijoDerecho);
    }
    
    /**
     * Indica si el nodo es interno
     * @return 
     */
    public boolean interno() {
        return (nIzq != null && nDer != null);
    }
    
    /**
     * Nodo externo cuando no tiene hijos
     * @return 
     */
    public boolean externo() {
        return (nIzq == null && nDer == null);
    }
    
    /**
     * Devuelve el valor del nodo
     * @return 
     */
    public Tipo getValor() {
        return valor;
    }
    
    /**
     * Recorrido pre orden RID
     */
    public void preOrden() {
        System.out.print(valor + " ");
        if (nIzq != null)
            nIzq.preOrden();
        if (nDer != null)
            nDer.preOrden();
    }
    
    /**
     * Recorrido en orden IRD
     */
    public void enOrden() {
        if (this == null)
            return;
        if (nIzq != null)
            if (nIzq.externo())
                System.out.print(nIzq.getValor() + " ");
            else
                nIzq.enOrden();
        System.out.print(valor + " ");
        if (nDer != null)
            if (nDer.externo())
                System.out.print(nDer.getValor() + " ");
            else
                nDer.enOrden();
    }
    
    /**
     * Recorrido post orden IDR
     */
    public void postOrden() {
        if (this == null)
            return;
        if (nIzq != null)
            if (nIzq.externo())
                System.out.print(nIzq.getValor() + " ");
            else
                nIzq.postOrden();        
        if (nDer != null)
            if (nDer.externo())
                System.out.print(nDer.getValor() + " ");
            else
                nDer.postOrden();
        System.out.print(valor + " ");
    }
}