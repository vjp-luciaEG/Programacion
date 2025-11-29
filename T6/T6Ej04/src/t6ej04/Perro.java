/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public class Perro extends Canidos{
    
    //Constructores
    public Perro() {
        super();
    }
    
    public Perro(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    //Reescribir metodos abstractos de la superclase Animal
    @Override
    public String mostrarSonido(){
        return "Ladrido";
    }

    @Override
    public String mostrarAlimentacion(){
        return "Carnivora";
    }

    @Override
    public String mostrarHabitat(){
        return "Domestico";
    }  

    @Override
    public String mostrarNombreCientifico(){
        return "Canis lupus familiaris";
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Animal = Canido: Perro {" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + ", sonido=" + mostrarSonido() + ", alimentacion=" + mostrarAlimentacion() + ", habitat=" + mostrarHabitat() + ", nombre cientifico=" + mostrarNombreCientifico() + '}';
    }

    
       
    
    
}
