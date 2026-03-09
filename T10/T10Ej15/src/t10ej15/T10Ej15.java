/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class T10Ej15 {

    /**
     * @param args the command line arguments
     */
    //Metodo para introducir opcion del menu
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //Menu
    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Introducir empresas  y sus empleados.");
        System.out.println("2-Mostrar empresas y sus empelados");
        System.out.println("3-Mostrar empleados que contengan la letra A");
        System.out.println("4-Mostrar empleados por sueldo.");
        System.out.println("5-Salir.");
    }

    //Mostrar datos del ArrayList
    public static void mostrarEmpresas(ArrayList<Empresa> empresas) {
        if (empresas.isEmpty()) {                    //Control de excepciones
            System.err.println("Lista vacia.");
            introducirEmpresas(empresas);
        } else {
            for (Empresa em : empresas) {
                System.out.println(em);
            }
        }
    }
    
    public static void mostrarEmpleadosPorA(ArrayList<Empresa> empresas) {
        if (empresas.isEmpty()) {                    //Control de excepciones
            System.err.println("Lista vacia.");
            introducirEmpresas(empresas);
        } else {
            for (Empresa em : empresas) {
                em.mostrarListaEmpleadosPorA();
            }
        }
    }

    public static void introducirEmpresas(ArrayList<Empresa> empresas) {
        Scanner entrada = new Scanner(System.in);

        Empresa em;
        String respuesta = "No";

        do {
            em = new Empresa(Empresa.introducirNombre(), Empresa.introducirEmpleados());
            empresas.add(em);
            System.out.println("Desea introducir mas empresas (Si | No)");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empresa> empresas = new ArrayList<>();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1: {
                    introducirEmpresas(empresas);
                    break;
                }
                case 2: {
                    mostrarEmpresas(empresas);
                    break;
                }
                case 3: {
                    mostrarEmpleadosPorA(empresas);
                    break;
                }
                case 4: {

                    break;
                }
                case 5: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }

        } while (opcion != 5);
    }

}
