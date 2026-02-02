/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej06;

/**
 *
 * @author alumno
 */
public class T8Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] empleado = new Empleado[2];
        
        empleado[0] = new Empleado("Lucia", 60, 2.5F);
        empleado[1] = new Empleado("Angel", 30, 2.5F);
         
        System.out.println(empleado[0]);
        empleado[0].calcularSueldoBruto();
        System.out.println(empleado[1]);
        empleado[1].calcularSueldoBruto();
    }
    
}
