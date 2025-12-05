/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej07;

/**
 *
 * @author lucia
 */
public class Televisor implements ControlRemoto{
    
    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;

    //Constructores
    public Televisor() {
        encendido = false;
        canal = 1;
        volumen = 10;
    }
    
    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }
    
    //Getters/Setters
    public int getCanal(){
        return canal;
    }  
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    //Sobrescribir metodos de la interfaz ControlRemoto
    @Override
    public void apagar() {
        if (encendido == true){
            System.out.println("La TV se apagara en 10s");
            encendido = false;
        }
    }

    @Override
    public void encender() {
        if(encendido == false){
            encendido = true;
            System.out.println("Canal actual: " + getCanal());
        }
    }

    @Override
    public void bajarVolumen() {
        if(encendido == true){
            volumen--;
            System.out.println("Volumen: " + getVolumen());
        }
    }

    @Override
    public void subirVolumen() {
        if(encendido == true){
            volumen++;
            System.out.println("Volumen: " + getVolumen());
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if(encendido == true){
            this.canal = (int) canal;
            System.out.println("Canal actual: " + this.canal);
        }
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
    
}
