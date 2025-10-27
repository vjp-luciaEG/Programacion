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
        int dato = entrada.nextInt(); //Entrada dato
        return dato; //Devolvemos el dato de entrada
    }
    
    public static boolean errorDato(int dato){
        boolean estado=false; //Comprobamos el estado del dato de entrada suponiendo que es invalido
        if(dato<=0){
            System.err.println("Error: OPCION NO DISPONIBLE \nINTRODUCIR DATO SUPERIOR A 0");
            return estado; //Devolvemos estado invalido
        }
        else{
            estado = true;
            return estado; //Devolvemos estado valido
        }
    }
    
    public static void multiplosDe3(int dato){;
        int numMostrados=0; 
        System.out.println("Multiplos de 3: "); //Calculo de los multiplos de 3(1-->dato de entrada)
        
        for(int i=1;i<=dato;i++){
            if(i%3==0){
                System.out.println(i);
                numMostrados++;
            } 
        }
        System.out.println("Numeros totales mostrados: " + numMostrados);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //MULTIPLOS DE 3
        
        int dato=pedirDato(); //Pedimos el dato de entrada invocando al metodo
        boolean estado=errorDato(dato); //Declaramos el estado del dato de entrada invocando al metodo
        
         while(estado==false){
             dato=pedirDato();  //Si el estado es invalido, reescribimos el dato de entrada
             estado=errorDato(dato); //Volvemos a verificar el estado del dato de entrada
         }
        multiplosDe3(dato); //Si el estado es valido, se ejecuta el metodo
    }

}
