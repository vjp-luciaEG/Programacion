/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9ej09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T9Ej09 {

    /**
     * @param args the command line arguments
     */
    
    //Metodos para introducir datos
    public static String introducirUsuario() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Usuario: ");
        String usuario = entrada.nextLine();

        return usuario;
    }

    public static String introducirContrasena() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Password: ");
        String password = entrada.nextLine();

        return password;
    }
    
    //Metodo para verificar contraseña
    public static boolean verificarContrasena(String usuario, String password) {
        //La contraseña debe tener menos de 6 caracteres
        if (password.length() < 6) {
            System.err.println("Error: debe tener al menos 6 caracteres.");
            return false;
        }

        //Debe tener 2 digitos
        int contadorDigitos = 0;    //Recorremos la contraseña por caracter para comprobar si es un digito
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.err.println("Error: debe contener al menos 2 digitos.");
            return false;
        }

        //La contraseña no puede contener el nombre de usuario
        if (password.toLowerCase().contains(usuario.toLowerCase())) {
            System.err.println("Error: la contrasena no puede contener el usuario.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, password;
        boolean correcion;

        usuario = introducirUsuario();      //Almacenamos los datos del usuario
        do {                                    
            password = introducirContrasena();  //Almacenamos los datos de la contraseña
            correcion = verificarContrasena(usuario, password);  //Verificamos la contraseña
        } while (!correcion);

        System.out.println("Contrasena valida.");
    }

}
