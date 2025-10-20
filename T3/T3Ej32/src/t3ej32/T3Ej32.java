/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3ej32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULAR EDAD
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Introduzca el dia actual: ");
        int diaActual = entrada.nextInt();
        System.out.println("Introduzca el mes actual: ");
        int mesActual = entrada.nextInt();
        System.out.println("Introduzca el anio actual: ");
        int añoActual = entrada.nextInt();
        
        System.out.println("Ahora introduzca su dia de nacimiento: ");
        int diaNacimiento = entrada.nextInt();
        System.out.println("Introduzca su mes de nacimiento: ");
        int mesNacimiento = entrada.nextInt();
        System.out.println("Introduzca su anio de nacimiento: ");
        int añoNacimiento = entrada.nextInt();
        
                if(diaActual<diaNacimiento){
                mesActual--;
                diaActual = diaActual + 30;
            }
            if(mesActual<mesNacimiento){
                añoActual--;
                mesActual = mesActual + 12;
            }
            
        int dias = Math.abs(diaActual - diaNacimiento);
        int meses = Math.abs(mesActual - mesNacimiento);
        int años = añoActual - añoNacimiento;
            
        
        System.out.println("Su edad exacta es " + años + " anios " + meses + " meses " + dias + " dias.");
    }
    
}
