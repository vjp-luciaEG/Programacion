/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public class Leon extends Felinos {
    
    //Constrcutores
    public Leon() {
        super();
    }
    
    public Leon(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    //Reescribir metodos abstractos de la superclase Animal
    @Override
    public String mostrarSonido(){
        return "Rugido";
    }

    @Override
    public String mostrarAlimentacion(){
        return "Carnivora";
    }

    @Override
    public String mostrarHabitat(){
        return "Sabana";
    }  

    @Override
    public String mostrarNombreCientifico(){
        return "Panthera leo";
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Animal = Felino: Leon {" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + ", sonido=" + mostrarSonido() + ", alimentacion=" + mostrarAlimentacion() + ", habitat=" + mostrarHabitat() + ", nombre cientifico=" + mostrarNombreCientifico() + '}';
    }
    
}
