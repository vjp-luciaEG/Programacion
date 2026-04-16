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
    
    public static void escribirFichero(String fichero, Contacto contacto) throws FileNotFoundException, IOException {
        System.out.println("\n- ESCRIBIENDO FICHERO -");
        
        try(
            FileWriter fw = new FileWriter(fichero);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            // Se puede encapsular esto en un método "escribir"
            pw.println(contacto.getNombre() + "\n" + contacto.getEdad() + "\n" + contacto.getTel());
        }
    }
    
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        System.out.println("\n- LEYENDO FICHERO -");
        
        try(
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
        ) {
            // Se puede encapsular esto en un método "leer"
            String linea = br.readLine();
            
            while(linea != null) {
                System.out.println(linea);
                
                linea = br.readLine();
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
        System.out.println("1-Insertar contacto en la agenda");
        System.out.println("2-Mostrar agenda");
        System.out.println("3-Salir");
    }
    
    public static Contacto crearContacto(){
        Contacto contacto = new Contacto(Contacto.pedirNombre(),Contacto.pedirEdad(), Contacto.pedirNumero());
        return contacto;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Scanner entrada = new Scanner(System.in);
            
            int opcion;
            do {
                mostrarMenu();
                opcion = introducirOpcion();
                
                switch (opcion) {
                    case 1: {
                        escribirFichero(FICHERO, crearContacto());
                        break;
                    } case 2:{
                        leerFichero(FICHERO);
                        break;
                    }
                    case 3: {
                        System.err.println("Programa finalizado.");
                        break;
                    }
                    default:
                        throw new AssertionError();
                }
               
            } while (opcion!=3);
            
        } catch(InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch(FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch(Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }

    }
    
}
