/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Donacion implements Comparable<Donacion> {
    
    private String nombreDonante;
    private double cantidad;

    public Donacion() {
        nombreDonante = "";
        cantidad = 0;
    }

    public Donacion(String nombreDonante, double cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir nombre:");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static double introducirCantidad(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir cantidad:");
        double cantidad = entrada.nextDouble();
        return cantidad;
    }

    @Override
    public int compareTo(Donacion o) {
        if(this.cantidad > o.getCantidad()) {
            return -1;
        } else if (this.cantidad < o.getCantidad()) {
            return 1;
        } else {
            return 0;
        }  
    }
    
    
    @Override
    public String toString() {
        return "Donacion{" + "nombreDonante=" + nombreDonante + ", cantidad=" + cantidad + '}';
    }
}
