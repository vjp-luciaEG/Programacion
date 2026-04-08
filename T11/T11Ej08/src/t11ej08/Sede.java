/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej08;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Sede implements Comparable<Sede>{
    
    //Atributos
    private String nombre;
    private double ingresoAnual;
    
    //Constructores
    public Sede() {
        nombre = "";
        ingresoAnual = 0;
    }

    public Sede(String nombre, double ingresoAnual) {
        this.nombre = nombre;
        this.ingresoAnual = ingresoAnual;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(double ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }

    //Metodos para introducir valores a atributos
    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String texto = entrada.nextLine();
        
        return texto;
    }
    
    public static double introducirIngresos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca ingresos:");
        double ingresos = entrada.nextDouble();
        
        return ingresos;
    }
    
    //Metodo interfaz Comparable para orden del TreeSet por mayor valor de ingresos
    @Override
    public int compareTo(Sede o) {
        if(this.ingresoAnual > o.getIngresoAnual()) {
            return -1;
        } else if (this.ingresoAnual < o.getIngresoAnual()) {
            return 1;
        } else {
            return 0;
        }  
    }
    
    @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresoAnual=" + ingresoAnual + '}';
    }
    
    
}
