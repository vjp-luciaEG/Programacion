/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public abstract class Felinos extends Animal {

    //Constructores
    public Felinos() {
        super();
    }
    
    public Felinos(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
     //Mostrar datos
    @Override
    public String toString() {
        return "Animal = Felino{" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + '}';
    }
}
