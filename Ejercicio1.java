/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {
//Este código ha sido escrito por la cuenta principal
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo archivo1=new Archivo("Albacete","es una capital");

        Archivo archivo5=new Archivo("Golosalvo", "12345678910111213141516171819202122232425262728");
        
        DiscoDuro discoDuro1=new DiscoDuro(100);
        
        discoDuro1.guardarArchivo(archivo1);
        discoDuro1.guardarArchivo(archivo2);
        discoDuro1.guardarArchivo(archivo3);
        discoDuro1.guardarArchivo(archivo4);
        System.out.println("----------------------------------------------");
        discoDuro1.listarArchivos();
        System.out.println("----------------------------------------------");
        discoDuro1.eliminarArchivo("Murcia");
        System.out.println("----------------------------------------------");
        discoDuro1.eliminarArchivo("Mariano Rajoy");
        System.out.println("----------------------------------------------");
        discoDuro1.listarArchivos();
        System.out.println("----------------------------------------------");
        discoDuro1.mostrarPorcentaje();
        System.out.println("----------------------------------------------");
        discoDuro1.formatearDisco();
        System.out.println("----------------------------------------------");
        discoDuro1.listarArchivos();
    }
    
}
