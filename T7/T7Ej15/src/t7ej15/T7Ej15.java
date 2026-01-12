/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T7Ej15 {

    /**
     * @param args the command line arguments
     */
    
    public static void mostrarMenu(){
        System.out.println("MENU");
        System.out.println("1-Introducir ventas mensuales.");
        System.out.println("2-Mostrar ventas mensuales.");
        System.out.println("3-Mostrar ventas mensuales al reves.");
        System.out.println("4-Suma total de ventas.");
        System.out.println("5-Suma total de ventas de meses pares.");
        System.out.println("6-Mostrar mes con mas ventas.");
        System.out.println("7-Salir del programa.");
    }
    
    public static int [] rellenarVentas(int [] ventas){
        for(int i=0; i < ventas.length; i++){
            int valor = (int) Math.floor(Math.random()*100+10);
            ventas[i] = valor;
        }
        return ventas;
    }
    
    public static void mostrarVentas(int [] ventas, String[] meses){
        for(int i=0; i < ventas.length; i++){
            System.out.println("En el mes de " + meses[i] + " las ventas fueron de " + ventas[i]);  
        }
    }
    
    public static void mostrarVentasInversa(int [] ventas, String[] meses){
        for(int i = ventas.length - 1; i > 0; i--){
            System.out.println("En el mes de " + meses[i] + " las ventas fueron de " + ventas[i]);  
        }
    }
    
    public static void mostrarSumaVentas (int [] ventas){
        int sumaVentas = 0;
        
        for(int i=0; i < ventas.length; i++){
            sumaVentas = sumaVentas + ventas[i]; 
        }
        
        System.out.println("Total de ventas: " + sumaVentas);
    }
    
    public static void mostrarSumaVentasPares (int [] ventas, String[] meses){
        int sumaVentas = 0;
        
        for(int i=0; i < ventas.length; i++){
            if(i%2==0){
                sumaVentas = sumaVentas + ventas[i]; 
            }
        }
        
        System.out.println("Total de ventas en los meses pares: " + sumaVentas);
    }
    
    public static void mostrarMesMayorVentas(int [] ventas, String[] meses){
        String mesAux = "";
        int maxVentas = ventas[0];
        int posicion = 0;
        
        for(int i=1; i < ventas.length; i++){
            if(ventas[i] > maxVentas){
                maxVentas = ventas[i];
                posicion = i;
            }
        }
        
        System.out.println("El mes con mayor numero de ventas es: " + meses[posicion] + ". Numero de ventas: " + maxVentas);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int[] ventas = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        byte opcion = 0;
        do{
            mostrarMenu();
            System.out.println("Introduzca una opcion: ");
            opcion = entrada.nextByte();
            
            switch(opcion){
                case 1:{
                    rellenarVentas(ventas);
                    break;
                }
                case 2: {
                    mostrarVentas(ventas, meses);
                    break;
                }
                case 3: {
                    mostrarVentasInversa(ventas, meses);
                    break;
                }
                case 4: {
                    mostrarSumaVentas(ventas);
                    break;
                }
                case 5: {
                    mostrarSumaVentasPares(ventas, meses);
                    break;
                }
                case 6: {
                    mostrarMesMayorVentas(ventas, meses);
                    break;
                }
                case 7: {
                    System.out.println("Hasta la proxima");
                    break;
                }
                default: {
                    System.out.println("Opcion no disponible");
                }
            }
        }while(opcion!=7);
        
    }
    
}
