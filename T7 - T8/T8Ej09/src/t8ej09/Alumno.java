/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej09;

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

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignatura=" + asignatura + '}';
    }

    
    
}
