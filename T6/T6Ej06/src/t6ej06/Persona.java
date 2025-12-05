/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej06;

/**
 *
 * @author alumno
 */
public class Persona implements Transformable{
    
    private String nombre;
    private String apellidos;
    private String alias;

    public Persona() {
        nombre = "";
        apellidos = "";
        alias = "";
    }

    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales(String cadena) {
        int contadorVocal = 0;
        for(char i = 0;i <= cadena.length();i++){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                contadorVocal++;
            }
        }
        System.out.println("Vocales = " + contadorVocal);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String cadena = nombre;
        String cadena2 = apellidos;
        String cadena3 = alias;
        String varIntermedia = "";
        
        for(byte i=1; i<=2; i++){
            if(cadena.length() < cadena2.length()){
            varIntermedia = cadena;
            cadena = cadena2;
            cadena2 = cadena;
            } 
            if(cadena2.length() < cadena3.length()){
                varIntermedia = cadena2;
                cadena2 = cadena3;
                cadena3 = cadena2;
            }
        }
        return cadena;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        return nombre.equalsIgnoreCase(cadena) || apellidos.equalsIgnoreCase(cadena) || alias.equalsIgnoreCase(cadena);
    }
    
}
