/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej07;

/**
 *
 * @author lucia
 */
public class Radio implements ControlRemoto{
    
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Constructores
    public Radio() {
        encendido = false;
        emisora = (float) 80.0;
        volumen = 15;
    }

    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }
    
    //Getters/Setters
    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Sobrescribir metodos de la interfaz ControlRemoto
     @Override
    public void apagar() {
        if (encendido == true){
            encendido = false;
        }
    }

    @Override
    public void encender() {
        if(encendido == false){
            encendido = true;
        }
    }

    @Override
    public void bajarVolumen() {
        if(encendido == true){
            volumen = volumen - 5;
            System.out.println("Volumen: " + getVolumen());
        }
    }

    @Override
    public void subirVolumen() {
        if(encendido == true){
            volumen = volumen + 5;
            System.out.println("Volumen: " + getVolumen());
        }
    }

    @Override
    public void cambiarCanal(float emisora) {
        if(encendido == true){
            this.emisora = emisora;
            System.out.println("Emisora actual: " + this.emisora);
        }
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    
    
    
}
