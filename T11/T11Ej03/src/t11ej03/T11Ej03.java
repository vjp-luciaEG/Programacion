/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej03;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T11Ej03 {

    /**
     * @param args the command line arguments
     */
    //Metodos para introducir valores
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el numero de la plaza de aparcamiento: ");
        int plaza = entrada.nextInt();

        return plaza;
    }

    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //Mostrar menu
    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Aparcar autobus");
        System.out.println("2-Mostrar plazas libres");
        System.out.println("3-Buscar autobus por matricula");
        System.out.println("4-Buscar conductor");
        System.out.println("5-Autobus con mayor numero de conductores");
        System.out.println("6-Salir");
    }

    //Metodo que muestra las posiciones libres del vector
    public static void mostrarPlazasLibres(Autobus[] autobuses) {
        System.out.print("Plazas libres: ");
        for (int i = 0; i < autobuses.length; i++) {
            if (autobuses[i] == null) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    //Metodo que introduce un Autobus al vector (y sus datos)
    public static void aparcarAutobus(Autobus[] autobuses) {
        Scanner entrada = new Scanner(System.in);

        int plaza = -1;
        String respuesta;
        boolean libre;

        do {
            libre = true;
            plaza = pedirNumero();  //Obtenemos la posicion del vector donde añadir el Autobus

            if (plaza < 0 || plaza >= 6) {  //Control de excepcion IndexOutOfBounds
                plaza = 0;
                libre = false;
                System.err.println("Ls posicion no existe");
            }
            if (libre && autobuses[plaza] != null) { //Controla si la posicion esta ocupada
                System.err.println("Plaza ocupada. Seleccione otra.");
                libre = false;
            }

        } while (!libre);

        autobuses[plaza] = new Autobus(Autobus.introducirMatricula()); //Añadimos el autobus a la posicion obtenida

        do {                                            
            autobuses[plaza].introducirConductor();     //Introducimos el numero de conductores que desee el usuario 
            System.out.println("Desea introducir mas conductores?");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));

    }

    //Metodo que busca un Autobus con matricula similar a la introducida por parametro
    public static void buscarAutobus(Autobus[] autobuses, String matricula) {
        boolean encontrado = false;
        int i = 0;

        System.out.println("Busqueda...");
        while (!encontrado && i < autobuses.length) {
            if (autobuses[i] != null) {   //Control de excepcion NullPointer
                if (autobuses[i].getMatricula().equalsIgnoreCase(matricula)) {
                    System.out.println(autobuses[i]);
                    encontrado = true;
                }
            }
            i++;
        }

        if (!encontrado) {
            System.err.println("No hay ningun autobus aparcado con esa matricula");
        }
    }

    //Metodo que busca en el vector Autobus el Conductor con dni similar al introducido por el usuario
    public static void buscarConductores(Autobus[] autobuses) {
        boolean encontrado = false;
        int i = 0;
        String claveUsuario = Conductor.introducirDni();

        System.out.println("Busqueda...");
        while (!encontrado && i < autobuses.length) {
            if (autobuses[i] != null) {  //Control de excepcion NullPointer
                encontrado = autobuses[i].buscarConductor(claveUsuario); //Metodo que busca si hay algun conductor con la misma clave en el Autobus
            }
            if (encontrado) {
                System.out.println("Conductor asignado a autobus con matricula " + autobuses[i].getMatricula());
            }
            i++;
        }

        if (!encontrado) {
            System.err.println("No existe.");
        }
    }

    //Metodo que compara la suma de Conductores de los Autobuses del vector y muestra el mayor
    public static void buscarAutobusMasConductores(Autobus[] autobuses) {
        int i = 0;
        int suma = 0;
        int posicion = 0;

        System.out.println("Busqueda...");
        for (Autobus a : autobuses) {
            if (a != null) {    //Control de excepcion NullPointer
                int aux = a.sumarConductor(); //Metodo que suma los conductores de un Autobus
                if (suma < aux) {
                    suma = aux;
                    posicion = i;
                }
            }
            i++;
        }

        System.out.println("El autobus con mayor numero de conductores es el aparcado en la plaza " + posicion + " con " + suma + " conductores");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Autobus[] autobuses = new Autobus[6];   //Vector de Autobuses

        int opcion;
        do {                        //Menu de opciones
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1: {
                    aparcarAutobus(autobuses);
                    break;
                }
                case 2: {
                    mostrarPlazasLibres(autobuses);
                    break;
                }
                case 3: {
                    buscarAutobus(autobuses, Autobus.introducirMatricula());
                    break;
                }
                case 4: {
                    buscarConductores(autobuses);
                    break;
                }
                case 5: {
                    buscarAutobusMasConductores(autobuses);
                    break;
                }
                case 6: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }

        } while (opcion != 6);
    }

}
