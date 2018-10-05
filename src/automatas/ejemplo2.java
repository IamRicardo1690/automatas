
package automatas;

/**
 *
 * @author Ricardo S.M
 */
public class ejemplo2 
{
    int cont;
    boolean aceptado;
    char [] car;
    
    public static void main(String[] args)
    {
        ejemplo2 validar=new ejemplo2();
        String cadena ="0101010";
        validar.car = cadena.toCharArray();
        validar.inicio();
        
       // if(validar.aceptado)
         //   System.out.println("cadena aceptada");
        //else
          //  System.out.println("cadena no acpetada");
    }
    public void inicio(){
        cont=0;
        aceptado=false;
        s0();
    }
    public void s0(){
        System.out.println("en s0");
        aceptado=true;
        if(cont<car.length){
            if(car[cont]=='0'){
                cont++;
                s1();
            }else if (car[cont]=='1'){
                cont++;
                s2();
            }
        }
    }
    public void s1(){
        System.out.println("en s1");
        if(cont<car.length){
            
            if(car[cont]=='1'){
                cont++;
                s3();
            }else if (car[cont]=='0'){
                cont++;
                s0();
            }
        }
    }
    public void s2(){
        System.out.println("en s0");
        if(cont<car.length){
            
            if(car[cont]=='0'){
                cont++;
                s3();
            }else if (car[cont]=='1'){
                cont++;
                s2();
            }
        }
    }
    public void s3(){
        System.out.println("en s3");
        if(cont<car.length){
            
            if(car[cont]=='0'){
                cont++;
                s2();
            }else if (car[cont]=='1'){
                cont++;
                s3();
            }
        }
    }
    public void error(){
        //System.out.println("automata incorrecto");
        aceptado=false;
        return;
    }
    
}
