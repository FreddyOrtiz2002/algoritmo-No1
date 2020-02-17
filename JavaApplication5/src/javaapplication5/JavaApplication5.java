package javaapplication5;
public class JavaApplication5 {
    public static void main(String[] args) {
       long acumulador = 0;
       for(int i=0;i<100000000;i++)
       {
           if(i%2!=0)
           {
              acumulador=acumulador+i;
           }
       }
        System.out.println("el valor de la suma de los numero impares del 1 al 100000000 es: "+acumulador);
    }
    
}
