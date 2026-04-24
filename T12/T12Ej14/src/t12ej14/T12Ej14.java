/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12ej14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class T12Ej14 {

    /**
     * @param args the command line arguments
     */
    public final static String FICHERO = "C:\\Users\\alumno\\Documents\\NetBeansProjects\\T12Ej13\\DatosBeca.txt"; //Ruta del archivo

    //Metodo para calcular cantidad de beca
    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos) {

        if (suspensos >= 2) {
            return 0;
        }

        double beca = 1500;

        if (ingresos <= 12000) {
            beca += 500;
        }

        if (edad < 23) {
            beca += 200;
        }

        if (suspensos == 0) {
            beca += 500;
        } else if (suspensos == 1) {
            beca += 200;
        }

        if (residencia.equalsIgnoreCase("NO")) {
            beca += 1000;
        }

        return beca;
    }

    //Metodo que lee el fichero, almacena los datos de cada Becario en variables y muestra las becas
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        try (
                FileReader fr = new FileReader(FICHERO); 
                BufferedReader br = new BufferedReader(fr);) 
        {          
            String nombre = "", sexo = "", residencia = "";
            int edad = 0, suspensos = 0;
            double ingresos = 0;
            
            String linea = br.readLine();
            
            while (linea != null) {
                if (linea.startsWith("Nombre:")) {
                    nombre = linea.split(": ")[1];
                } else if (linea.startsWith("Sexo:")) {
                    sexo = linea.split(": ")[1];
                } else if (linea.startsWith("Edad:")) {
                    edad = Integer.parseInt(linea.split(": ")[1]);
                } else if (linea.startsWith("Numero de suspensos:")) {
                    suspensos = Integer.parseInt(linea.split(": ")[1]);
                } else if (linea.startsWith("Residencia Familiar:")) {
                    residencia = linea.split(": ")[1];
                } else if (linea.startsWith("Ingreso anual:")) {
                    ingresos = Double.parseDouble(linea.split(": ")[1]);
                } else if (linea.equals("-----")) {

                    double beca = calcularBeca(edad, suspensos, residencia, ingresos);

                    if (beca > 0) {
                        System.out.println(nombre + ": " + beca + " euros");
                    }
                }
                linea = br.readLine();
            }

        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            leerFichero(FICHERO);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }
    }

}
