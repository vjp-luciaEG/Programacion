/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej28;

/**
 *
 * @author alumno
 */
public class T3Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMERO ALEATORIO
        
        double aleatorio = Math.floor((Math.random())*101+1);
        
        if (aleatorio % 2 == 0){
            System.out.println(aleatorio + ": Es un numero par");
        }
        else{
            System.out.println(aleatorio + ": Es un numero impar");
        }
    }
    
}
