/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej14;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class T8Ej14 {

    /**
     * @param args the command line arguments
     */
    
    //Metodo para crear y rellenar Alumno por posicion
    public static void rellenarAlumno(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        int posicion;
        do {
            System.out.print("Introduce la posicion (0-" + (alumnos.length - 1) + "): ");
            posicion = entrada.nextInt();
            if (posicion < 0 || posicion >= alumnos.length) {
                System.out.println("Posicion no disponible.");
            } else if (alumnos[posicion] != null) {
                System.out.println("Posicion ocupada. Intenta otra.");
                posicion = -1;
            }
        } while (posicion < 0 || posicion >= alumnos.length);

        alumnos[posicion] = Alumno.crearAlumno(); //Llamamos al metodo de la clase para crear Alumno
        System.out.println("Alumno creado en la posicion " + posicion);
    }
    
    //Mostrar datos de array de Alumnos
    public static void mostrarAlumnos(Alumno[] alumnos) {
        System.out.println("ALUMNOS");
        for (Alumno a : alumnos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    //Mostrar alumnos con nota media igual o mayor a un valor introducido
    public static void mostrarPorNota(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca nota: ");
        double nota = entrada.nextDouble();

        System.out.println("Alumnos con nota media mayor o igual a " + nota + ":");
        for (Alumno a : alumnos) {
            if (a.getNotaMedia() >= nota) {
                System.out.println(a);
            }
        }
    }

    //Metodo para contar alumnos con media suspensa
    public static void contarSuspensos(Alumno[] alumnos) {
        int contador = 0;
        for (Alumno a : alumnos) {
            if (a.getNotaMedia() < 5) {
                contador++;
            }
        }
        System.out.println("Numero de alumnos suspensos: " + contador);
    }

    //Metodo para buscar alumno por nombre
    public static void buscarAlumno(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca nombre: ");
        String nombre = entrada.nextLine();
        
        //Busqueda de alumno
        boolean encontrado = false;
        
        while(!encontrado){
            for (Alumno a : alumnos) {
                if (a.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Alumno encontrado: " + a);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no matriculado.");
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("--- MENU ---");
        System.out.println("1. Rellenar un alumno.");
        System.out.println("2. Mostrar datos de alumnos.");
        System.out.println("3. Buscar alumnos por nota media.");
        System.out.println("4. Mostrar numero de alumnos suspensos.");
        System.out.println("5. Buscar alumno por nombre.");
        System.out.println("6. Salir.");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        // Crear alumnos
        Alumno a1 = new Alumno(); // constructor por defecto
        Alumno a2 = new Alumno("Lucia", 20, 8.5); // constructor parametrizado

        // Modificar el alumno creado por defecto
        a1.setNombre("Angel");
        a1.setEdad(19);
        a1.setNotaMedia(7.8);

        // Mostrar datos de los alumnos
        System.out.println("Informacion de los alumnos:");
        System.out.println(a1);
        System.out.println(a2);
        
        Alumno[] alumnos = new Alumno[5];
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Introduzca una opcion:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:{
                    rellenarAlumno(alumnos);
                    break;
                }
                case 2:{
                    mostrarAlumnos(alumnos);
                    break;
                }
                case 3:{
                    mostrarPorNota(alumnos);
                    break;
                }
                case 4:{
                    contarSuspensos(alumnos);
                    break;
                }
                case 5:{
                    buscarAlumno(alumnos);
                    break;
                }
                case 6:{
                    System.err.println("Exit");
                    break;
                }
                default:{
                    System.err.println("Opcion no disponible.");
                }
            }

        } while (opcion != 6);

    }

}
