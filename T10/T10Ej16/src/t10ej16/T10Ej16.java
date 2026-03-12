/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10Ej16 {

    /**
     * @param args the command line arguments
     */
    
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static void mostrarMenuPrincipal(){
        System.out.println("=== MENU ===");
        System.out.println("1-MENU DE ADMINISTRACION");
        System.out.println("2-MENU DE COMPRA");
        System.out.println("3-SALIR");
    }
    
    public static void mostrarMenuAdmin(){
        System.out.println("=== MENU DE ADMINISTRACION ===");
        System.out.println("1-Introducir productos en la lista");
        System.out.println("2-Visualizar la lista de productos");
        System.out.println("3-Eliminar productos de la lista");
        System.out.println("4-Volver al menu principal");
    }
    
    public static void mostrarMenuCompra(){
        System.out.println("=== MENU DE COMPRA ===");
        System.out.println("1-Comprar productos");
        System.out.println("2-Volver al menu principal");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Producto> listaCompra = new ArrayList<>();
        
        int opcion = 0;
        do{
            mostrarMenuPrincipal();
            opcion = introducirOpcion();
            
            switch (opcion) {
                case 1: {
                    do{
                        mostrarMenuAdmin();
                        opcion = introducirOpcion();
                        
                        switch (opcion) {
                            case 1:{
                                
                                break;
                            }
                            case 2: {
                                
                                break;
                            }
                            case 3: {
                                
                                break;
                            }
                            case 4: {
                                System.err.println("Volviendo al menu principal...");
                                break;
                            }
                            default:
                                System.err.println("Opcion no disponible");
                        }
                        
                        
                    }while(opcion!=4);
                    break;
                }
                case 2: {
                    do{
                        mostrarMenuCompra();
                        opcion = introducirOpcion();
                        
                        switch (opcion) {
                            case 1:{
                                
                                break;
                            }
                            case 2: {
                                System.err.println("Volviendo al menu principal...");
                                break;
                            }
                            default:
                                System.err.println("Opcion no disponible");
                        }
                        
                        
                    }while(opcion!=4);
                    break;
                }
                case 3:{
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
        }while(opcion!=3);
        
    }
    
}
