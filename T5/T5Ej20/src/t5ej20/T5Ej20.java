/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej20;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T5Ej20 {

    /**
     * @param args the command line arguments
     */
    public static byte pedirOpcion(){
        Scanner entradaMenu = new Scanner(System.in);
        System.out.println("Introduzca la opcion que desea: ");
        byte opcion = entradaMenu.nextByte();
        return opcion;
    }
    public static float pedirCantidad(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad: ");
        float cantidadRecibida = entrada.nextFloat();
        return cantidadRecibida;
    }
    public static void mostrarMenu(){
        System.out.println("Bienvenido");
        System.out.println("1 - Crear cuenta vacia.\n2 - Crear cuenta con saldo inicial.\n3 - Ingresar dinero.\n4 - Sacar dinero.\n5 - Ver saldo.\n6 - Salir.");
    }
    
    
    public static void opcionesMenu(){
        CuentaClave cuenta01 = null;
        byte opcionUsuario = 0; 
            do{
            try{
               mostrarMenu();
               opcionUsuario = pedirOpcion();
               switch(opcionUsuario){
                case 1:{
                    cuenta01 = new CuentaClave(CuentaClave.pedirClave());
                    break;
                }
                case 2:{
                    cuenta01 = new CuentaClave(CuentaClave.pedirClave(), pedirCantidad());
                    break;
                }

                case 3:{
                    cuenta01.ingresarSaldo(pedirCantidad());
                    break;
                }
                case 4:{
                    cuenta01.extraerSaldo(pedirCantidad());
                    break;
                }
                case 5:{
                    System.out.println(cuenta01);
                    break;
                }    
            
                case 6:{
                    System.err.println("Exit");
                    break;
                }
                default:{
                    System.err.println("Opcion no disponible");
                }
               }
            }catch(NullPointerException e){
                System.err.println("Error. Cuenta no creada. Seleccione una opcion de crear cuenta.");
            }                
            } while(opcionUsuario != 6);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //CAJERO AUTOMATICO
        
        opcionesMenu();
    }
    
}
