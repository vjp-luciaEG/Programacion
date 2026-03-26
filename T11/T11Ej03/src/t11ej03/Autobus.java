/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej03;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Autobus {
    
    //Atributos
    private String matricula;
    private Map<String,String> conductores;

    //Constructores
    public Autobus() {
        matricula = "";
        conductores = new HashMap<>();
    }

    public Autobus(String matricula, Map<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }

    //Getters/Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, String> conductores) {
        this.conductores = conductores;
    }

    public static String introducirMatricula(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca matricula: ");
        String matricula = entrada.nextLine();
        
        return matricula;
        
    }
    //Metodo para añadir un Conductor al conjunto
    public void introducirConductor(){
        System.out.println("Introduciendo conductor...");
        conductores.put(Conductor.introducirDni(), Conductor.introducirString());
    }
    
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", conductores=" + conductores + '}';
    }
    
    
}
