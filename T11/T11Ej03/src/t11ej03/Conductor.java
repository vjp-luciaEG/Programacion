/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Conductor {
    
    //Atributos
    private String dni;
    private String nombre;

    //Constructores
    public Conductor() {
        dni = "";
        nombre = "";
    }

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    //Getters/Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String introducirDni(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el dni:");
        String texto = entrada.nextLine();
        
        return texto;
    }
    
    public static String introducirString(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String texto = entrada.nextLine();
        
        return texto;
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    
}
