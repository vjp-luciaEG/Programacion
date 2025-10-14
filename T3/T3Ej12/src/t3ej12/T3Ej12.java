/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej12;

/**
 *
 * @author alumno
 */
public class T3Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMEROS PARES ENTRE 11 Y 133
        
        short i=11;
        
        do{
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        } while (11<=i && i<=133);
    }
    
}
