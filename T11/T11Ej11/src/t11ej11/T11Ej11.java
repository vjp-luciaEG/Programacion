/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11ej11;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author alumno
 */
public class T11Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void introducirAlumno(Set<Alumno> alumnos) {
        System.out.println("Introduciendo alumno...");
        alumnos.add(new Alumno(Alumno.introducirDni(), Alumno.introducirNumExp(), Alumno.introducirNotaMedia()));
    }

    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarAlumnosXNumExp(Set<Alumno> alumnos) {
        System.out.println("BUSQUEDA POR NUMERO DE EXPEDIENTE");
        int num = Alumno.introducirNumExp();
        boolean encontrado = false;

        for (Alumno a : alumnos) {
            if (a.getNumExp() == num) {
                System.out.println(a);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.err.println("No existe");
        }
    }

    public static void mostrarAlumnosXNota(Set<Alumno> alumnos) {
        Set<Alumno> ordenNotaMedia = new LinkedHashSet<>();
        
        System.out.println("ALUMNOS POR NOTA");
        
        float notaAux = 0;
        Alumno maxNota = new Alumno();
        
        for (Alumno a : alumnos) {
            for (Alumno b : alumnos) {
                if (a.getNotaMedia() > b.getNotaMedia()) {
                    maxNota = a;
                } 
                
                if(maxNota.getNotaMedia()< b.getNotaMedia()){
                    maxNota = b;
                }
            }
            ordenNotaMedia.add(maxNota);
        }
        
        System.out.println(ordenNotaMedia);
    }

    public static void mostrarAlumnos(Set<Alumno> alumnos) {
        System.out.println("ALUMNOS");
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Introducir alumno");
        System.out.println("2-Mostrar alumnos");
        System.out.println("3-Buscar por numero de expediente");
        System.out.println("4-Mostrar por nota media");
        System.out.println("5-Salir");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Set<Alumno> alumnos = new TreeSet<>();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1: {
                    introducirAlumno(alumnos);
                    break;
                }
                case 2: {
                    mostrarAlumnos(alumnos);
                    break;
                }
                case 3: {
                    mostrarAlumnosXNumExp(alumnos);
                    break;
                }
                case 4: {
                    mostrarAlumnosXNota(alumnos);
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
