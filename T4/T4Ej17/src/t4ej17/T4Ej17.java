/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej17;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class T4Ej17 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo para pedir letra al usuario
    public static char pedirLetra(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivina la letra: ");
        char letra=entrada.nextLine().charAt(0);
        return letra;
    }
    //Metodo para generar letra aleatoria
    public static char generarLetra(){
        int letraAleatoria = (int) (Math.floor(Math.random()*(122-97+1)+97)); //Generamos el valor numerico de la letra aleatoria(Codigo Ascii)
        return (char) letraAleatoria; //Devolvemos el valor en una variable tipo char
    }
    //Metodo para adivinar la letra
    public static void adivinaLaLetra(){
        char letraAleatoria;
        char letra;
        int intentos=0; //Contador de intentos
        do{
            letraAleatoria=generarLetra(); //Declaramos la variable con el método para generar letra aleatoria
            letra=pedirLetra(); //Declaramos la variable con el metodo para pedir letra al usuario
            intentos++;
            if(letra>letraAleatoria){
                System.out.println("La letra a adivinar aparece antes en el alfabeto");
            }
            else{
                System.out.println("La letra a adivinar aparece despues en el alfabeto");
            }
        } while(letra!=letraAleatoria);
        
        System.out.println("Correcto. Lo has conseguido en " + intentos);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //ADIVINAR LA LETRA
        
        adivinaLaLetra();
    }
    
}
