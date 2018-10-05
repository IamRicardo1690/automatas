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
public class ejemplo_1 {
    arbol a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13;
    void recorrer()
    {
        a1=new arbol();
        a2=new arbol();
        a3=new arbol();
        a4=new arbol();
        a5=new arbol();
        a6=new arbol();
        a7=new arbol();
        a8=new arbol();
        a9=new arbol();
        a10=new arbol();
        a11=new arbol();
        a12=new arbol();
        a13=new arbol();
        
        a1.nuevoarbol(a7,"J",null );
        a2.nuevoarbol(null,"K",a1 );
 
        a3.nuevoarbol(a6,"L",null);
        
        a4.nuevoarbol(a3,"C",a5 );
        
        a5.nuevoarbol(null,"f",a10 );
        
        a6.nuevoarbol(null,"d",null );
        a7.nuevoarbol(null,"m",null );
        a8.nuevoarbol(null,"i",null );
        a9.nuevoarbol(null,"b",null );
        
        a10.nuevoarbol(a7,"M",a6 );
        a11.nuevoarbol(a7,"A",a6 );
        a12.nuevoarbol(a11,"E",null );
        a13.nuevoarbol(a12,"G",a7 );
        
        
        a10.postorden();// izq dere raiz
       // a7.en_orden();//izqu raiz derecha
        //a7.preorden();  //raiz izquierda derecha
        
   
        
    }
    public static void main(String args[])
    {
        ejemplo_1 r=new ejemplo_1 ();
        r.recorrer();
    }
    
    
}
