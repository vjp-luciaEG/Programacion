/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej06;

/**
 *
 * @author alumno
 */
public class Libro implements Transformable{
    
    private String titulo;
    private String autor;
    private String genero;

    public Libro() {
        titulo = "";
        autor = "";
        genero = "";
    }

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }

    @Override
    public void contarVocales(String cadena) {
        int contadorVocal = 0;
        for(char i = 0;i < cadena.length();i++){
            cadena = cadena.toLowerCase();
            char letra = cadena.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVocal++;
            }
        }
        System.out.println("Vocales = " + contadorVocal);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String cadena = titulo;
        String cadena2 = autor;
        String cadena3 = genero;
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
        return titulo.equalsIgnoreCase(cadena) || autor.equalsIgnoreCase(cadena) || genero.equalsIgnoreCase(cadena);
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }
    
    
    
}
