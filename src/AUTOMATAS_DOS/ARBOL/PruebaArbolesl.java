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

import javax.swing.JOptionPane;
public class PruebaArbolesl
{
    public static void main(String args [])
    {
        Arbol arbol = new Arbol();
        int valor;
        String Dato;
         
        System.out.println("Valores:");
        //JOptionPane.showMessageDialog(null,"valores");
        
        Dato = JOptionPane.showInputDialog("Numero de nodos que desea ingresar");
        int n = Integer.parseInt(Dato);
         
        for(int i = 1; i <= n; i++ )
        {
            Dato = JOptionPane.showInputDialog("Ingrese el " + i + " valor");
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }
        
        
        //recorridoPreorden = JOptionPane.showInputDialog ("\n\nRecorrido Preorden");
        //JOptionPane.showInputDialog("\n\nRecorrido Preorden");
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();
        
        //JOptionPane.showInputDialog("\n\nRecorrido Preorden");
        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();
         
        //JOptionPane.showInputDialog("\n\nRecorrido Preorden");
        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
    }
}