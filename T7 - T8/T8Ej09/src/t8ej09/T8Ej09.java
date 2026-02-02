/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8ej09;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T8Ej09 {

    /**
     * @param args the command line arguments
     */
    
    public static void mostrarNotas(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            alumno.mostrarNotasAlumno();
        }
    }
    
    public static void asignaturaMasDificil(Alumno[] alumno) {
        float mediaMin = 11F;
        String asignaturaDificil = "";

        for (int i = 0; i < alumno[0].getAsignatura().length; i++) {
            float suma = 0;
            for (Alumno a : alumno) {
                suma += a.getAsignatura()[i].getNota();
            }
            float media = suma / alumno.length;

            if (media < mediaMin) {
                mediaMin = media;
                asignaturaDificil = alumno[0].getAsignatura()[i].getNombre();
            }
        }

        System.out.println("Asignatura mas dificil: " + asignaturaDificil + " (Media: " + mediaMin + ")");
    }
    public static void mostrarMenu(){
        System.out.println("===== MENU ======");
        System.out.println("1-Rellenar notas de alumnos.");
        System.out.println("2-Mostrar notas.");
        System.out.println("3-Mejor alumno de la clase.");
        System.out.println("4-Alumno con mas suspensos.");
        System.out.println("5-Asignatura mas dificil.");
        System.out.println("6-Salir.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
       
        Alumno[] alumno = new Alumno[3];
        
        alumno[0] = new Alumno("Pepe");
        alumno[1] = new Alumno("Juan");
        alumno[2] = new Alumno("Marta");
        
        byte opcion;
        
        do{
            mostrarMenu();
            System.out.println("Introduce una opcion:");
            opcion = entrada.nextByte();
            
            switch(opcion){
                case 1:{
                   alumno[0].rellenarNotas();
                   alumno[1].rellenarNotas();
                   alumno[2].rellenarNotas();
                   break;
                }
                case 2:{
                   mostrarNotas(alumno);
                   break;
                }
                case 3:{
                    Alumno mejor = alumno[0];

                    for (Alumno a : alumno) {
                        if (a.calcularMedia() > mejor.calcularMedia()) {
                            mejor = a;
                        }
                    }
                    System.out.println("Mejor alumno: "+mejor.getNombre()+". Media: "+mejor.calcularMedia());
                    break;
                }
                case 4:{
                    Alumno peor = alumno[0];

                    for (Alumno a : alumno) {
                        if (a.calcularSuspensos() > peor.calcularSuspensos()) {
                            peor = a;
                        }
                    }
                    System.out.println("Alumno con mas suspensos: " + peor.getNombre() + " (Suspensos:" + peor.calcularSuspensos() + ")");
                    break;
                }
                case 5:{
                    asignaturaMasDificil(alumno);
                    break;
                }
                case 6:
                    System.err.println("Exit");
                    break;
                default:
                    System.err.println("Opcion no disponible.");
            }
        }while(opcion!=6);
        
    }
    
}
