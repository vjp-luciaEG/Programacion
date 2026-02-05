/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej12;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class T8Ej12 {

    /**
     * @param args the command line arguments
     */
    
    //Mostrar opciones del menu
    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Buscar muebles por precio");
        System.out.println("4. Salir");
    }
    
    //Metodo para crear y rellenar Muebles
    public static void rellenarMuebles(Mueble[] muebles) {
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("Mueble " + (i + 1));

            Mueble m = new Mueble(); // Creamos el objeto

            // Pedimos datos con los métodos de la clase Mueble
            String descripcion = m.introducirDescripcion();
            double precio = m.introducirPrecio();

            // Guardamos el mueble en el array
            muebles[i] = new Mueble(precio, descripcion);
        }

    }
    
    //Metodos para mostrar datos
    public static void mostrarMuebles(Mueble[] muebles) {
        System.out.println("MUEBLES");
        for (Mueble m : muebles) {
            System.out.println(m);
        }
    }

    public static void mostrarPorPrecio(Mueble[] muebles) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio: ");
        double precio = entrada.nextDouble();
        
        //Busqueda de muebles
        boolean encontrado = false;

        System.out.println("Muebles con precio menor o igual a " + precio + " euros:"); 
        for (Mueble m : muebles) {
            if (m.getPrecio() <= precio) {
                System.out.println(m);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay muebles con precio igual o menor a " + precio + " euros.");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        Mueble mueble1 = new Mueble(); // Creamos objeto Mueble con constructor por defecto
        Mueble mueble2 = new Mueble(250, "Sofa"); // Creamos objeto Mueble con parametrizado
        
        //Mostramos datos sin modificaciones
        System.out.println("INFORMACION OBJETOS");
        System.out.println(mueble1);
        System.out.println(mueble2);
        
        //Modificamos valores de atributos con metodos Setters
        mueble1.setDescripcion("Silla");
        mueble1.setPrecio(50);

        mueble2.setDescripcion("Mesa");
        mueble2.setPrecio(200);
        
        //Mostramos informacion modificada
        System.out.println("INFORMACION OBJETOS 2");
        System.out.println(mueble1);
        System.out.println(mueble2);

        //Creamos array de objetos Mueble
        Mueble[] muebles = new Mueble[4];

        int opcion;
        //Menu de opciones
        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    rellenarMuebles(muebles);
                    break;
                }
                case 2: {
                    mostrarMuebles(muebles);
                    break;
                }
                case 3: {
                    mostrarPorPrecio(muebles);
                    break;
                }
                case 4: {
                    System.err.println("Fin del programa");
                    break;
                }
                default: {
                    System.err.println("Opcion no disponible");
                }
            }

        } while (opcion != 4);
    }

}
