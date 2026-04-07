/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej08;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author lucia
 */
public class Ciudad {
    
    //Atributos
    private String nombre;
    private Set<Sede> sedes; 
    
    //Constructores
    public Ciudad() {
        nombre = "";
        sedes = new TreeSet<>();
    }

    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }

    //Metodo para introducir una donacion al conjuntoDonaciones
    public static Set<Sede> aniadirSede(){
        Scanner entrada = new Scanner(System.in);
        Set<Sede> sedes = new TreeSet<>();
        
        String respuesta;
       
        do {
            System.out.println("SEDES");
            
            sedes.add(new Sede(Sede.introducirNombre(), Sede.introducirIngresos()));  //Introducimos el numero de sedes que desee el usuario 
            System.out.println("Desea introducir mas sedes?");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));
        
        return sedes;
    }
    public boolean buscarSedes(String nombre){
        Iterator<Sede> it = sedes.iterator();
        
        boolean encontrado = false;
        
        while(it.hasNext() && !encontrado){
            Sede sede = it.next();
           if(sede.getNombre().equalsIgnoreCase(nombre)){
               encontrado = true;
           }
        }
        return encontrado;
    }
    //Metodo para mostrar el conjunto de Sedes
    public void mostrarSedes(){
        System.out.println("SEDES");
        for(Sede s : sedes){
            System.out.println(s);
        }
    }
    
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
    
    
    
}
