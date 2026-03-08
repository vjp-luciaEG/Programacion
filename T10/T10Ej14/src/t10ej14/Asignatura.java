/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10ej14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Asignatura {
    
    //Atributos
    private String nombre;
    private float nota;

    //Constructores
    public Asignatura() {
        nombre = "";
        nota = 0F;
    }

    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters/Setters
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
    
    //Introducir atributos 
    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de asignatura: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static float introducirNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota: ");
        float nota = entrada.nextFloat();
        return nota;
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
