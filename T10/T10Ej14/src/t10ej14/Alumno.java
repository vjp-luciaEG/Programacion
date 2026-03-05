/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10ej14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    private String nombre;
    private Asignatura[] asignaturas;

    public Alumno() {
        nombre = "";
        asignaturas = new Asignatura[3];
        for(int i = 0; i<asignaturas.length;i++){
            asignaturas[i] = new Asignatura();
        }
    }

    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        for(int i = 0; i<asignaturas.length;i++){
            asignaturas[i] = new Asignatura();
        }
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[3];
        for(int i = 0; i<asignaturas.length;i++){
            asignaturas[i] = new Asignatura();
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    public static Asignatura[] introducirAsignaturas(){
        Scanner entrada = new Scanner(System.in);
        Asignatura[] asignaturas = new Asignatura[3];
        String[] nombres = {"Lengua","Mates","Fisica"};
        for(int i = 0; i<asignaturas.length;i++){
           System.out.println(nombres[i] + ":");
           asignaturas[i] = new Asignatura(nombres[i], Asignatura.introducirNota());
        }
        return asignaturas;
    }
    public static Alumno introducirAlumno(){
       Alumno alumno = new Alumno(introducirNombre(), introducirAsignaturas());
       return alumno;
    }
    
    public void mostrarAsignaturas(){
        for(Asignatura a : asignaturas){
            System.out.println(a);
        }
    }
    
    @Override
    public String toString() {
        return "Alumno:\n" + "Nombre=" + nombre;
    }
    
    
}
