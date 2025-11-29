/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author lucia
 */
public class Gato extends Felinos {

    //Constructores
    public Gato() {
        super();
    }
    
    public Gato(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }
    
    //Reescribir metodos abstractos de la superclase Animal
    @Override
    public String mostrarSonido(){
        return "Maullido";
    }

    @Override
    public String mostrarAlimentacion(){
        return "Ratones";
    }

    @Override
    public String mostrarHabitat(){
        return "Domestico";
    }  

    @Override
    public String mostrarNombreCientifico(){
        return "Felis silvestris catus";
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Animal = Felino: Gato {" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", peso=" + getPeso() + ", sonido=" + mostrarSonido() + ", alimentacion=" + mostrarAlimentacion() + ", habitat=" + mostrarHabitat() + ", nombre cientifico=" + mostrarNombreCientifico() + '}';
    }
}
