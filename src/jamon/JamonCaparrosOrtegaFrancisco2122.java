/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 *
 * @author Francisco Caparrós Ortega
 */
public class JamonCaparrosOrtegaFrancisco2122 {

    /**
     * @return Recoge la categoría del Jamón
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria Establece la categoría
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return Recoge el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio Establece el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Recoge los meses de curación
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * @param mesesCuracion Establece los meses de curación
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * @return Recoge el stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock Establece el stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /* Constructor sin argumentos */
    public JamonCaparrosOrtegaFrancisco2122 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // jamon
    
    public JamonCaparrosOrtegaFrancisco2122 (String cat, double precio, int stock)
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar la categoría del jamón
    public void asignarCategoria(String cat)
    {
        setCategoria(cat);
    }
    // Método que me devuelve la categoría del jamón
    public String obtenerCategoria()
    {
        return getCategoria();
    }

    // Método que me devuelve el stock de jamones disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }
/**
 * Aquí salta el mensaje de que no se puede introducir un número negativo
 * @param cantidad donde se introduce el nº de jamones a comprar
 * @throws Exception 
 */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }

/**
 * Aquí salta el mensaje de que no se pueden vender jamones, bien por cantidad negativa 
 * o por que no queden unidades por vender
 * @param cantidad donde se introduce el nº de jamones a vender
 * @param paisCaparrosOrtegaFrancisco2122 aquí indica de que país es el Jamón
 * @throws Exception 
 */
    public void vender (int cantidad, String paisCaparrosOrtegaFrancisco2122) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad);
    }
}
