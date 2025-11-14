/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej16;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    //Atributos de la clase Alumno
    private String nombre;
    private int nota;
    
    //Constructores

    public Alumno() {
        nombre = "";
        nota = 0;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters/Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(int nota){
        this.nota = nota;
    }
    
    //Metodos
    public static void mostrarCalificacion(int nota){
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:{
                System.err.println("Suspenso");
                break;
            }
            case 5:
            case 6:{
                System.out.println("Bien");
                break;
            }
            case 7:
            case 8:{
                System.out.println("Notable");
                break;
            }
            case 9:
            case 10:{
                System.out.println("Sobresaliente");
                break;
            }
            default:{
                System.err.println("Error. Introduzca un numero entre 0 y 10");
            }
        }
    }
    
    //Mostrar datos de Alumno
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
