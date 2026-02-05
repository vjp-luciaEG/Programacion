/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T8Ej06 {

    /**
     * @param args the command line arguments
     */
    public static int elegirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        do{
            System.out.println("Cuantos empleados desea introducir? ");
            
            try{
                longitud = entrada.nextInt();
            } 
            catch(InputMismatchException e) {
                System.out.println(e);
                System.out.println("Dato erroneo. Introducir numero entero.");
            }
            finally {
                entrada.nextLine();
            }
     
        } while(longitud<0);
        
        return longitud;
    }
    
    public static void introducirEmpleados(Empleado[] empleado){
        for(int i = 0; i < empleado.length; i++){

            System.out.println("Empleado " + (i+1));

            Empleado e = new Empleado();

            String nombre = e.introducirNombre();
            int horas = e.introducirHoras();
            float tarifa = e.introducirTarifa();

            empleado[i] = new Empleado(nombre, horas, tarifa);
        }
    }
    
    public static void mostrarSueldosBrutos(Empleado[] empleado){
       for(Empleado e:empleado){
           e.calcularSueldoBruto();
       }
    }
    
    public static void mostrarDatosEmpleados(Empleado[] empleado){
       for(Empleado e:empleado){
           System.out.println(e);
       }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] empleado = new Empleado[elegirLongitud()];
        
        introducirEmpleados(empleado);
        mostrarSueldosBrutos(empleado);
         
      
    }
    
}
