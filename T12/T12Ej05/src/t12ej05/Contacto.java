/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t12ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Contacto {
    //Atributos
    private String nombre;
    private byte edad;
    private int tel;

    //Constructores
    public Contacto() {
        nombre = "";
        edad = 0;
        tel = 0;
    }

    public Contacto(String nombre, byte edad, int tel) {
        this.nombre = nombre;
        this.edad = edad;
        this.tel = tel;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    //Metodos para introducir datos
    public static String pedirNombre() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = entrada.nextLine();
        return nombre;
    }
    
    public static byte pedirEdad() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Edad:");
        byte edad = entrada.nextByte();
        return edad;
    }
    
    public static int pedirNumero() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Telefono:");
        int num = entrada.nextInt();
        return num;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", tel=" + tel + '}';
    }
    
    
}
