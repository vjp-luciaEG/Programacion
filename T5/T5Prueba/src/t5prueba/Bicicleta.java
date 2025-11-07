/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5prueba;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    
    //Atributos
    private String marca;
    private String color;
    private String tipo;
    private int antiguedad;
    
    //Constructores
    //Los veremos mas adelante
    
    //Metodos getters/setters
    public String getMarca(){
        return marca;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public void setAntiguedad(int a){
        antiguedad = a;
    }
    
    //Otros metodos
    public void mostrarAntiguedad(){
        if(antiguedad > 10){
            System.out.println("La bici es antigua");
        }
        else{
            System.out.println("La bici es nueva");
        }
    }
    //Mostrar
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("Antiguedad: " + antiguedad);
    }
}
