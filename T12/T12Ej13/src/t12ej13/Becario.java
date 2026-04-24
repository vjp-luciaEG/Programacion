/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t12ej13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Becario {
    
    //Atributos
    private String nombreConApellido;
    private String sexo;
    private int edad;
    private int numSuspensos;
    private String residencia;
    private double ingresoAnual;

    //Constructores
    public Becario() {
        nombreConApellido = "";
        sexo = "";
        edad = 0;
        numSuspensos = 0;
        residencia = "";
        ingresoAnual = 0;
    }

    public Becario(String nombreConApellido, String sexo, int edad, int numSuspensos, String residencia, double ingresoAnual) {
        this.nombreConApellido = nombreConApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.numSuspensos = numSuspensos;
        this.residencia = residencia;
        this.ingresoAnual = ingresoAnual;
    }

    //Getters/Settes
    public String getNombreConApellido() {
        return nombreConApellido;
    }

    public void setNombreConApellido(String nombreConApellido) {
        this.nombreConApellido = nombreConApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumSuspensos() {
        return numSuspensos;
    }

    public void setNumSuspensos(int numSuspensos) {
        this.numSuspensos = numSuspensos;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public double getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(double ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }

    //Metodos para introducir datos
    public static String introducirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduca nombre y apellido:");
        String text = entrada.nextLine();
        return text;
    }
    
    public static String introducirSexo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduca sexo(H|M):");
        String text = entrada.nextLine();
        return text;
    }
    
    public static String introducirResidencia(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tiene residencia familiar?:");
        String text = entrada.nextLine();
        return text;
    }
    
    public static int introducirEdad(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduca edad:");
        int num = entrada.nextInt();
        return num;
    }
    
    public static int introducirSuspensos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduca numero de suspensos del curso anterior:");
        int num = entrada.nextInt();
        return num;
    }
    
    public static double introducirIngresos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduca ingresos anuales de la familia:");
        double num = entrada.nextDouble();
        return num;
    }
    
    @Override
    public String toString() {
        return "Becario{" + "nombreConApellido=" + nombreConApellido + ", sexo=" + sexo + ", edad=" + edad + ", numSuspensos=" + numSuspensos + ", residencia=" + residencia + ", ingresoAnual=" + ingresoAnual + '}';
    }
    
    
}
