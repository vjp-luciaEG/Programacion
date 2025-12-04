/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6ej07;

/**
 *
 * @author lucia
 */
public class T6Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos objeto de la clase televisor
        Televisor tv = new Televisor();
        
        tv.encender();
        System.out.println(tv);
        
        for(byte i=1;i<=3;i++){
            tv.subirVolumen();
        }
        
        tv.cambiarCanal(5);
        tv.bajarVolumen();
        tv.apagar();
        System.out.println(tv);
        
        //Creamos objeto de la clase Radio
        Radio radio = new Radio();
        
        radio.encender();
        System.out.println(radio);
        
        for(byte i=1;i<=3;i++){
            radio.subirVolumen();
        }
        
        radio.cambiarCanal((float) 98.7);
        radio.bajarVolumen();
        radio.apagar();
        System.out.println(radio);
    }
    
}
