/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej09;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T8Ej09 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void mostrarNotas(String[] alumnos, String[] asignaturas, double [][] notas){
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){              
                    System.out.print(" [" + alumnos[i] + " - " + asignaturas[j] + "]-->" + notas[i][j] + "");
            }
            System.out.println("\n");
        }
    }
    
    public static void mejorMediaAlumno(double [][] notas, String[] alumnos){
        double mejorMedia = -1, media = 0;
        String mejorAlumno = alumnos[0];
        
        //Recorremos el array alumnos
        for (int i = 0; i < alumnos.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) { //Recorremos el array notas[][] y sumamos las notas del alumno[i]
                suma += notas[i][j];            
            }
            
            media = suma / notas[i].length; //Obtenemos la media
            
            if (media > mejorMedia) {   //Comparamos para obtener la mejor media
                mejorMedia = media;
                mejorAlumno = alumnos[i];
            }
        }

        System.out.println("El mejor alumno de la clase es " + mejorAlumno + " con una media de " + mejorMedia);
    }
    
    public static void alumnoMasSuspensos(double[][] notas, String[] alumnos) {
        int maxSuspensos = -1;
        String alumnoMax = alumnos[0];
        
        //Recorremos el array alumnos
        for (int i = 0; i < alumnos.length; i++) {
            int suspensos = 0;
            for (int j = 0; j < notas[i].length; j++) { //Recorremos el array notas[][] del alumno[i]
                if (notas[i][j] < 5) {  //Si la nota es menos que 5
                    suspensos++;    //+1 al contador de suspensos
                }
            }
            if (suspensos > maxSuspensos) { //Comparamos para obetener el mayor numero de suspensos
                maxSuspensos = suspensos;
                alumnoMax = alumnos[i];
            }
        }

        System.out.println("El alumno con mas suspensos es " + alumnoMax + " con " + maxSuspensos + " suspensos.");
    }
    
    public static void asignaturaMasDificil(double[][] notas, String[] asignaturas) {
        double mediaMin = 10, media = 0;
        String asignaturaDificil = asignaturas[0];
        
        //Recorremos el array asignaturas
        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < notas[j].length; i++) { //Recorremos el array notas[][] de cada asignatura[i]
                suma += notas[i][j]; //Sumamos las notas de la asignatura
            }
            
            media = suma / notas[j].length; //Calculamos la media
            
            if (media < mediaMin) { //Comparamos para obtener la menor media
                mediaMin = media;
                asignaturaDificil = asignaturas[j];
            }
        }
        System.out.println("La asignatura mas dificil es " + asignaturaDificil + " con una media de " + mediaMin);
    }
    
    public static void mostrarMenu(){
        System.out.println("===== MENU ======");
        System.out.println("1-Rellenar notas de alumnos.");
        System.out.println("2-Mostrar notas.");
        System.out.println("3-Mejor alumno de la clase.");
        System.out.println("4-Alumno con mas suspensos.");
        System.out.println("5-Asignatura mas dificil.");
        System.out.println("6-Salir.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno[] alumno = new Alumno[3];
        
        
    }
    
}
