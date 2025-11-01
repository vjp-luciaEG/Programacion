/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej20;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class T4Ej20 {

    /**
     * @param args the command line arguments
     */
    //RESPUESTAS DE LAS PREGUNTAS
    final static String RESPUESTA_PREGUNTA_01 = "Madrid";
    final static String RESPUESTA_PREGUNTA_02 = "Colon";
    
    //METODO PREGUNTA 01
    public static int pregunta01(){
        Scanner entrada = new Scanner(System.in);
        int nota01=0;
        boolean iguales;
        
        System.out.println("1 PREGUNTA: Cual es la capital de Espana?: ");
        String respuesta01 = entrada.nextLine();
        
        iguales=respuesta01.equalsIgnoreCase(RESPUESTA_PREGUNTA_01);
        if(iguales==true){
            System.out.println("Respuesta correcta.");
            nota01=nota01+5;
        }
        else{
            System.out.println("Incorrecto. La respuesta es " + RESPUESTA_PREGUNTA_01);
        }
        return nota01; //Devuelve el resultado de la primera pregunta
    }
    
    //METODO PREGUNTA 02
     public static int pregunta02(){
        Scanner entrada = new Scanner(System.in);
        int nota02=0;
        boolean iguales;
        System.out.println("2 PREGUNTA: Quien descubrio America?: ");
        String respuesta02 = entrada.nextLine();
        
        iguales=respuesta02.equalsIgnoreCase(RESPUESTA_PREGUNTA_02);
        if(iguales==true){
            System.out.println("Respuesta correcta.");
            nota02=nota02+5;
        }
        else{
            System.out.println("Incorrecto. La respuesta es " + RESPUESTA_PREGUNTA_02);
        }
        return nota02; //Devuelve el resultado de la segunda respuesta
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //EXAMEN PREGUNTAS Y RESPUESTAS
        
        int nota=0;
       
        System.out.println("EXAMEN DE CULTURA GENERAL");
        //Almacenamos los resultados de las preguntas
        int nota01=pregunta01();
        int nota02=pregunta02();
        
        nota=nota01 + nota02; //Sumamos los resultados para obtener la nota total
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
    
}
