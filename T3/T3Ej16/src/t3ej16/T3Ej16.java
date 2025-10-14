/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej16;

/**
 *
 * @author alumno
 */
public class T3Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMEROS IMPARES ENTRE 20 Y 160
        
        int i = 20;
        int x = 0;
        
        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son:");
        
        do{
            if(i%2!=0){
                System.out.println(i);
                x++;
            }
            i++;
        } while(i<=160);
        
        System.out.println("La cantidad de numeros impares que hay son: " + x);
    }
    
}
