/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTOMATAS_DOS.ARBOL;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Ricardo S.M
 */
public class pruebaArbol {
    
    JLabel lblarbol; //titulo
    JTextArea txtarbol;//caja donde se guardan los datos
    JButton btnGenerararbol;//boton de generar los datos
    
    String cadena;//acomoda los datos en la caja
    private Object p;
    
    //PanelFondoMonte p;
    
    @SuppressWarnings("empty-statement")
    pruebaArbol(){
        //super("MonteCarlo");
   
        //p.setLayout(null);
        
        lblarbol = new JLabel("Demanda");
        lblarbol.setBounds(20, 20 , 100 ,20);
        lblarbol.setForeground(Color.red);
        lblarbol.setFont(new Font("Papyrus", Font.BOLD,20));
        
        txtarbol = new JTextArea();
        txtarbol.setBounds(10, 40, 100, 200);;
        txtarbol.setEditable(false);
        
        
        btnGenerararbol = new JButton("Generar");
        btnGenerararbol.setBounds(10, 250, 100, 40);
        btnGenerararbol.setForeground(Color.black);
        btnGenerararbol.setFont(new Font("Papyrus", Font.BOLD,20));
        
        //p.add(lblarbol);
        //p.add(txtarbol);
        
        //p.add(btnGenerararbol);
        btnGenerararbol.addActionListener((ActionListener) this);
    }
    public static void main (String [] args){
        
        Nodo raiz = new Nodo(3);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        
        nodo3.setNododerecho(new Nodo(6));
        nodo3.setNodoizquierdo(new Nodo(5));
        
        nodo2.setNodoizquierdo(new Nodo(4));
        
        raiz.setNodoizquierdo(nodo2);
        raiz.setNododerecho(nodo3);
        
        System.out.println("Pre Orden");
        preOrden(raiz);
        System.out.println("In Orden");
        inOrden(raiz);
        System.out.println("En Orden");
        posOrden(raiz);
        
        
        
    }

    private static void preOrden(Nodo raiz) {
       if(raiz != null){
            System.out.print(raiz.getDato()+" - ");
            preOrden(raiz.getNodoizquierdo());
            preOrden(raiz.getNododerecho());
            //Object preOrden = null;
            //JOptionPane.showInputDialog(null,preOrden);
       }
    }

    private static void inOrden(Nodo raiz) {
        if(raiz != null){
            inOrden(raiz.getNodoizquierdo());
            System.out.print(raiz.getDato()+" - ");
            inOrden(raiz.getNododerecho());
       }
    }

    private static void posOrden(Nodo raiz) {
        
        //Object posOrden = null;
          //         JOptionPane.showMessageDialog(null,posOrden);
  
         if(raiz != null){
            inOrden(raiz.getNodoizquierdo());
            inOrden(raiz.getNododerecho());
             //Object posOrden = null;
            System.out.print(raiz.getDato()+" - ");
            
       }
        
         
    }
    
}
   
    
    
    

