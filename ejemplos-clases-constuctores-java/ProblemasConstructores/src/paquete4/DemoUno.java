/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author utpl
 */
public class DemoUno {
    
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        
        // String mensaje = cadena1 + " " + cadena2;
        String mensaje = String.format("%s\n\n%s\n",
                cadena1, cadena2);
        System.out.println(mensaje);
    }
}
