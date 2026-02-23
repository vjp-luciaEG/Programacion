/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej06;

/**
 *
 * @author alumno
 */
public class T10_Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1-Introducir las ventas de coches.");
        System.out.println("2-Mostrar ventas.");
        System.out.println("3-Mostrar ventas al reves");
        System.out.println("4-Suma total de ventas");
        System.out.println("5-Ventas totales meses por contenido.");
        System.out.println("6-Mostrar mes con mas ventas");
        System.out.println("7-Salir");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    }
    
}
