/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class EjecutableTres {
    public static void main(String[] args) {
        
        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel vPRo");
        
        System.out.printf("%s - %.2f\n",
                personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());
        
    }
}
