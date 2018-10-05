/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTOMATAS_DOS.ARBOL;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo S.M
 */
//import static AUTOMATAS_DOS.ARBOL.pruebaArbol.Nodo.Menu;
public class Main_Arbol {
    
     public static void main(String[] args) 
    {  
        int opcion; 
        String op="";
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION: \n"
                + " 1.-INSERTAR UNA RAIZ\n"
                + " 2.-INSERTAR UN NODO IZQUIERDO\n"
                + " 3.-INSERTAR UN NODO DERECHO\n"
                + " 4.-RESULTADOS\n"
                + " 5.-SALIR"));
        switch (opcion){
            case 1: raiz();break;
            case 2: preOrden();break;
            case 3: inOrden();break;
            case 4: posOrden();break;
            case 5: JOptionPane.showMessageDialog(null, "QUE TENGA UN BUEN DIA");
                System.exit(0);break;
            default:JOptionPane.showMessageDialog(null, "ELIJA UNA OPCION VALIDA\n" ,"ERROR AOPCION",JOptionPane.WARNING_MESSAGE);
                    }
          }
        while(opcion!=5); // el do while permite hacer le ciclo del menu
        
        
       
  //      Menu = new pruebaArbol() ;
        
    }

    private static void raiz() {

    }

    private static void preOrden() {

    }

    private static void inOrden() {

    }

    private static void posOrden() {

    }
}