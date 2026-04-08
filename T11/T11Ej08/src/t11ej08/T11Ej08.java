/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej08;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author lucia
 */
public class T11Ej08 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo que muestra las Sedes ordenadas por mayor numero de ingresos
    public static void mostrarSedesMayorAMenor(ArrayList<Ciudad> ciudades){
        Set<Sede> sedesOrdenadas = new TreeSet<>(); //Conjunto ordenado por mayor valor de ingresos de Sede
        
        for(Ciudad c : ciudades){               //Introducimos todas las sedes en el TreeSet
            for(Sede s: c.getSedes()){
                sedesOrdenadas.add(s);       
            }
        }
        
        System.out.println(sedesOrdenadas);
    }
    
    //Metodo que busca la ciudad con el nombre similar al introducido por parametro para introducir mas sedes a su conjunto
    public static void buscarCiudad(ArrayList<Ciudad> ciudades, String nombre){
        int i = 0;
        boolean encontrado = false;
        
        while(i<ciudades.size() && !encontrado){        //Busqueda
           if(ciudades.get(i).getNombre().equalsIgnoreCase(nombre)){ 
               encontrado = true;
               ciudades.get(i).introducirSede();  //Metodo de la clase Ciudad para añadir sedes al conjunto
           }
           i++;
        }
        
        if(!encontrado){
            System.err.println("La ciudad no existe");
        }
    }
    
    //Metodo que busca y muestra todas las sedes con el nombre similar al introducido por el usuario
    public static void buscarNombreSede(ArrayList<Ciudad> ciudades){
        boolean encontrado = false;
        String nombreSede = Sede.introducirNombre();
        int i = 0;
        
        for(Ciudad c: ciudades){  
            encontrado = c.buscarSedes(nombreSede); //Metodo de la clase Ciudad que compara los nombres de las sedes de la Ciudad y devuelve true o false
            if(encontrado){
                System.out.println(c.getNombre());
                i++;
            }
        }
        
        if(!encontrado && i == 0){
            System.err.println("No se han encontrado sedes");
        } else {
            System.out.println("Se han encontrado " + i + " sedes");
        }
    }
    
    //Metodo que calcula la media de ingresos de todos los conjuntos de sedes de las ciudades
    public static double calcularMediaIngresos(ArrayList<Ciudad> ciudades){
        double suma = 0;
        int numSedes = 0;
        for(Ciudad c: ciudades){
            for(Sede s : c.getSedes()){
                suma += s.getIngresoAnual();
                numSedes++;
            }
        }
        
        double media = suma/numSedes;
        return media;
    }
    
    //Metodo que muestra las sedes con ingresos superiores a la media
    public static void mostrarSedesMediaSuperior(ArrayList<Ciudad> ciudades, double media){
        for(Ciudad c: ciudades){
            for(Sede s : c.getSedes()){
                if(s.getIngresoAnual() > media){
                    System.out.println("Ciudad: " + c.getNombre() + " Sede: " + s);
                }
            }
        }
    }
    
    //Metodo para introducir opcion del menu
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //Mostrar menu
    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Insertar ciudad");
        System.out.println("2-Mostrar ciudades");
        System.out.println("3-Sedes con ingresos superiores a la media");
        System.out.println("4-Buscar por nombre de sede");
        System.out.println("5-Introducir sede");
        System.out.println("6-Mostrar sedes");
        System.out.println("7-Salir");
    }
    
    //Metodo para mostrar el ArrayList
    public static void mostrarCiudades(ArrayList<Ciudad> ciudades){
        for(Ciudad c : ciudades){
            System.out.println(c);
        }
    }
    
    //Metodo para insertar una Ciudad al ArrayList
    public static void insertarCiudad (ArrayList<Ciudad> ciudades){
        ciudades.add(new Ciudad(Sede.introducirNombre(), Ciudad.aniadirSede()));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Ciudad> ciudades = new ArrayList<>();  //Estructura dinamica
        
        int opcion;
        do {                        //Menu de opciones
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1: {
                    insertarCiudad(ciudades);
                    break;
                }
                case 2: {
                    mostrarCiudades(ciudades);
                    break;
                }
                case 3: {
                    mostrarSedesMediaSuperior(ciudades, calcularMediaIngresos(ciudades));
                    break;
                }
                case 4: {
                    buscarNombreSede(ciudades);
                    break;
                }
                case 5: {
                    buscarCiudad(ciudades, Sede.introducirNombre());
                    break;
                }
                case 6: {
                    mostrarSedesMayorAMenor(ciudades);
                    break;
                }
                case 7: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }

        } while (opcion != 7);
    }
    
}
