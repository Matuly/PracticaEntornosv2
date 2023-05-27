/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class DiscoDuro {
    private int capacidadMax, capacidadActual;
    private Map<String,Archivo> mapaArchivos ; 
    
    public DiscoDuro(int capacidadMaxDada){
        mapaArchivos=new HashMap<>(); 
        this.capacidadMax=capacidadMaxDada;
        this.capacidadActual=0;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public Map<String, Archivo> getMapaArchivos() {
        return mapaArchivos;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void setMapaArchivos(Map<String, Archivo> mapaArchivos) {
        this.mapaArchivos = mapaArchivos;
    }
    public void mostrarArchivos(String nombreDado){
      System.out.println(mapaArchivos.get(nombreDado));
    }
    public void listarArchivos(){
        System.out.println(mapaArchivos.keySet());
    }
    public void mostrarPorcentaje(){
        int porcentaje;
        porcentaje=(this.capacidadActual*100)/this.capacidadMax;
       System.out.println("***El porcentaje de disco usado es: "+porcentaje+"%");
    }
    public void formatearDisco(){
        mapaArchivos.clear();
        System.out.println("***Se ha formateado el disco***");
    }
    public void guardarArchivo(Archivo archivoDado){
       if(comprobarEspacio(archivoDado)){
           comprobarNombre(archivoDado);
           mapaArchivos.put(archivoDado.getNombre(),archivoDado);
           System.out.println("***El archivo se ha añadido correctamente***");
           this.capacidadActual+=archivoDado.getTamaño();
       } else{
           System.out.println("***El archivo que desea añadir supera la capacidad disponible en el Disco Duro. ¡Elimine archivos!***");
       }
    }
    private boolean comprobarEspacio(Archivo archivoDado){
      if(this.capacidadMax>=archivoDado.getTamaño()+this.capacidadActual){
        return true;  
      }else{
          return false;
      }  
    }
    private void comprobarNombre(Archivo archivoDado){
        if(mapaArchivos.containsKey(archivoDado.getNombre())){
            System.out.println("***Existe un archivo con ese nombre, se procederá a su sobreescritura");
        }
    }
    public void eliminarArchivo(String nombreDado){
        if(mapaArchivos.containsKey(nombreDado)){
        this.capacidadActual-=mapaArchivos.get(nombreDado).getTamaño();
        mapaArchivos.remove(nombreDado);
        System.out.println("****Se ha borrado correctamente****");
        
        }else{
            System.out.println("***No existe un archivo con ese nombre***");
        }
        
    }
}
