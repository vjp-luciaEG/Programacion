/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej6;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej6 {

    /**
     * @param args the command line arguments
     */
    
    public static void calificacion(byte nota){
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.err.println("Opcion no valida");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //NOTA
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca su nota: ");
        byte nota = entrada.nextByte();
        
        calificacion(nota);
        
    }
    
}
