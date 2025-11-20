/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej19;
/**
 *
 * @author alumno
 */
public class T5Ej19 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //SUELDO BRUTO TRABAJADORES
        
        //Creamos los objetos de la clase Empleado
        Empleado empleado1 = new Empleado("Juan", 35, 8.5);
        Empleado empleado2 = new Empleado("Sara", 50, 9.8);
        Empleado empleado3 = new Empleado("Lucas", 42, 10);
        //Mostramos los datos de los empleados
        System.out.println( empleado1.getNombre() + " ha trabajado " + empleado1.getHorasTrabajadas() + " Horas, cobra " + empleado1.getTarifaPorHora() + " Euros la hora, por lo que le corresponde un sueldo de " + empleado1.calcularSueldoBruto( empleado1.getNombre(), empleado1.getHorasTrabajadas(), empleado1.getTarifaPorHora()) + " Euros.");
        System.out.println( empleado2.getNombre() + " ha trabajado " + empleado2.getHorasTrabajadas() + " Horas, cobra " + empleado2.getTarifaPorHora() + " Euros la hora, por lo que le corresponde un sueldo de " + empleado2.calcularSueldoBruto( empleado2.getNombre(),  empleado2.getHorasTrabajadas(), empleado2.getTarifaPorHora()) + " Euros.");
        System.out.println( empleado3.getNombre() + " ha trabajado " + empleado3.getHorasTrabajadas() + " Horas, cobra " + empleado3.getTarifaPorHora() + " Euros la hora, por lo que le corresponde un sueldo de " + empleado3.calcularSueldoBruto( empleado3.getNombre(), empleado3.getHorasTrabajadas(), empleado3.getTarifaPorHora()) + " Euros.");
    }
    
}
