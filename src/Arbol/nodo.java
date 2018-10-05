/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo S.M
 */
public class nodo {
public String info;
public int infor;
nodo izq;
nodo der;

public void cargarNodo(nodo n)
{
String numero,resp;
nodo otro;

numero=JOptionPane.showInputDialog(null,"Ingrese Valor:");
n.info=numero;

resp=JOptionPane.showInputDialog(null,"Existe Nodo por la izquierda: s/n");

if(resp.charAt(0) =='s')
{
otro=new nodo();
n.izq=otro;
cargarNodo(n.izq);
}
else
{
n.izq=null;
}



resp=JOptionPane.showInputDialog(null,"Existe Nodo por la derecha: s/n");

if(resp.charAt(0) =='s')
{
otro=new nodo();
n.der=otro;
cargarNodo(n.der);
}
else
{
n.der=null;
}
}
public void recorridoEnPreorden(nodo n)
{
String cad="";
if(n!=null)
{
JOptionPane.showMessageDialog(null,"Elementos:"+n.info,"Resultados",JOptionPane.INFORMATION_MESSAGE);
recorridoEnPreorden(n.izq);
recorridoEnPreorden(n.der);
}
}
public void recorridoInOrden(nodo n)
{
if(n!=null)
{
recorridoInOrden(n.izq);
JOptionPane.showMessageDialog(null,"Elementos:"+n.info,"Resultados",JOptionPane.INFORMATION_MESSAGE);
recorridoInOrden(n.der);
}
}
public void recorridoPostOrden(nodo n)
{
if(n!=null)
{
recorridoPostOrden(n.izq);
recorridoPostOrden(n.izq);
JOptionPane.showMessageDialog(null,"Elementos:"+n.info,"Resultados",JOptionPane.INFORMATION_MESSAGE);
}
}
public void busqueda(nodo n,int info)
{
if(info<n.infor)
{
if(n.izq==null)
{
JOptionPane.showMessageDialog(null,"El nodo no se encuentar en el arbol");
}
else
busqueda(n.izq,infor);
}
else
{
if(infor>n.infor)
{
if(n.der==null)
{
JOptionPane.showMessageDialog(null,"El nodo no se encuentar en el arbol");
}
else
busqueda(n.der,infor);
}
else
JOptionPane.showMessageDialog(null,"El nodo se encuentar en el arbol");
}
}
public static void main(String arg[])
{
nodo n =new nodo();
nodo a =new nodo();
n.cargarNodo(a);
n.recorridoEnPreorden(a);
}

}