/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public abstract class Canidos extends Animal {

    //Constructores
    public Canidos() {
        super();
    }
    
    public Canidos(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Animal = Canido{" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + '}';
    }
    
}
