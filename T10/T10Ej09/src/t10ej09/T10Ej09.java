/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10Ej09 {

    /**
     * @param args the command line arguments
     */
    
    public static int introducirOpcion(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void mostrarMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1-Rellenar temperaturas aleatoriamente.");
        System.out.println("2-Mostrar temperaturas.");
        System.out.println("3-Visualizar temperatura media");
        System.out.println("4-Dias mas caluroso del mes");
        System.out.println("5-Salir.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = 0;
        do{
            mostrarMenu();
            switch(opcion = introducirOpcion()){
                case 1:{
                    
                    break;
                }
                case 2:{
                    
                    break;
                }
                case 3:{
                    
                    break;
                }
                case 4:{
                    
                    break;
                }
                case 5: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
            
        }while(opcion!=5);
    }
    
}
