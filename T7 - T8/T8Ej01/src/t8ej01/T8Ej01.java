/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T8Ej01 {

    /**public static double calcularNotaMedia(Asignaturas[] asignaturas){
        double suma, media;
        for(double n:asignaturas){
           suma += n;
        }
    }
     * @param args the command line arguments
     */
    
    public static double calcularNotaMedia(Asignaturas[] asignaturas){
        double suma = 0, media;
        for(Asignaturas n:asignaturas){
            suma += n.getNota();
        }
        media = suma/asignaturas.length;
        return media;
    }
    
    public static double introducirNota(Asignaturas asignatura){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la nota de " + asignatura.getNombre() + ":");
        double nota = entrada.nextDouble();
        
        return nota;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Asignaturas[] asignaturas = new Asignaturas[6];
        
        asignaturas[0] = new Asignaturas("Programacion");
        asignaturas[0].setNota(introducirNota(asignaturas[0]));

        asignaturas[1] = new Asignaturas("Lenguaje de Marcas");
        asignaturas[1].setNota(introducirNota(asignaturas[1]));

        asignaturas[2] = new Asignaturas("Bases de datos");
        asignaturas[2].setNota(introducirNota(asignaturas[2]));

        asignaturas[3] = new Asignaturas("Entornos de desarrollo");
        asignaturas[3].setNota(introducirNota(asignaturas[3]));

        asignaturas[4] = new Asignaturas("Sistemas Informaticos");
        asignaturas[4].setNota(introducirNota(asignaturas[4]));

        asignaturas[5] = new Asignaturas("Formacion y Orientacion Laboral");
        asignaturas[5].setNota(introducirNota(asignaturas[5]));

        System.out.println("La nota media del curso es: " + calcularNotaMedia(asignaturas));
        
    }
    
}
