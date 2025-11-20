/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author alumno
 */
public class Frescos extends Producto {
    
    //Atributos
    private String fechaEnvasado;
    private String paisOrigen;
    
    //Constructores
    public Frescos() {
        super();
        fechaEnvasado = "";
        paisOrigen = "";
    }

    public Frescos(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    //Getters/Setters
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
    
    public void setFechaEnvasado(String fechaEnvasado){
        this.fechaEnvasado = fechaEnvasado;
    }
    
    public String getPaisOrigen(){
        return paisOrigen;
    }
    
    public void setPaisOrigen(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Frescos{" + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }

    
    
    
    
}
