/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej01;

/**
 *
 * @author alumno
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    public void setMarca(String m){
        marca = m;
    }
    
    public void setModelo(String model){
        modelo = model;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public void arrancarCoche(){
        motorEncendido = true;
        velocidad = 10;
    }
    
    public void apagarCoche(){
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche(){
        velocidad += 20;
    }
    
    public void frenarCoche(){
        velocidad -= 6;
    }
    
    public void obtenerEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Estado: " + motorEncendido);
    }
}
