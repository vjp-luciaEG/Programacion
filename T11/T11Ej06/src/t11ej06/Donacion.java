/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej06;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Donacion implements Comparable<Donacion>{
    
    //Atributos
    private String nombreDonante;
    private double cantidad;

    //Constructores
    public Donacion() {
        nombreDonante = "";
        cantidad = 0;
    }

    public Donacion(String nombreDonante, double cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }

    //Getters/Setters
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
    
    //Metodos para introducir datos por pantalla
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

    //Metodo de la interfaz Comparable necesario para el orden del TreeSet 
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
