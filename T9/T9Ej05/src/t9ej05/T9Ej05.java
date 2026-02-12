/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9Ej05 {

    /**
     * @param args the command line arguments
     */
    
    public static String introducirString(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un dia de la semana: ");
        String texto = entrada.nextLine();
        
        return texto;
    }
    public static void mostrarPosicion(String diaSemana){
        String[] diasSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        boolean encontrado=false;
        int i = 0;
        while(!encontrado && i<diasSemana.length){
           if(diaSemana.equalsIgnoreCase(diasSemana[i])){
               encontrado = true;
               System.out.println("El " + diaSemana + " es el " + (i+1) + " de la semana.");
           }
           i++;
        }
        
        if(!encontrado){
            System.err.println("El dia no existe.");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarPosicion(introducirString());
    }
    
}
