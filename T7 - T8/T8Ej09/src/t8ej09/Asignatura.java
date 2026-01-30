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
    
    public static double [][] rellenarNotas(Alumno[] alumnos){
        Scanner entrada = new Scanner(System.in);
        
        double nota = 0;
        
        //Recorremos cada posicion de la combinacion de los arrays alumnos[i] y asignaturas[j]
        for(int i = 0; i < alumnos.length; i++){
            System.out.println("Introduce las notas de " + alumnos[i] + ":"); //Posicion del alumno
            for(int j = 0; j < asignaturas.length; j++){
                do{
                    System.out.println(asignaturas[j] + ":");
                    nota = entrada.nextDouble();    //Introducimos la nota de cada asignatura del alumno[i]
                    if(nota < 0 || nota > 10){
                        System.out.println("Nota invalida.");  //Controlamos el rango de la nota 0-10
                    }
                }while(nota<0 || nota>10);
                notas[i][j]= nota; //Introducimos las notas de cada asignatura de un alumno en el array notas[][]
            }
        }
        return notas;
    }
    
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
