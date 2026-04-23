/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12ej06;

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
public class T12Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void escribirFichero(String fichero, int[] pares) throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException, NullPointerException {

        System.out.println("\n- ESCRIBIENDO FICHERO -");
        
        try(
            FileWriter fw = new FileWriter(fichero);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            for (int i=0;i<pares.length;i++){
                pw.println(pares[i]);
                        
            }
        }
    }

    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        System.out.println("\n- LEYENDO FICHERO -");

        try (
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

    public static int[] crearArray() throws ArrayIndexOutOfBoundsException, NullPointerException {
        int[] pares = new int[100];

        for (int i=0;i<pares.length;i++) {
                pares[i] = i*2;
        }
        return pares;
    }

    public static String pedirNombreFichero() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de fichero: ");
        String nombre = entrada.nextLine();
        return nombre;
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
        System.out.println("1-Introducir nombre de fichero");
        System.out.println("2-Mostrar fichero");
        System.out.println("3-Salir");
    }

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner entrada = new Scanner(System.in);
            String fichero = new String();

            int opcion;
            do {
                mostrarMenu();
                opcion = introducirOpcion();

                switch (opcion) {
                    case 1: {
                        fichero = pedirNombreFichero();
                        escribirFichero(fichero, crearArray());
                        break;
                    }
                    case 2: {
                        leerFichero(fichero);
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Indice no valido.");
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
