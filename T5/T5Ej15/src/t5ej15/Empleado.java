/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej15;

/**
 *
 * @author alumno
 */
public class Empleado {
    
    //Atributos de la clase Empleado
    private String nombre;
    private int salario;
    private Direccion direccion;

    //Constructores
    public Empleado() {
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }

    public Empleado(String nom, int sal, String calleDireccion, int numDireccion, char pisoDireccion, String ciudadDireccion) {
        nombre = nom;
        salario = sal;
        direccion = new Direccion(calleDireccion, numDireccion, pisoDireccion, ciudadDireccion);
    }

    public Empleado(String nom, int sal, Direccion dir) {
        this.nombre = nom;
        this.salario = sal;
        this.direccion = dir;
    }
    
    //Mostrar datos de los atributos de la clase Empleado
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
    
}
