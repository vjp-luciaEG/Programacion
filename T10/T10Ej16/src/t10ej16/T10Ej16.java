/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T10Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void comprarProductos(ArrayList<Producto> listaAdmin) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> listaCliente = new ArrayList<>();

        String respuesta = "No";
        float precioCompra = 0F;
        int j = 0;
        
        do {
            boolean encontrado = false;
            int i = 0;
            mostrarArrayList(listaAdmin);
            String nombre = Producto.introducirNombre();

            while (encontrado == false && i < listaAdmin.size()) {
                if (listaAdmin.get(i) != null) {
                    if (listaAdmin.get(i).getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println("Cuantas unidades desea?");
                        int stock = Producto.introducirStock();
                        
                        if (stock <= listaAdmin.get(i).getStock()) {
                            listaAdmin.get(i).setStock(listaAdmin.get(i).getStock() - stock);
                            precioCompra += listaAdmin.get(i).getPrecio() * stock;
                            listaCliente.add(listaAdmin.get(i));
                            listaCliente.get(j).setStock(stock);
                            System.out.println("PRODUCTO COMPRADO");
                            j++;
                        } else {
                            System.err.println("No hay esa cantidad en stock.\nSolo quedan " + listaAdmin.get(i).getStock());
                        }
                        
                        encontrado = true;
                    }
                }
                i++;
            }

            if (!encontrado) {
                System.err.println("No existe este producto.");
            }

            System.out.println("Desea comprar mas productos? (Si | No)");         //Control del bucle para añadir mas empleados
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));
        System.err.println("COMPRA FINALIZADA.");
        mostrarArrayList(listaCliente);
        System.out.println("\"EL IMPORTE ES DE " + precioCompra + " EUROS");
    }

    public static void eliminarProducto(String nombre, ArrayList<Producto> listaAdmin) {
        if (!listaAdmin.isEmpty()) {
            boolean eliminado = false;
            int i = 0;
            while (eliminado == false && i < listaAdmin.size()) {
                if (listaAdmin.get(i) != null) {
                    if (listaAdmin.get(i).getNombre().equalsIgnoreCase(nombre)) {
                        listaAdmin.remove(listaAdmin.get(i));
                        System.err.println("Eliminando producto...");
                        eliminado = true;
                    }
                }
                i++;
            }

            if (!eliminado) {
                System.err.println("No existe este producto.");
            }
        } else {
            System.err.println("No hay productos en la lista");
        }
    }

    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void introducirDatosProductoALista(ArrayList<Producto> listaAdmin) {
        Producto p = new Producto(Producto.introducirNombre(), Producto.introducirPrecio(), Producto.introducirStock());
        listaAdmin.add(p);
        System.err.println("Añadiendo producto...");
    }

    public static void mostrarArrayList(ArrayList<Producto> listaAdmin) {
        if (listaAdmin.isEmpty()) {
            System.err.println("La lista esta vacia.");
        } else {
            System.out.println("LISTA DE PRODUCTOS");
            for (Producto p : listaAdmin) {
                System.out.println(p);
            }
        }
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("=== MENU ===");
        System.out.println("1-MENU DE ADMINISTRACION");
        System.out.println("2-MENU DE COMPRA");
        System.out.println("3-SALIR");
    }

    public static void mostrarMenuAdmin() {
        System.out.println("=== MENU DE ADMINISTRACION ===");
        System.out.println("1-Introducir productos en la lista");
        System.out.println("2-Visualizar la lista de productos");
        System.out.println("3-Eliminar productos de la lista");
        System.out.println("4-Volver al menu principal");
    }

    public static void mostrarMenuCompra() {
        System.out.println("=== MENU DE COMPRA ===");
        System.out.println("1-Comprar productos");
        System.out.println("2-Volver al menu principal");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Producto> listaAdmin = new ArrayList<>();

        int opcion = 0;
        do {
            mostrarMenuPrincipal();
            opcion = introducirOpcion();

            switch (opcion) {
                case 1: {
                    do {
                        mostrarMenuAdmin();
                        opcion = introducirOpcion();

                        switch (opcion) {
                            case 1: {
                                introducirDatosProductoALista(listaAdmin);
                                break;
                            }
                            case 2: {
                                mostrarArrayList(listaAdmin);
                                break;
                            }
                            case 3: {
                                eliminarProducto(Producto.introducirNombre(), listaAdmin);
                                break;
                            }
                            case 4: {
                                System.err.println("Volviendo al menu principal...");
                                break;
                            }
                            default:
                                System.err.println("Opcion no disponible");
                        }

                    } while (opcion != 4);
                    break;
                }
                case 2: {
                    do {
                        mostrarMenuCompra();
                        opcion = introducirOpcion();

                        switch (opcion) {
                            case 1: {
                                comprarProductos(listaAdmin);
                                break;
                            }
                            case 2: {
                                System.err.println("Volviendo al menu principal...");
                                break;
                            }
                            default:
                                System.err.println("Opcion no disponible");
                        }

                    } while (opcion != 2);
                    break;
                }
                case 3: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }
        } while (opcion != 3);

    }

}
