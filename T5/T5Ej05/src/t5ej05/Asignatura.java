/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej05;

/**
 *
 * @author lucia
 */
public class Asignatura {
    
    private String nombre;
    private float nota;

    public Asignatura() {
        nombre = "";
        nota = 0;
    }

    public Asignatura(String nom, float not) {
        nombre = nom;
        nota = not;
    }
    
    public Asignatura(String nom){
        nombre = nom;
        nota = 0;
    }
    
    
}
