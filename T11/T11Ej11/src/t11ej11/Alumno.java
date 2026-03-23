/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej11;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno implements Comparable<Alumno>{
    
    private String dni;
    private int numExp;
    private float notaMedia;

    public Alumno() {
        dni = "";
        numExp = 0;
        notaMedia = 0F;
    }

    public Alumno(String dni, int numExp, float notaMedia) {
        this.dni = dni;
        this.numExp = numExp;
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    public static String introducirDni(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir DNI:");
        String dni = entrada.nextLine();
        return dni;
    }
    
    public static int introducirNumExp(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir numero de expediente:");
        int numExp = entrada.nextInt();
        return numExp;
    }
    
    public static float introducirNotaMedia(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introducir nota media:");
        float nota = entrada.nextFloat();
        return nota;
    }

    @Override
    public int compareTo(Alumno o) {
         if(this.numExp < o.getNumExp()){
            return -1;
        } else if (this.numExp > o.getNumExp()) {
            return 1;
        } else {
            return 0;
        }   
    }
    
    

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", numExp=" + numExp + ", notaMedia=" + notaMedia + '}';
    }
    
    
}
