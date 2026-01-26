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
    

    public static boolean comprobarVictoria(char [][] TresEnRaya){
        boolean victoria = false;
        
        for (int i = 0; i < 3; i++) {
            if (TresEnRaya[i][0] != ' ' && TresEnRaya[i][0] == TresEnRaya[i][1] && TresEnRaya[i][1] == TresEnRaya[i][2]) {
                victoria = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (TresEnRaya[0][i] != ' ' &&
                TresEnRaya[0][i] == TresEnRaya[1][i] &&
                TresEnRaya[1][i] == TresEnRaya[2][i]) {
                victoria = true;
            }
        }

        if (TresEnRaya[0][0] != ' ' &&
            TresEnRaya[0][0] == TresEnRaya[1][1] &&
            TresEnRaya[1][1] == TresEnRaya[2][2]) {
            victoria = true;
        }

        if (TresEnRaya[0][2] != ' ' &&
            TresEnRaya[0][2] == TresEnRaya[1][1] &&
            TresEnRaya[1][1] == TresEnRaya[2][0]) {
            victoria = true;
        }
        
        return victoria;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] TresEnRaya = new char[3][3];
        
        Jugador jugador1 = new Jugador("Jugador1",'X');
        Jugador jugador2 = new Jugador("Jugador2", 'O');
        
        boolean victoria = false;
        
        mostrarTablero(TresEnRaya);
        do {

            jugador1.eleccionJugador(TresEnRaya);
            mostrarTablero(TresEnRaya);
            victoria = jugador1.comprobarVictoria(TresEnRaya);
            jugador2.eleccionJugador(TresEnRaya);
            mostrarTablero(TresEnRaya);
            victoria = jugador2.comprobarVictoria(TresEnRaya);
        } while(!victoria);
      
        System.out.println("VICTORIA");
     
    }
    
}
