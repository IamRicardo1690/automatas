/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTOMATAS_DOS.ARBOL;

/**
 *
 * @author Ricardo S.M
 */
public class Nodo {
    private int dato;
   // String dat
    private Nodo izq;
    private Nodo der;
    
    public Nodo (int dato){// constructor inicializa las variables
        this.dato = dato;
        
    }
    public Nodo getNodoizquierdo(){//obteneer datos
        return izq;
    }
    public Nodo getNododerecho(){
        return der;
    }
   
    public void setNododerecho(Nodo nodo){//inserta nuevos nodos
        der = nodo;
        
    } 
    public void setNodoizquierdo(Nodo nodo){
        izq = nodo;
       
    }
    public int getDato(){
        return dato;
    }
}
