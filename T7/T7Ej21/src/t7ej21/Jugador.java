/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7ej21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class Jugador {
    
   private String nombre;
   private char marca;
   private boolean activo;

   public Jugador() {
        nombre="";
        activo = true;
        marca = 0;
   }

   public Jugador(String nombre, boolean activo, char marca) {
        this.nombre = nombre;
        this.activo = activo;
        this.marca = marca;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
   
    public char [][] eleccionJugador(char[][] TresEnRaya, Jugador jugador){
        Scanner entrada = new Scanner(System.in);
        int i, j;
        do{
            System.out.println("Elige una fila: ");
            i = entrada.nextInt();
            if(i<0 || i>2){
                System.err.println("La posicion no existe.");
            }
            System.out.println("Elige una columna: ");
            j = entrada.nextInt();
            if(j<0 || j>2){
                System.err.println("La posicion no existe.");
            }
            
        }while((i<0 || i>2) && (j<0 || j>2));
         
        TresEnRaya[i][j] = marca;      
        
        return TresEnRaya;
    }
    
   
   
}
