/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public class Lobo extends Canidos {

    //Constructores
    public Lobo() {
        super();
    }
    
    public Lobo(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }

    //Reescribir metodos abstractos de la superclase Animal
    @Override
    public String mostrarSonido(){
        return "Aullido";
    }

    @Override
    public String mostrarAlimentacion(){
        return "Carnivora";
    }

    @Override
    public String mostrarHabitat(){
        return "Bosque";
    }  

    @Override
    public String mostrarNombreCientifico(){
        return "Canis lupus";
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Animal = Canido: Lobo {" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + ", sonido=" + mostrarSonido() + ", alimentacion=" + mostrarAlimentacion() + ", habitat=" + mostrarHabitat() + ", nombre cientifico=" + mostrarNombreCientifico() + '}';
    }
    
    
    
}
