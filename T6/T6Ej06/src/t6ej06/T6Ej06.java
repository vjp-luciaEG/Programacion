/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6ej06;

/**
 *
 * @author alumno
 */
public class T6Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro = new Libro("Harry Potter", "J.K Rowling", "Fantasia");
        
        System.out.println(libro.concatenarTodo());
        System.out.println(libro.obtenerIniciales());
        libro.contarVocales(libro.getGenero());
        System.out.println(libro.obtenerCadenaMasLarga());
        System.out.println(libro.buscarCadena("Fantasia"));
        
        Persona persona = new Persona("Lucia", "Elizo Gomez", "Lucy");
        
        System.out.println(persona.concatenarTodo());
        System.out.println(persona.obtenerIniciales());
        libro.contarVocales("Lucia");
        System.out.println(persona.obtenerCadenaMasLarga());
        System.out.println(persona.buscarCadena("Lucy"));
        
        Transformable libro2 = new Libro("Onix", "L. Smith", "Accion");
        
        System.out.println(libro2.concatenarTodo());
        System.out.println(libro2.obtenerIniciales());
        libro.contarVocales("Onix");
        System.out.println(libro2.obtenerCadenaMasLarga());
        System.out.println(libro2.buscarCadena("L. Smith"));
        
    }
    
}
