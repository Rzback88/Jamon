/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *Clase Main del programa, define el objeto jamon en el cual podrás comprar o vender jamones.
 * @author Francisco Caparrós Ortega
 */
public class Main {
    /**
     * Método Main del programa.
     * Es el método principal del programa.
     */
    
    public static void main(String[] args) {
        JamonCaparrosOrtegaFrancisco2122 miJamonCaparrosOrtegaFrancisco2122;
        int stockActual;
        
        miJamonCaparrosOrtegaFrancisco2122 = new JamonCaparrosOrtegaFrancisco2122("5Jotas",580,100);
        vendeJamCaparrosOrtegaFrancisco2122(miJamonCaparrosOrtegaFrancisco2122);
        
        compraJamCaparrosOrtegaFrancisco2122(miJamonCaparrosOrtegaFrancisco2122);
        stockActual = miJamonCaparrosOrtegaFrancisco2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
    /**
     * Método compraJam
     * 
     * En este método se introducen los jamones que se quieren comprar.
     * @param compraJamCaparrosOrtegaFrancisco2122 
     */

    private static void compraJamCaparrosOrtegaFrancisco2122(JamonCaparrosOrtegaFrancisco2122 miJamonCaparrosOrtegaFrancisco2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonCaparrosOrtegaFrancisco2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }
    /**
     * Método vendeJam
     * 
     * En este método se introducen los jamones que se quieren vender.
     * @param vendeJamCaparrosOrtegaFrancisco2122 
     */

    private static void vendeJamCaparrosOrtegaFrancisco2122(JamonCaparrosOrtegaFrancisco2122 miJamonCaparrosOrtegaFrancisco2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonCaparrosOrtegaFrancisco2122.vender(80, "Espa\u00f1a");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
