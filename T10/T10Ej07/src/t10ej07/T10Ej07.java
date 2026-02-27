/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10ej07;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class T10Ej07 {

    /**
     * @param args the command line arguments
     */
    public static int introducirOpcion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1-Rellenar temperaturas.");
        System.out.println("2-Mostrar temperaturas.");
        System.out.println("3-Visualizar temperatura media");
        System.out.println("4-Dias mas caluroso del mes");
        System.out.println("5-Salir.");
    }

    public static void rellenarTemperaturas(ArrayList<ArrayList<Integer>> mes, String[] diasSemana) {
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<4;i++){
            mes.add(new ArrayList<>());
            for(int j = 0; j<diasSemana.length;j++){
                int temperatura = (int) (Math.random()*50)-5;
                mes.get(i).add(temperatura);
            }
        }

    }

    public static void mostrarTemperaturas(ArrayList<ArrayList<Integer>> mes, String[] diasSemana, int diaInicio){
        int contadorDia = 1;
        
        for (int i = 0; i < 4; i++) {
            boolean semanaCompleta = false;
            for (int j = diaInicio; j < diasSemana.length; j++) {

                System.out.println(diasSemana[j] + " dia " + contadorDia + ": " + mes.get(i).get(j) + " grados");
                contadorDia++;
                if(j==6 && !semanaCompleta){
                    j=-1;
                    semanaCompleta = true;
                }
            }
        }
    }
    
    public static void mostrarMediaMes(ArrayList<ArrayList<Integer>> temperaturas, String[] diasSemana) {
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                suma += temperaturas.get(i).get(j);
            }
        }

        double media = (double) suma / (4 * diasSemana.length);
        System.out.println("La temperatura media del mes es:" + media);
    }

    public static void mostrarDiasMasCalurosos(ArrayList<ArrayList<Integer>> temperaturas,String[] diasSemana,int diaInicio) {

        int maxTemp = temperaturas.get(0).get(0);

        // Buscar máxima temperatura
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < diasSemana.length; j++) {
                if (temperaturas.get(i).get(j) > maxTemp) {
                    maxTemp = temperaturas.get(i).get(j);
                }
            }
        }

        System.out.println("Dias mas calurosos:");

        int contadorDia = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < diasSemana.length; j++) {

                int indiceDiaSemana = (diaInicio + contadorDia - 1) % 7;

                if (temperaturas.get(i).get(j) == maxTemp) {
                    System.out.println("El " + diasSemana[indiceDiaSemana] + " dia " + contadorDia + " de la semana " + i+1 + " con " + maxTemp + " grados.");
                }
                contadorDia++;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<ArrayList<Integer>> mes = new ArrayList<>();
        String[] diasSemana = {"Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado", "Domingo"};
        
        int diaInicio = 6;
        int opcion = 0;
        do {
            mostrarMenu();
            switch (opcion = introducirOpcion()) {
                case 1: {
                    rellenarTemperaturas(mes, diasSemana);
                    break;
                }
                case 2: {
                    mostrarTemperaturas(mes, diasSemana, diaInicio);
                    break;
                }
                case 3: {
                    mostrarMediaMes(mes, diasSemana);
                    break;
                }
                case 4: {
                    mostrarDiasMasCalurosos(mes, diasSemana, diaInicio);
                    break;
                }
                case 5: {
                    System.err.println("Programa finalizado");
                    break;
                }
                default:
                    System.err.println("Opcion no disponible");
            }

        } while (opcion != 5);
    }

}
