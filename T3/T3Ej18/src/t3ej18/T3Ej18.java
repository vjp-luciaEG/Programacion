/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONTRASEÑA 
        
        Scanner entrada = new Scanner(System.in);
        
        int clave = 9876;
        int error = 0;
        int confirmacion = 1;
        
        do{
            System.out.println("Introduzca clave: ");
            int claveUsuario = entrada.nextInt();
                if(claveUsuario == clave){
                    System.out.println("Acceso permitido");
                    confirmacion--;
                }
                else{
                    error++;
                }
                switch(error){
                    case 3: 
                        System.err.println("Error");
                        break;
                }
        } while (error<3 ^ confirmacion == 0);
    }
    
}
