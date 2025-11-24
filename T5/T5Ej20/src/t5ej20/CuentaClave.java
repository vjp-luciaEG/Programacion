/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej20;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class CuentaClave extends Cuenta{
    
    //Atributos
    private int clave;
    
    //Constructores
    public CuentaClave() {
        super();
        clave = 0;
    }

    public CuentaClave(int clave, float saldo) {
        super(saldo);
        this.clave = clave;
    }

    public CuentaClave(int clave) {
        super();
        this.clave = clave;
    }
    
    //Getters/Setters
    public int getClave(){
        return clave;
    }
    
    public void setClave(int clave){
        this.clave = clave;
    }
    
    //Otros metodos
    public static int pedirClave(){
        Scanner entradaClave = new Scanner(System.in);
        System.out.println("Introduzca una clave: ");
        int claveUsuario = entradaClave.nextInt();
        return claveUsuario;
    }
    
    //Sobreescribir metodo de la clase padre Cuenta
    @Override
    public void extraerSaldo(float cantidadRecibida) {
        if(cantidadRecibida<= super.getSaldo()){
             super.extraerSaldo(cantidadRecibida);
        }
        else{
            System.err.println("No hay saldo suficiente");
        }
    } 
    
    //Mostrar datos
    @Override
    public String toString() {
        return "CuentaClave{" + super.toString() + "clave=" + clave + '}';
    }
    
    
    
}
