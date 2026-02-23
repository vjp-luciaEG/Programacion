/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10_ej01;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T10_Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarLista(ArrayList<String> listaNombres){
        Scanner entrada = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        
        int opcionUsuario;
        do{
            System.out.println("Introduce un nombre:");
            listaNombres.add(entrada.nextLine());
            System.out.println("Desea introducir otro nombre?\n1-Si\n2-No");
            opcionUsuario = opcion.nextInt();
        }while(opcionUsuario!=2);
    }
    
    public static void mostrarNombres(ArrayList<String> listaNombres){
        if (!listaNombres.isEmpty()) {
            for (int i = 0; i < listaNombres.size(); i++) {
                System.out.println(listaNombres.get(i));
            }
        }
        System.out.println(listaNombres);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> listaNombres = new ArrayList<>();
        rellenarLista(listaNombres);
        mostrarNombres(listaNombres);
    }
    
}
