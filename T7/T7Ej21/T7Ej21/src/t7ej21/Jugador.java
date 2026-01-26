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

   public Jugador() {
        nombre="";
        marca = 0;
   }

   public Jugador(String nombre, char marca) {
        this.nombre = nombre;
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
    
   
    public char [][] eleccionJugador(char[][] TresEnRaya){
        Scanner entrada = new Scanner(System.in);
        int i=0, j=0;
        do{
            try{
                System.out.println("Elige una fila: ");
                i = entrada.nextInt();
                    
                System.out.println("Elige una columna: ");
                j = entrada.nextInt();

                for(int k = 0;k<3;k++){
                    for(int l=0; l<3; l++){
                        if(TresEnRaya[k][l] == 'X' || TresEnRaya[k][l] == 'O'){
                            System.out.println("Posicion ocupada");
                            entrada.nextLine();
                        }
                    }
                }
            }catch(IndexOutOfBoundsException e){
                entrada.nextLine();
                System.out.println("La posicion no existe.");
            }
            
        }while((i<0 || i>2) && (j<0 || j>2));
         
        TresEnRaya[i][j] = marca;      
        
        return TresEnRaya;
    }
    
    public boolean comprobarVictoria(char [][] TresEnRaya){
        boolean victoria = false;
        
        for (int i = 0; i < 3; i++) {
            if ((TresEnRaya[i][0] == marca && TresEnRaya[i][1] == marca && TresEnRaya[i][2] == marca) ||
                (TresEnRaya[0][i] == marca && TresEnRaya[1][i] == marca && TresEnRaya[2][i] == marca)) {
                victoria = true;
            }
        }

        if ((TresEnRaya[0][0] == marca && TresEnRaya[1][1] == marca && TresEnRaya[2][2] == marca) ||
            (TresEnRaya[0][2] == marca && TresEnRaya[1][1] == marca && TresEnRaya[2][0] == marca)) {
            victoria = true;
        }

        
        return victoria;
    }
   
   
}
