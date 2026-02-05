/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8ej06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Empleado {

    private String nombre;
    private int horasTrabajadas;
    private float tarifaPorHora;

    //Constructores
    public Empleado() {
        nombre = "";
        horasTrabajadas = 0;
        tarifaPorHora = 2.5F;
    }

    public Empleado(String nombre, int horasTrabajadas, float tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    //Getters y Setters
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

    //Metodos para introducir datos por pantalla
    public String introducirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre del empleado: ");
        this.nombre = entrada.nextLine();
        return nombre;
    }

    public int introducirHoras() {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Cuantas horas trabajo este mes? ");

            try {
                this.horasTrabajadas = entrada.nextInt();
            } catch (InputMismatchException error) {
                System.out.println(error);
                System.out.println("Dato erroneo. Introducir numero entero.");
            } finally {
                entrada.nextLine();
            }
        } while (this.horasTrabajadas < 0);
        return horasTrabajadas;
    }

    public float introducirTarifa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es su tarifa por hora de trabajo?  ");
        this.tarifaPorHora = entrada.nextFloat();

        return tarifaPorHora;
    }

    //Otros metodos
    public void calcularSueldoBruto() {
        double sueldoBruto;

        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            int extras = horasTrabajadas - 40;
            sueldoBruto = (40 * tarifaPorHora) + (extras * tarifaPorHora * 1.5);
        }

        System.out.println(nombre + " trabajo " + horasTrabajadas + " horas, cobra " + tarifaPorHora + " euros la hora.\nSueldo bruto: " + sueldoBruto);
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}';
    }

}
