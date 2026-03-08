/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10Ej14 {

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
        System.out.println("1-Introducir un nuevo alumno.");
        System.out.println("2-Mostrar alumnos");
        System.out.println("3-Mejor alumno de la clase");
        System.out.println("4-Asignatura mas dificil");
        System.out.println("5-Salir.");
    }

    //Metodo para introducir Alumno en el ArrayList (nombre y notas de Asignaturas)
    public static void introducirAlumnoYNotas(ArrayList<Alumno> alumnos) {
        alumnos.add(Alumno.introducirAlumno());
    }

    //Mostrar datos del ArrayList
    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        if (alumnos.isEmpty()) {                    //Control de excepciones
            System.err.println("Lista vacia.");
            introducirAlumnoYNotas(alumnos);
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a);
                a.mostrarAsignaturas();
            }
        }
    }

    //Mostrar el Alumno con media mas alta
    public static void mejorAlumno(ArrayList<Alumno> alumnos) {
        if (alumnos.isEmpty()) {            //Control de excepciones
            System.err.println("Lista vacia.");
            introducirAlumnoYNotas(alumnos);
        } else {
            Alumno mejor = alumnos.get(0);          //Declaramos variables asignando el valor de la primera posicion del ArrayList
            float mejorMedia = alumnos.get(0).calcularNotaMedia();

            for (Alumno a : alumnos) {

                float media = a.calcularNotaMedia(); //Metodo de la clase Alumno para calcular la media

                if (media > mejorMedia) {
                    mejorMedia = media;     //Comparacion de media de cada alumno
                    mejor = a;
                }
            }

            System.out.println("Mejor alumno:" + mejor.getNombre());
            System.out.println("Media: " + mejorMedia);

        }

    }
    
    //Muestra la asignatura con mas suspensos
    public static void asignaturaMasDificil(ArrayList<Alumno> alumnos) {

        int lengua = 0;
        int mates = 0;
        int fisica = 0;

        for (Alumno a : alumnos) {

            Asignatura[] asignaturas = a.getAsignaturas(); //Obtenemos el array Asignaturas[] de cada alumno

            if (asignaturas[0].getNota() < 5) {   //Obtenemos la nota de cada asignatura
                lengua++;                       // Si es un suspenso suma el contador
            }

            if (asignaturas[1].getNota() < 5) {
                mates++;
            }

            if (asignaturas[2].getNota() < 5) {
                fisica++;
            }
        }

        //Posibilidades
        if (lengua > mates && lengua > fisica) {
            System.out.println("La asignatura mas dificil es Lengua con " + lengua + " suspensos");
        } else if (mates > lengua && mates > fisica) {
            System.out.println("La asignatura mas dificil es Mates con " + mates + " suspensos");
        } else if(fisica > mates && fisica > lengua) {
            System.out.println("La asignatura mas dificil es Fisica con " + fisica + " suspensos");
        } else if (lengua == mates && lengua > fisica) {
            System.out.println("Las asignaturas mas dificiles son Lengua y Mates con " + lengua + " suspensos");
        } else if (lengua == fisica && lengua > mates) {
            System.out.println("Las asignaturas mas dificiles son Lengua y Fisica con " + fisica + " suspensos");
        } else if(fisica == mates && fisica > lengua) {
            System.out.println("Las asignaturas mas dificiles son Fisica y Mates con " + fisica + " suspensos");
        } else {
            System.out.println("Todas tienen el mismo numero de suspensos: " + fisica);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumnos = new ArrayList<>();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = introducirOpcion();
            switch (opcion) {
                case 1: {
                    introducirAlumnoYNotas(alumnos);
                    break;
                }
                case 2: {
                    mostrarAlumnos(alumnos);
                    break;
                }
                case 3: {
                    mejorAlumno(alumnos);
                    break;
                }
                case 4: {
                    asignaturaMasDificil(alumnos);
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
