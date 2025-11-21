/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author alumno
 */
public class ProductoCongelado extends Producto{
    
    //Atributos
    private int temperaturaRecomendada;
    
    //Constructores
    public ProductoCongelado() {
        super();
        temperaturaRecomendada = 0;
    }

    public ProductoCongelado(int temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Getters/Setters
    public int getTemperaturaRecomendada(){
        return temperaturaRecomendada;
    }
    
    public void setTemperaturaRecomendada(int temperaturaRecomendada){
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Mostrar datos

    @Override
    public String toString() {
        return "ProductoCongelado{" + super.toString() + "temperaturaRecomendada=" + temperaturaRecomendada + '}';
    }
    
}
