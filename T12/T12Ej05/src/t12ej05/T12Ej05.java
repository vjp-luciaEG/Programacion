/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12ej05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T12Ej05 {

    /**
     * @param args the command line arguments
     */
    public final static String FICHERO = "agenda.txt";

    //Metodo para escribir un Contacto en el fichero
    public static void escribirFichero(String fichero, Contacto contacto) throws FileNotFoundException, IOException {
        System.out.println("\n- ESCRIBIENDO FICHERO -");

        try (   //Abrimos y cerramos flujos con try with resources                                                        
                FileWriter fw = new FileWriter(fichero, true); 
                PrintWriter pw = new PrintWriter(fw);) 
        {
            pw.println("CONTACTO");
            pw.println("Nombre: " + contacto.getNombre());
            pw.println("Edad: " + contacto.getEdad());
            pw.println("Telefono: " + contacto.getTel());
            pw.println("-----");
        }
    }

    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        System.out.println("\n- LEYENDO FICHERO -");

        try (   //Abrimos y cerramos flujos con try with resources
                FileReader fr = new FileReader(fichero); 
                BufferedReader br = new BufferedReader(fr);) 
        {
            
            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);

                linea = br.readLine();
            }
        }
    }

    //Metodo para introducir opcion del menu
    public static int introducirOpcion() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //Mostrar menu
    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Insertar contacto en la agenda");
        System.out.println("2-Mostrar agenda");
        System.out.println("3-Salir");
    }

    //Metodo para crear un nuevo Contacto
    public static Contacto crearContacto() throws NullPointerException {
        Contacto contacto = new Contacto(Contacto.pedirNombre(), Contacto.pedirEdad(), Contacto.pedirNumero());
        return contacto;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        try {                                                       //Control de Excepciones
            Scanner entrada = new Scanner(System.in);

            int opcion;
            do {                                                    //Menu de opciones
                mostrarMenu();
                opcion = introducirOpcion();

                switch (opcion) {
                    case 1: {
                        escribirFichero(FICHERO, crearContacto());
                        break;
                    }
                    case 2: {
                        leerFichero(FICHERO);
                        break;
                    }
                    case 3: {
                        System.err.println("Programa finalizado.");
                        break;
                    }
                    default:
                        System.out.println("Opcion no disponible");
                }

            } while (opcion != 3);

        } catch (NullPointerException e) {
            System.out.println("ERROR: Valor nulo.");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }

    }

}
