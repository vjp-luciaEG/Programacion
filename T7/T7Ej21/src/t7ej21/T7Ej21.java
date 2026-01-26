/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej21;
import com.sun.security.auth.NTDomainPrincipal;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarTablero(char [][] matriz){
        System.out.println("    0      1      2");
        System.out.println("-------------------------");
        System.out.println("0|   "+matriz[0][0] +"   |   "+ matriz[0][1] +"   |   "+ matriz[0][2]+"   |");
        System.out.println("-------------------------");
        System.out.println("1|   "+matriz[1][0] +"   |   "+ matriz[1][1] +"   |   "+ matriz[1][2]+"   |");
        System.out.println("-------------------------");
        System.out.println("2|   "+matriz[2][0] +"   |   "+ matriz[2][1] +"   |   "+ matriz[2][2]+"   |");
        System.out.println("-------------------------");
    }
    
    public static void mostrarMenu(){
        System.out.println("==== MENU ====");
        System.out.println("1-Jugar.");
        System.out.println("2-Salir.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Jugador jugador1 = new Jugador("Jugador1",'X');
        Jugador jugador2 = new Jugador("Jugador2", 'O');
        
        
        byte opcion;
        do{
            mostrarMenu();
            System.out.println("Introduzca una opcion:");
            opcion = entrada.nextByte();
            switch(opcion){
                case 1:{
                    char[][] TresEnRaya = new char[3][3];
                    byte contador=0;
                    boolean victoria1 = false, victoria2 = false;
                    mostrarTablero(TresEnRaya);
                    while(!victoria1 && !victoria2 && contador <=8) {
                        jugador1.eleccionJugador(TresEnRaya);
                        mostrarTablero(TresEnRaya);
                        victoria1 = jugador1.comprobarVictoria(TresEnRaya);
                        if(!victoria1){
                            jugador2.eleccionJugador(TresEnRaya);
                            mostrarTablero(TresEnRaya);
                            victoria2 = jugador2.comprobarVictoria(TresEnRaya);
                            contador++;
                        }
                        contador++;
                    }
                    if(!victoria1 && !victoria2){
                        System.out.println("EMPATE");
                    } else if(victoria1){
                        System.out.println("HA GANADO EL JUGADOR 1");
                    } else if(victoria2){
                        System.out.println("HA GANADO EL JUGADOR 2");
                    }
                    break;
                }
                case 2:
                    System.err.println("Exit");
                    break;
                default:
                    System.err.println("Opcion no disponible.");
            }
        }while(opcion!=2);
    }    
    
}
