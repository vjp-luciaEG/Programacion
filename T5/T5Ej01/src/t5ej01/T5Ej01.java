/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T5Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        miCoche.setMarca("BMW");
        miCoche.setModelo("M4");
        miCoche.setColor("Negro");
        
        cochePadre.setMarca("Audi");
        cochePadre.setModelo("A4");
        cochePadre.setColor("Azul");
        
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        for(int i=1;i<=5;i++){
            miCoche.acelerarCoche();
        }
        
        miCoche.frenarCoche();
        miCoche.frenarCoche();
        
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        
        cochePadre.apagarCoche();
        
        miCoche.obtenerEstado();
        
        cochePadre.obtenerEstado();
        
    }
    
}
