/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11ej06;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Campania {
    
    private Set<Donacion> conjuntoDonaciones;
    private String nombreCampania;

    public Campania() {
        conjuntoDonaciones = new TreeSet<>();
        nombreCampania = "";
    }

    public Campania(Set<Donacion> conjuntoDonaciones, String nombreCampania) {
        this.conjuntoDonaciones = conjuntoDonaciones;
        this.nombreCampania = nombreCampania;
    }

    public Set<Donacion> getConjuntoDonaciones() {
        return conjuntoDonaciones;
    }

    public void setConjuntoDonaciones(Set<Donacion> conjuntoDonaciones) {
        this.conjuntoDonaciones = conjuntoDonaciones;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }
    
    public void aniadirDonacion(){
        System.out.println("");
        conjuntoDonaciones.add(new Donacion(Donacion.introducirNombre(), Donacion.introducirCantidad())); 
    }
    
    public void mostrarDonaciones(){
        System.out.println("DONACIONES");
        for(Donacion d : conjuntoDonaciones){
            System.out.println(d);
        }
    }
    
    public void mostrarTotalDineroDonaciones(){
        double cantidadTotal = 0;
        System.out.println("DINERO RECAUDADO");
        for(Donacion d : conjuntoDonaciones){
            cantidadTotal += d.getCantidad();
        }
        System.out.println(cantidadTotal);
    }
    
    public void mostrarDonacionesPorNombre(String nombre){
        System.out.println("BUSQUEDA...");
        for(Donacion d : conjuntoDonaciones){
            if(d.getNombreDonante().equalsIgnoreCase(nombre)){
                System.out.println(d);
            }
        }
    }
    
    public void mostrarNumeroDonaciones(){
        System.out.println("NUMERO DE DONACIONES: " + conjuntoDonaciones.size());
    }
    
    @Override
    public String toString() {
        return "Campania{" + "conjuntoDonaciones=" + conjuntoDonaciones + ", nombreCampania=" + nombreCampania + '}';
    }
    
    
}
