/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

/**
 *
 * @author Ricardo S.M
 */
import java.util.regex.*;
import javax.swing.JOptionPane;

public class ejemplo 
{
    public static void main (String[] args)
    {
        ejemplo validar=new ejemplo();
    }
    ejemplo()
    {
        String cadena=JOptionPane.showInputDialog(""
        + "Ingresa la cadena a validar");
        Pattern expresion=Pattern.compile
                ("^(hola | Hola).*uni.*s$");
              
               
      //      ("^.*1[^2].*");   //Pattern permite hacer nuetra patrond e busqueda una numero no seguido de otro
        //       ("^[A-Z]{1}[AEIOU]{1}[A-Z]{2} "
          //  + "[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])"
            // + "[HM]{1} (AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE) "
           //  + "[B-DF-HJ-NP-TV-Z]{3} "
            // + "[0-9A-Z]{1} [0-9]{1}$ ");
        
        Matcher mat=expresion.matcher(cadena);     //
        if(mat.matches())                          //valida 
        {
            JOptionPane.showMessageDialog(null, ""
            + "La cadena es correcta");
        }
        else
        {
            JOptionPane.showMessageDialog(null, ""+ 
                    "La cadena no es correcta");
        }
    }
}
