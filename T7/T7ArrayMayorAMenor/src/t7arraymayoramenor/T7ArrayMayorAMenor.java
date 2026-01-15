/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7arraymayoramenor;

/**
 *
 * @author alumno
 */
public class T7ArrayMayorAMenor {

    /**
     * @param args the command line arguments
     */
    
    public static void rellenarVector(int [] vector){
        boolean encontrado = false;
        int posicion = 0, i = 0;
        int numero = (int) Math.floor(Math.random()*10);
        
        while(!encontrado && i < vector.length){
            if(numero > vector[i]){
                posicion = i;
                encontrado = true;
            }
            i++;
        }
        
        if(encontrado){
            for(i = vector.length - 1; i > posicion; i--){
                vector[i] = vector[i-1];
            }
            vector[posicion]=numero;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
