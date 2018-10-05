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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Complemento1 {
    //Declaración de las variables
    public static String cadena, cadena2,aux;       
    public static BufferedReader reader;
    public static int longitud;
    public String complemento="";
    public String arreglo[];
    public int apuntador=1;
 
 
    //El constructor del objeto te muestra la cadena ingresada
    public Complemento1(){
        System.out.println("Cadena: "+cadena); 
        decodificar(cadena);
    }
 
    //Metodo decodificar se encarga de crear el arreglo que contendrá la cadena
    public void decodificar(String dec){
        cadena2="#"+cadena+"#";
        longitud = cadena2.length();
        arreglo = new String[longitud];
        for(int i=0;i<longitud;i++){
            arreglo[i]=""+cadena2.charAt(i);
        }
        e0();
    }
     
    //El metodo e0 representa al estado 0, el estado inicial
    public void e0(){
        aux= arreglo[apuntador];
        if (aux.equals("0")){
            arreglo[apuntador]="1";
            moverDerecha();
            e1();
        }
        else if (aux.equals("1")){
            arreglo[apuntador]="0";
            moverDerecha();
            e1();
        }
        else if (aux.equals("#")){
            arreglo[apuntador]="#";
            moverIzquierda();
            System.out.println("Cadena vacia");
        }else{
            rechazar(aux);
        }
             
    }
 
    //El metodo e1 representa al estado 1
    public void e1(){
        aux= arreglo[apuntador];
        if (aux.equals("0")){
            arreglo[apuntador]="1";
            moverDerecha();
            e1();
        }
        else if (aux.equals("1")){
            arreglo[apuntador]="0";
            moverDerecha();
            e1();
        }
        else if (aux.equals("#")){
            arreglo[apuntador]="#";
            moverIzquierda();
            e2();
        }else{
            rechazar(aux);
        }
    }
 
    //El metodo e2 representa al estado 2
    public void e2(){
        aux= arreglo[apuntador];
        if (aux.equals("0")){
            arreglo[apuntador]="0";
            moverIzquierda();
            e2();
        }
        else if (aux.equals("1")){
            arreglo[apuntador]="1";
            moverIzquierda();
            e2();
        }
        else if (aux.equals("#")){
            arreglo[apuntador]="#";
            moverDerecha();
            e3();
        }else{
            rechazar(aux);
        }
    }
 
    //El metodo e3 representa al estado 3, el estado de aceptación
    public void e3(){
 
        for(int i=1;i<longitud-1;i++){
            complemento=complemento+arreglo[i];
        }
        System.out.println("El complemento a 1 de: "+ cadena +" es: "+ complemento);
    }
 
 
 
    //Mueve el puntero de la MT a la derecha
    public void moverDerecha(){
        apuntador++;
    }
     
    //Mueve el puntero de la MT a la izquierda
    public void moverIzquierda(){
        apuntador=apuntador-1;
    }
 
    //Si entra en este estado, significa que se encontró un caracter no valido
    public void rechazar(String noval){
        System.out.println("Caracter no valido: "+noval);
    }
 
 
 
    //Pide el numero binario y lo guarda en la variable cadena
    public static void main(String args[]){
        System.out.println("Ingrese numero binario: ");
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            cadena = reader.readLine();
        }catch(IOException e){
            e.getMessage();
        }
 
        Complemento1 obj = new Complemento1();
    }
}
