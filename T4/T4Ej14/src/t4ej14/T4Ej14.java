/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4Ej14 {

    /**
     * @param args the command line arguments
     */
    public static int pedirDato(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int dato = entrada.nextInt();
        return dato;
    }
    
    public static int errorDato(int dato){
        dato=pedirDato();
        if(dato<=0){
            System.err.println("Error: OPCION NO DISPONIBLE \n INTRODUCIR DATO SUPERIOR A 0");
        }
        return dato;
    }
    
    public static void multiplosDe3(int dato ){
        int num=1;
        int numMostrados=0;
        System.out.println("Multiplos de 3: ");
        while(num>=1 && num<=dato){
            if(dato%3==0){
                System.out.println(num);
                numMostrados++;
            }
            num++;
        }
        System.out.println("Numeros totales mostrados: " + numMostrados);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //MULTIPLOS DE 3
        
        int dato=pedirDato();
        
        do{
            pedirDato();
            errorDato(pedirDato());
        } while(dato<=0);
        
        multiplosDe3(dato);
        
        
    }

}
