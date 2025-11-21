/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author alumno
 */
public class ProductoRefrigerado extends Producto {
    
    //Atributos
    private String codigoSupervision;
    
    //Constructores

    public ProductoRefrigerado() {
        super();
        codigoSupervision = "";
    }

    public ProductoRefrigerado(String codigoSupervision, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
    }
    
    //Getters/Setters
    public String getCodigoSupervision(){
        return codigoSupervision;
    }
    
    public void setCodigoSupervision(String codigoSupervision){
        this.codigoSupervision = codigoSupervision;
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "ProductoRefrigerado{" + super.toString() + "codigoSupervision=" + codigoSupervision + '}';
    }
    
    
    
}
