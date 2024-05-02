/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        int doctores;
        int enfermeros;

        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el numero de doctores");
        doctores = entrada.nextInt();
        System.out.println("Ingrese el numero de enfermeros");
        enfermeros = entrada.nextInt();
        Hospital h1 = new Hospital(nombre, ciudad, doctores,
                enfermeros);

        System.out.printf("Nombre: %s\nCiudad: %s\nNumero de Doctores: %d\n"
                + "Numero de enfermeros: %d\n", h1.obtenerNombre(),
                h1.obtenerCiudad(), h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());

    }
}
