/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author alumno
 */
public class Producto {
    
    //Atributos de la clase
    private String fechaCaducidad;
    private int numeroLote;
    
    //Constructores
    public Producto() {
        fechaCaducidad = "";
        numeroLote = 0000;
    }

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    //Getters/Setters
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    
    public void setFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public int getNumeroLote(){
        return numeroLote;
    }
    
    public void setNumeroLote(int numeroLote){
        this.numeroLote = numeroLote;
    }
    
    //Metodo Mostrar datos de la clase Producto
    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + '}';
    }
    
    
}
