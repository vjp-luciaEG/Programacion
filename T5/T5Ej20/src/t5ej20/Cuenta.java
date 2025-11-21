/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej20;

/**
 *
 * @author alumno
 */
public class Cuenta {
    
    //Atributos
    private static float saldo;
    
    //Constructores

    public Cuenta() {
        saldo = 0;
    }

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }
    
    //Getters/Setters
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    //Metodos
    public static void ingresarSaldo(float cantidadRecibida){
        saldo = saldo + cantidadRecibida;
    }

    public void extraerSaldo(float cantidadRecibida){
        saldo = saldo - cantidadRecibida;
    }
    
    //Mostrar datos
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
    
}
