/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo S.M
 */
//programa para probar la clase arbol
public class PruebaArbol {
    public static void main(String args[])
    {
        Arbol arbol = new Arbol();
       
        //JOptionPane.showMessageDialog(null,"Insertando los siguientes valores:"+
       // "camino, abedul, estruendo, noche, dia, espejo, roca, dirimir,"+
       // "ambulancia, hiperrealidad, amigo");

        arbol.insertarNodo("G");
        arbol.insertarNodo("E");
        arbol.insertarNodo("A");
        arbol.insertarNodo("I");
        arbol.insertarNodo("B");
        arbol.insertarNodo("M");
        arbol.insertarNodo("C");
        arbol.insertarNodo("L");
        arbol.insertarNodo("F");
        arbol.insertarNodo("D");
        arbol.insertarNodo("K");
        arbol.insertarNodo("J");
        arbol.insertarNodo("M");

        System.out.println("\n\nRecorrido preorden");
        //JOptionPane.showMessageDialog(null,"\n\nRecorrido preorden");
        arbol.recorridoPreorden();

        System.out.println("\n\nRecorrido inorden");
        arbol.recorridoInorden();

        System.out.println("\n\nRecorrido posorden");
        arbol.recorridoPosorden();
    }
}