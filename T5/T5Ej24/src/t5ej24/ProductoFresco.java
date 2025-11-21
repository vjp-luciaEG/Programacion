/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author alumno
 */
public class ProductoFresco extends Producto {
    
    //Atributos
    private String fechaEnvasado;
    private String paisOrigen;
    
    //Constructores
    public ProductoFresco() {
        super();
        fechaEnvasado = "";
        paisOrigen = "";
    }

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
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

    //Mostrar datos
    @Override
    public String toString() {
        return "ProductoFresco{" + super.toString() + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }

    

    
    
    
    
}
