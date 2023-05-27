/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class Archivo {
    private String nombre, contenido;
    private int tamaño;
    
    public Archivo(String nombreDado,String contenidoDado){
        this.nombre=nombreDado;
        this.contenido=contenidoDado;
        this.tamaño=this.contenido.length();
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", contenido=" + contenido + ", tamaño=" + tamaño + "}\n";
    }
    
    
}
