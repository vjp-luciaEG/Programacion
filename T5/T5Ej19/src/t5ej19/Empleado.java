/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej19;

/**
 *
 * @author alumno
 */
public class Empleado {
    
    //Atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;
    
    //Constructores
    public Empleado() {
        nombre = "";
        horasTrabajadas = 0;
        tarifaPorHora = 0;
    }

    public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    //Getters/Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double getTarifaPorHora(){
        return tarifaPorHora;
    }
    public void setTarifaPorHora(double tarifaPorHora){
        this.tarifaPorHora = tarifaPorHora;
    }
    
    //Metodos 
    public double calcularSueldoBruto(String nomb, int horas, double tarifa){
        double sueldoBruto;
        int horasExtra;
        if(horas <= 40){
            sueldoBruto = horas * tarifa;
        }
        else{
            horasExtra = horas - 40;
            sueldoBruto = (40 * tarifa) + (horasExtra * tarifa * 1.5);
        }
        return sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}';
    }
    
    
    
}
