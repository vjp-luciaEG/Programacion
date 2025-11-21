/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej24;

/**
 *
 * @author alumno
 */
public class T5Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GESTION DE EMPRESA AGROALIMENTARIA
        
        //Creamos un objeto de cada tipo
        ProductoFresco productoFresco01 = new ProductoFresco("12/03/23", "China", "13/04/25", 2315);
        ProductoRefrigerado productoRefrigerado01 = new ProductoRefrigerado("63742X", "23/05/26", 7823);
        ProductoCongelado productoCongelado01 = new ProductoCongelado(-3, "05/09/25", 5372);
        
        //Mostramos datos de cada objeto creado
        System.out.println(productoFresco01);
        System.out.println(productoRefrigerado01);
        System.out.println(productoCongelado01);
    }
    
}
