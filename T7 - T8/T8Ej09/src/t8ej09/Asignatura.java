/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombre;
    private float nota;

    public Asignatura() {
        nombre = "";
        nota = 0F;
    }
    
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.nota = 0F;
    }
        
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
