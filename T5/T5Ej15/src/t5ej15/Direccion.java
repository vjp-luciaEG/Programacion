/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej15;

/**
 *
 * @author alumno
 */
public class Direccion {
    
    //Atributos de la clase Direccion
    private String calle;
    private int numero;
    private char piso;
    private String ciudad;
    
    //Constructores
    public Direccion() {
        calle = "";
        numero = 0;
        piso = 'a';
        ciudad = "";
    }

    public Direccion(String c, int num, char p, String ciu) {
        calle = c;
        numero = num;
        piso = p;
        ciudad = ciu;
    }
    
    //Mostrar datos de los atributos de la clase Direccion
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
