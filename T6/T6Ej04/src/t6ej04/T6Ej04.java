/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public class T6Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objetos de las subclases
        Perro perro01 = new Perro("Dog", 3, 32);
        Lobo lobo01 = new Lobo("Wolf", 5, 40.5);
        Leon leon01 = new Leon("Lion", 8, 60.5);
        Gato gato01 = new Gato("Cat", 3, 3.5);
        
        //Informacion de objetos de las subclases
        System.out.println(perro01);
        System.out.println(lobo01);
        System.out.println(leon01);
        System.out.println(gato01);
        
        //Polimorfismo
        System.out.println("Polimorfismo");
        //Creamos objeto de la superclase Animal
        Animal animal;  
        
        //Establecemos al objeto de la superclase las caracteristicas de la subclase
        animal = new Perro("Dog", 5, 9.3);
        System.out.println(animal);
        animal = new Gato("Cat", 4, 2.5);
        System.out.println(animal);
        animal = new Lobo("Wolf", 6, 23.5);
        System.out.println(animal);
        animal = new Leon("Lion", 2, 15.2);
        System.out.println(animal);
    }
    
}
