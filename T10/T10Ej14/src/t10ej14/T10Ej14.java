/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10Ej14 {

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
        System.out.println("1-Introducir un nuevo alumno.");
        System.out.println("2-Mostrar alumnos");
        System.out.println("3-Mejor alumno de la clase");
        System.out.println("4-Asignatura mas dificil");
        System.out.println("5-Salir.");
    }
    
    public static void introducirAlumnoYNotas(ArrayList<Alumno> alumnos){
        alumnos.add(Alumno.introducirAlumno());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        int opcion = 0;
        do{
            mostrarMenu();
            System.out.println("Introduce una opcion: ");
            opcion = introducirOpcion();
            switch (opcion) {
                case 1:{
                    introducirAlumnoYNotas(alumnos);
                    break;
                }
                case 2: {
                    
                    break;
                }   
                case 3: {
                    
                    break;
                }
                case 4: {
                  
                    break;
                }
                case 5: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
            
        } while(opcion!=5);
    }
    
}
