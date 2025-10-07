/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej06;
import java.util.Scanner;

/**
 *
 * @author Lucia
 */
public class T3Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NOTAS DEL ALUMNO
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Porfavor, introduzca su nota:");
        float nota = entrada.nextFloat(); //Declaramos la variable de entrada
        
        //Condicional variable nota
        if (nota < 0 || nota > 10){
            System.out.println("Error");
        } else if (nota <= 4){
            System.out.println("Suspenso");
        } else if (nota <=6){
            System.out.println("Bien");
        } else if (nota <=8){
            System.out.println("Notable");
        } 
        else {
            System.out.println("Sobresaliente");
        }
         
    }
    
}
