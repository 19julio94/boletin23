
package boletin23;

import java.util.Scanner;


public class Boletin23 {

    
    public static void main(String[] args) {
      
        float cambio,euros;
        
        Scanner obx= new Scanner(System.in);
        
        System.out.println("introduceme a cuanto esta el dolar respecto a 1 euro:");
        cambio = obx.nextFloat();
        
        System.out.println("Introduce los euros:");
        euros = obx.nextFloat();
        
        System.out.println("La cantidad de euros en dolares son: "+ (euros*cambio)+"$");
        
        
    }
    
}
