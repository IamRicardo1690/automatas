/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTOMATAS_DOS;

/**
 *
 * @author Ricardo S.M
 */
public class arbol 
{
    private Nodos raiz;
    public arbol()
    {
        raiz=null;
        
    }
    public arbol(Object elem)
    {
        raiz=new Nodos(elem);
        
    }
    public void nuevoarbol(arbol ramai,Object dt, arbol ramad)
    {
        raiz =new Nodos(dt);
        if(ramai!=null)
        raiz.izq=ramai.raiz;
        if(ramad!=null)
        {
            raiz.der=ramad.raiz;
        }
    }
    public void en_orden()
    {
        if(raiz!=null)
        {
            raiz.re_inorden();
            
        }
    }
    public void preorden()
    {
        if(raiz!=null)
        {
            raiz.re_preorden();
        }
    }
    public void postorden()
    {
        if(raiz!=null)
        {
            raiz.re_postorden();
        }
    }
    
    
}
