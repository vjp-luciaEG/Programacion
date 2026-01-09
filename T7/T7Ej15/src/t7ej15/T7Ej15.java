/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7ej15;

/**
 *
 * @author alumno
 */
public class T7Ej15 {

    /**
     * @param args the command line arguments
     */
    
    public void mostrarMenu(){
        System.out.println("1-Introducir ventas mensuales.");
        System.out.println("2-Mostrar ventas mensuales.");
        System.out.println("3-Mostrar ventas mensuales al reves.");
        System.out.println("4-Suma total de ventas por año.");
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
    
    public static void mostrarVector(int [] ventas, String[] meses){
        for(int i=0; i < ventas.length; i++){
            System.out.println("El valor de la posicion " + meses[i] + " es igual a " + ventas[i]);  
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        
    }
    
}
