/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10ej15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Empresa {
    
    //Atributos
    private String nombreEmpresa;
    private ArrayList<Empleado> listaEmpleados;

    //Constructores
    public Empresa() {
        nombreEmpresa = "";
        listaEmpleados = new ArrayList<>();
        for(Empleado e: listaEmpleados){
            e = new Empleado();
        }
    }

    public Empresa(String nombreEmpresa, ArrayList<Empleado> listaEmpleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpleados = listaEmpleados;
    }

    //Getters/Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    //Introducir datos por el usuario
    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de la empresa: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static ArrayList<Empleado> introducirEmpleados() {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        String respuesta = "No";
        int contador = 0;
        
        do{
            contador++;
            System.out.println("Empleado " + contador);
            
            Empleado e = new Empleado(Empleado.introducirNombre(), Empleado.introducirSueldo());        //Crear y añadir empleado
            empleados.add(e);
            
            System.out.println("Desea añadir mas empleados (Si | No)");         //Control del bucle para añadir mas empleados
            respuesta = entrada.nextLine();                                        
        } while(respuesta.equalsIgnoreCase("Si"));                      //Detenemos el bucle con cualquier respuesta distinta de "Si"
        
        return empleados;
    }
    
    //Mostrar datos
    public void mostrarListaEmpleadosPorA() {
        for (Empleado e : listaEmpleados) {
            if(e.getNombreEmpleado().toLowerCase().contains("a")){
                System.out.println(e.getNombreEmpleado());
            } 
        }
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", listaEmpleados=" + listaEmpleados + '}';
    }
    
    
}
