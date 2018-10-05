/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_1;

/**
 *
 * @author Ricardo S.M
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import java.util.StringTokenizer;

public class sumativa extends JFrame implements ActionListener
{
    static boolean bandera = false;	
    
    JTextArea area,areapalabra,respuesta;
    JButton validar,palabra,palabra2;
    String nuevapalabra;
    
    static String diccionario[]={"class","int","string","main","metodo","private",
                                "public","estatic","if","else","for"
                                ,"while","message","import","new","implement","begin","end","boolean"};
         
    sumativa()
    {
        super( "Compilador" );
        setLayout(null);
        
        //Codigo de diccionario
        area=new JTextArea();
        area.setBounds(20,20,600,500);
        
        palabra=new JButton("Compilar");
        palabra.setBounds(50,530,200,30);
        
        
        //Palabra a diccionario
        
        
        validar=new JButton("Ingresar palabra a mi diccionario");
        validar.setBounds(660,50,300,30);
        
        //validar palabra
        
        areapalabra=new JTextArea();
        areapalabra.setBounds(660,180,300,20);
        
        palabra2=new JButton("Validar palabra");
        palabra2.setBounds(660,130,300,30);
                
        respuesta=new JTextArea();
        respuesta.setBounds(700,220,200,20);
        respuesta.setEditable(false);
        
        add(respuesta);
        add(validar);
        add(area);
        add(palabra);
        add(areapalabra);
        add(palabra2);
        
        validar.addActionListener(this);
        palabra2.addActionListener(this);
        palabra.addActionListener(this);
        
        setSize(1000,650);
        setVisible(true);
     }
    //metodo principal se crea un objeto y con ese bojeto se manda a yamar el constructor q hace todo
     public static void main(String args[])
     {
        sumativa m=new sumativa();
     }
     //metodo para los botones 
     public void actionPerformed(ActionEvent e) 
     {
                      
       if(e.getSource()==palabra) 
       {
           
           String dic=area.getText();
           Scanner leer = new Scanner(dic);
              
               
              StringTokenizer st = new StringTokenizer(dic);
              while (st.hasMoreTokens())
              {
             
                for(int i=0;i<diccionario.length;i++)
                {
                   if(st.equals(diccionario[i]))
                   {
                            
                            bandera = true;
                            
                   }
                   
                   else
                   {
                            
                            bandera = false;
                            break;
                   }              
                 }
              }
              if(bandera = true)
                   {
                        JOptionPane.showMessageDialog(null,"Compilacion correcta");
                          
                   }
                   else
                   {
                         JOptionPane.showMessageDialog(null,"Error en compilacion");
                   }  
        }
       if(e.getSource()==palabra2) 
       {
           
           String dic=areapalabra.getText();
            
           
           for(int i=0;i<diccionario.length;i++) 
           {
               if(dic.equals(diccionario[i]))
               {
                 
                        respuesta.setText("palabra validada");
                        break;  
               }
                   else
               {
                        respuesta.setText("palabra invalidada");
               }
               if(dic.equals(nuevapalabra))
                   {
                            
                        respuesta.setText("palabra validada");    
                            
                   }
            }
            
       }
        if(e.getSource()==validar)
         {
              nuevapalabra=JOptionPane.showInputDialog("Ingresa la palabra");
              JOptionPane.showMessageDialog(null,"palabra guardada");
         }
     }
}