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
public class Nodos 
{
    Object dato;
    Nodos izq;
    Nodos der;
    public Nodos(Object x)
    {
        dato=x;
        izq=der=null;
    }
    public Nodos()
    {
        dato=null;
        izq=der=null;
    }
    public void re_inorden()
    {
        if(izq!=null)
        {
            izq.re_inorden();
        }
        System.out.print(" "+dato+" ");
        if(der!=null)
        {
            der.re_inorden();
        }
    }
    public void re_preorden()
    {
        System.out.println(dato);
        if(izq!=null)
        {
            izq.re_preorden();
        }
        if(der!=null)
        {
            der.re_preorden();
        }
     }
     public void re_postorden()
     {
         if(izq!=null)
             izq.re_postorden();
         if(der!=null)
             der.re_postorden();
         System.out.println(dato);
     }
}
