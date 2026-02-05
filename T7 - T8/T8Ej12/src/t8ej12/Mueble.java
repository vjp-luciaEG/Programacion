/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej12;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class Mueble {

    private double precio;
    private String descripcion;

    // Constructor por defecto
    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }

    // Constructor parametrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Métodos para introducir datos
    public String introducirDescripcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la descripcion del mueble: ");
        this.descripcion = entrada.nextLine();
        return this.descripcion;
    }

    public double introducirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el precio: ");
        this.precio = entrada.nextDouble();
        return this.precio;
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
}
