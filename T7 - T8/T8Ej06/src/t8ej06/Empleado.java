/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej06;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private float tarifaPorHora;

    public Empleado() {
        nombre="";
        horasTrabajadas = 0;
        tarifaPorHora = 2.5F;
    }

    public Empleado(String nombre, int horasTrabajadas, float tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    public void calcularSueldoBruto(){
        double sueldoBruto = horasTrabajadas * tarifaPorHora;
        
        if(horasTrabajadas > 40){
            tarifaPorHora += tarifaPorHora/2;
            sueldoBruto += tarifaPorHora * (horasTrabajadas - 40);
        } 
        
        System.out.println(nombre + "\nSueldo bruto:" + sueldoBruto);
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}';
    }
    
    
}
