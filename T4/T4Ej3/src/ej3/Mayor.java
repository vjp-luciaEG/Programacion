/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author alumno
 */
public class Mayor {
    
    public static void elMayor(int num1,int num2,int num3){
        int x;
        if(num1>num2){
            x = num1;
            num1 = num2;
            num2 = x;            
        }
        if(num2>num3){
            x = num2;
            num2 = num3;
            num3 = x;
        }
        System.out.println("El numero mayor de los introducidos es " + num3);
    }
    
}
