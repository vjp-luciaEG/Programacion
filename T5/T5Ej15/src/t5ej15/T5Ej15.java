/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej15;

/**
 *
 * @author alumno
 */
public class T5Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DATOS DE EMPLEADOS
        
        //Declarar objetos de la clase Direccion
        Direccion d1 = new Direccion("Calle Mayor", 2, 'A', "Caceres");
        Direccion d2 = new Direccion("Calle Principal", 5, 'C', "Plasencia");
        Direccion d3 = new Direccion("Calle Tres", 6, 'B', "Badajoz");
        
        //Declarar objetos de la clase empleado, asignando uno de los objetos de la clase Direccion creados previamente
        Empleado empleado1 = new Empleado("Angel", 600, d1);
        Empleado empleado2 = new Empleado("Lucia", 800, d2);
        Empleado empleado3 = new Empleado("Luis", 1500, d3);
        
        //Mostrar datos de los empleados
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        
    }
    
}
