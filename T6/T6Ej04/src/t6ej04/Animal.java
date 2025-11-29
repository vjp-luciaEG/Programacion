/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public abstract class Animal {
    
    //Atributos
    private String nombre;
    private int edad;
    private double peso;
    
    //Constructores
    public Animal() {
        nombre = "";
        edad = 0;
        peso = 0;
    }

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    //Getters/Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    //Metodos abstractos
    public abstract String mostrarSonido();
    
    public abstract String mostrarAlimentacion();
    
    public abstract String mostrarHabitat();
    
    public abstract String mostrarNombreCientifico();
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
}
