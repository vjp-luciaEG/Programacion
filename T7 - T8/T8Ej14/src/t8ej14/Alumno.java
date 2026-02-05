/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej14;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Alumno {
    
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0.0;
    }

    // Constructor parametrizado
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // Métodos para introducir datos
    public String introducirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.nombre = entrada.nextLine();
        return this.nombre;
    }

    public int introducirEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        this.edad = entrada.nextInt();
        return this.edad;
    }

    public double introducirNotaMedia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota media: ");
        this.notaMedia = entrada.nextDouble();
        return this.notaMedia;
    }

    // Método para crear un alumno completo
    public static Alumno crearAlumno() {
        Alumno a = new Alumno();
        a.introducirNombre();
        a.introducirEdad();
        a.introducirNotaMedia();
        return a;
    }

    // Método para mostrar datos
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
    
    
}
