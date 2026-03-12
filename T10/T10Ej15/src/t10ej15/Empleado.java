/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10ej15;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Empleado {
    
    //Atributos
    private String nombreEmpleado;
    private int sueldo;

    //Constructores
    public Empleado() {
        nombreEmpleado = "";
        sueldo = 0;
    }

    public Empleado(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    //Getters/Setters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    //Introducir atributos por usuario
    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        
        return nombre;
    }
    
    public static int introducirSueldo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Sueldo: ");
        int sueldo = entrada.nextInt();
        
        return sueldo;
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
