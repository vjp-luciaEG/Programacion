/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5prueba;

/**
 *
 * @author alumno
 */
public class T5Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicicleta bici1 = new Bicicleta();
        
        bici1.setMarca("Orbea");
        bici1.setColor("Negra");
        bici1.setTipo("Montana");
        bici1.setAntiguedad(6);
        
        Bicicleta bici2 = new Bicicleta();
        
        bici2.setMarca("Canondale");
        bici2.setColor("Azul");
        bici2.setTipo("Carretera");
        bici2.setAntiguedad(12);
        
        bici1.mostrarBicicleta();
        
        bici2.mostrarBicicleta();
        
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
    }
    
}
