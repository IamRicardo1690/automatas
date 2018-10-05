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

public class NodoArbol
{
    //miembros de acceso
    NodoArbol nodoizquierdo;
    int datos;
    NodoArbol nododerecho;
     
    //iniciar dato y hacer de este nodo un nodo hoja
    public NodoArbol(int datosNodo)
    {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null; //el nodo no tiene hijos
    }
     
    //buscar punto de insercion e inserter nodo nuevo
    public synchronized void insertar(int valorInsertar)
    {
        //insertar en subarbol izquierdo
        if(valorInsertar < datos)
        {
            //insertar en subarbol izquierdo
            if(nodoizquierdo == null)
                nodoizquierdo = new NodoArbol(valorInsertar);
            else    //continua recorriendo subarbol izquierdo
                nodoizquierdo.insertar(valorInsertar);
        }
         
        //insertar nodo derecho
        else if(valorInsertar > datos)
        {
            //insertar nuevo nodoArbol
            if(nododerecho == null)
                nododerecho = new NodoArbol(valorInsertar);
            else
                nododerecho.insertar(valorInsertar);
        }
    } // fin del metodo insertar
}
 
class Arbol
{
    private NodoArbol raiz;
     
    //construir un arbol vacio
    public Arbol()
    {
        raiz = null;
    }
     
    //insertar un nuevo ndo en el arbol de busqueda binaria
    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new NodoArbol(valorInsertar); //crea nodo raiz
        else
            raiz.insertar(valorInsertar); //llama al metodo insertar        
    }
     
    // EMPIEZA EL RECORRIDO EN PREORDEN
    public synchronized void recorridoPreorden()
    {
        Preorden(raiz);
    }
    //meoto recursivo para recorrido en preorden
     
    private void Preorden(NodoArbol nodo)
    {
        if(nodo == null)
            return;
         
        System.out.print(nodo.datos + " ");     //mostrar datos del nodo
        Preorden(nodo.nodoizquierdo);   //recorre subarbol izquierdo
        Preorden(nodo.nododerecho);     //recorre subarbol derecho
    }
     
    //EMPEZAR RECORRIDO INORDEN
    public synchronized void recorridoInorden()
    {
        Inorden(raiz);
    }
     
    //meoto recursivo para recorrido inorden
    private void Inorden( NodoArbol nodo)
    {
        if(nodo == null)
            return;
         
        Inorden(nodo.nodoizquierdo);
        System.out.print(nodo.datos + " ");
        Inorden(nodo.nododerecho);
    }
     
    //EMPEZAR RECORRIDO PORORDEN
    public synchronized void recorridoPosorden() //en un método de instancia
    {                                       //La palabra reservada synchronized. La palabra reservada synchronized 
                                             //se usa para indicar que ciertas partes del código, (habitualmente, 
                                              //una función miembro) están sincronizadas, es decir, que solamente 
                                               //un subproceso puede acceder a dicho método a la vez.
        Posorden(raiz);        
    }
     
    //meotod recursivo para recorrido posorden
    private void Posorden(NodoArbol nodo)
    {
        if( nodo == null )
            return;
         
        Posorden(nodo.nodoizquierdo);
        Posorden(nodo.nododerecho);
        System.out.print(nodo.datos + " ");
    }
}