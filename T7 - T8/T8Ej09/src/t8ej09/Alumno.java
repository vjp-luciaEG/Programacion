/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej09;

import java.util.Scanner;
import t8ej09.Asignatura;

/**
 *
 * @author alumno
 */
public class Alumno{
    
    private String nombre;
    private Asignatura[] asignatura;

    public Alumno() {
        nombre = "";
        asignatura = new Asignatura[4];
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignatura = new Asignatura[4];
    }
    
    public Alumno(String nombre, Asignatura[] asignatura) {
        this.nombre = nombre;
        this.asignatura = asignatura;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura[] asignatura) {
        this.asignatura = asignatura;
    }
    
    public void rellenarNotas(){
        Scanner entrada = new Scanner(System.in);
        
        if (asignatura[0] == null) {
            asignatura[0] = new Asignatura("Lengua");
            asignatura[1] = new Asignatura("Mates");
            asignatura[2] = new Asignatura("Historia");
            asignatura[3] = new Asignatura("Fisica");
        }

        System.out.println("\nAlumno: " + this.nombre);

        for (int i = 0; i < asignatura.length; i++) {
            System.out.print("Introduzca la nota de " +asignatura[i].getNombre() + ": ");
            float nota = entrada.nextFloat();
            asignatura[i].setNota(nota);
        }
    }
    
    public float calcularMedia() {
        float suma = 0;
        for (Asignatura a : asignatura) {
            suma += a.getNota();
        }
        return suma / asignatura.length;
    }

    public int calcularSuspensos() {
        int suspensos = 0;
        for (Asignatura a : asignatura) {
            if (a.getNota() < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignatura=" + asignatura + '}';
    }

    
    
}
