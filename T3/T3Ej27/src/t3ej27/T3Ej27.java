/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MENU DE CALCULO
        
        Scanner entrada = new Scanner(System.in);
        
        int c;
        byte x = 0;
        
        do{
            System.out.println("Introduzca un numero:");
            int a = entrada.nextInt();
            System.out.println("Introduzca otro numero:");
            int b = entrada.nextInt();
            System.out.println("Indique la operacion que quiera realizar: \n 1 - Suma \n 2 - Resta \n 3 - Multiplicacion \n 4 - Division \n 5 - Salir del programa");
            x = entrada.nextByte();
                
                    switch(x){
                        case 1:
                            c = a + b;
                            System.out.println(a + " + " + b + " = " + c);
                            break;
                        case 2:
                            c = a - b;
                            System.out.println(a + " - " + b + " = " + c);
                            break;
                        case 3:
                            c = a * b;
                            System.out.println(a + " * " + b + " = " + c);
                            break;
                        case 4:
                            try{
                                c = a / b;
                            }
                            catch(ArithmeticException e){
                                System.err.println("Error");
                                c = 0;
                            }
                            System.out.println(a + " / " + b + " = " + c);
                            break;
                        case 5:
                            System.err.println("Exit");
                            break;
                        default:
                            System.err.println("Opcion no disponible");
                    }
               
        } while(x!=5);
    } 
}
