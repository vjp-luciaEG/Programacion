/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej16;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej16 {

    /**
     * @param args the command line arguments
     */
    public static double [][] rellenarNotas(String[] alumnos, String[] asignaturas, double[][] notas){
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        for(int i = 0; i < alumnos.length; i++){
            System.out.println("Introduce las notas de " + alumnos[i] + ":");
            for(int j = 0; j < asignaturas.length; j++){
                do{
                    System.out.println(asignaturas[j] + ":");
                    nota = entrada.nextDouble();
                    if(nota < 0 || nota > 10){
                        System.out.println("Nota invalida.");
                    }
                }while(nota<0 || nota>10);
                notas[i][j]= nota;
            }
        }
        return notas;
    }
    
    public static void mostrarNotas(String[] alumnos, String[] asignaturas, double [][] notas){
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){              
                    System.out.print(" [" + alumnos[i] + " - " + asignaturas[j] + "]-->" + notas[i][j] + "");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] alumnos = {"Pepe","Juan","Ana","Marta","Pedro","Maria"};
        String[] asignaturas = {"Lengua","Mates","Historia","Fisica"};
        
        double[][] notas = new double[alumnos.length][asignaturas.length];
        mostrarNotas(alumnos, asignaturas, rellenarNotas(alumnos, asignaturas, notas));
    }
    
}
