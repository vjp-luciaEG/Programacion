/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej31;

/**
 *
 * @author alumno
 */
public class T3Ej31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3 NUMEROS IMPARES ALEATORIOS
         
         byte impar = 0;
         int cantidadValores = 0;
         
         while(impar<3){
             double aleatorio = Math.floor((Math.random())*101+1);
             
             if(aleatorio%2!=0){
                 System.out.println(aleatorio);
                 impar++;
             }
             cantidadValores++;
         }
         System.out.println("Cantidad valores generados: " + cantidadValores);
    }
    
}
