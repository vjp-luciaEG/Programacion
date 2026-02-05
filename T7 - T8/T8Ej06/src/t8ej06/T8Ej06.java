/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T8Ej06 {

    /**
     * @param args the command line arguments
     */
    //Metodo para elegir la longitud del vector
    public static int elegirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        do {
            System.out.println("Cuantos empleados desea introducir? ");

            try {
                longitud = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Dato erroneo. Introducir numero entero.");
            } finally {
                entrada.nextLine();
            }

        } while (longitud < 0);

        return longitud;
    }

    //Metodo para crear y rellenar Empleado
    public static void introducirEmpleados(Empleado[] empleado) {
        for (int i = 0; i < empleado.length; i++) {

            System.out.println("Empleado " + (i + 1));

            Empleado e = new Empleado(); //Creamos el objeto Empleado del array

            String nombre = e.introducirNombre();
            int horas = e.introducirHoras();
            float tarifa = e.introducirTarifa();

            empleado[i] = new Empleado(nombre, horas, tarifa); //Introducimos los datos del empleado
        }
    }

    //Metodos para mostar datos
    public static void mostrarSueldosBrutos(Empleado[] empleado) {
        for (Empleado e : empleado) {    //Recorremos el array de objetos Empleado para calcular el sueldo de cada Empleado
            e.calcularSueldoBruto();
        }
    }

    public static void mostrarDatosEmpleados(Empleado[] empleado) {
        for (Empleado e : empleado) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] empleado = new Empleado[elegirLongitud()]; //Creamos el array de objetos Empleado

        introducirEmpleados(empleado);
        mostrarSueldosBrutos(empleado);

    }

}
