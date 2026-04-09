/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Producto {
    
    private String nombre;
    private float precio;
    private int stock;

    public Producto() {
        nombre = "";
        precio = 0F;
        stock = 0;
    }

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del producto:");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static float pedirPrecio(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el precio del producto:");
        float precio = entrada.nextFloat();
        return precio;
    }
    
    public static int pedirStock(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el stock del producto:");
        int stock = entrada.nextInt();
        return stock;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
