/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10ej15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Empresa {
    
    private String nombreEmpresa;
    private ArrayList<Empleado> listaEmpleados;

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
            Empleado e = new Empleado(Empleado.introducirNombre(), Empleado.introducirSueldo());
            empleados.add(e);
            System.out.println("Desea añadir mas empleados (Si | No)");
            respuesta = entrada.nextLine();
        } while(respuesta.equalsIgnoreCase("Si"));
        
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
