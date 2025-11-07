/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_colacarniceria;
import java.util.Scanner;
/**
 *
 * @author Lucía Elizo Gomez
 */
public class Proyecto_ColaCarniceria {

    /**
     * @param args the command line arguments
     */
    
    public final static char MOSTRADOR_01 = 'A';
    public final static char MOSTRADOR_02 = 'B';
    public final static char MOSTRADOR_03 = 'C';
    
    private static int numCompra = 1;
    private static int numPedido = 1;
    
    public static int pedirOpcion(){   //Metodo para pedir opcion del menu al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione una opcion: ");
        int opcionCliente = entrada.nextInt();
        return opcionCliente; 
    }
    
    public static void mostrarMenu(){
        System.out.println("Bienvenido al menu de la carniceria: ");
        System.out.println("1-Comprar\n2-Recoger Pedido\n3-Salir");
    }
    
    public static char generarLetraAleatoria(){     //Metodo para generar letra aleatoria(Mostrador)
        int letraAleatoria = (char) (Math.floor(Math.random()*(MOSTRADOR_03-MOSTRADOR_01+1)+MOSTRADOR_01)); //Generamos el valor de la letra aleatoria(Codigo Ascii)
        return (char) letraAleatoria; //Devolvemos el valor en una variable tipo char
    }
    
    public static void incrementarNumeroCompra(){
        numCompra++;
    }
    
    public static void incrementarNumeroPedido(){
        numPedido++;
    }
    
    public static void generarNumeroEsperaCompra(){
        System.out.println("Numero de compra: C-" + numCompra);
        incrementarNumeroCompra();
    }
    
    public static void generarNumeroEsperaPedido(){
        System.out.println("Numero de pedido: P-" + numPedido);
        incrementarNumeroPedido();
    }
    
    public static void main(String[] args) {
        //PROYECTO COLA DE CARNICERIA
        
        int opcionCliente;
        char letraMostrador;
        
        do{
            mostrarMenu();      //Mostrar menu
            try{
                opcionCliente = pedirOpcion();   //Pedir opcion al cliente
            
                switch(opcionCliente){               //Menu de opciones disponibles
                    case 1:{
                        generarNumeroEsperaCompra();
                        letraMostrador = generarLetraAleatoria();
                        System.out.println("Mostrador " + letraMostrador);
                        break;
                    }    
                    case 2:{
                        generarNumeroEsperaPedido();
                        letraMostrador = generarLetraAleatoria();
                        System.out.println("Mostrador " + letraMostrador);
                        break;
                    }    
                    case 3:{
                        System.out.println("Gracias por su compra");
                        break;
                    }    
                    default:
                        System.err.println("Opcion no disponible");
                }
            }
            catch(Exception e){
               System.err.println("Error");
               opcionCliente = 0;
            }
        } while(opcionCliente!=3);
    }
    
}
