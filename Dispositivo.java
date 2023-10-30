/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * 29/10/23
 * Clase abstracta implementa las interfaces
 */
public abstract class Dispositivo implements DispositivoFunciones,Comparable{
    //Atributos
    protected int precio;
    protected String visaCuotas;
    protected String marca;
    protected String modelo;
    protected int volumen;
    protected int brillo;
    protected boolean estado;
    protected String[] reproduccion;
    protected String videoRepro;
    protected boolean estadoReproduccion;

    //Constructor
    public Dispositivo(int precio, String visaCuotas, String marca, String modelo) {
        this.precio = precio;
        this.visaCuotas = visaCuotas;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Dispositivo(){
        videoRepro = "No hay ningun video reproduciendose";
    }

    //Sets() y gets()
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getVisaCuotas() {
        return visaCuotas;
    }

    public void setVisaCuotas(String visaCuotas) {
        this.visaCuotas = visaCuotas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String[] getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String[] reproduccion) {
        this.reproduccion = reproduccion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Dispositivo{" +
                "precio=" + precio +
                ", visaCuotas=" + visaCuotas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", volumen=" + volumen +
                ", brillo=" + brillo +
                ", estado=" + estado +
                '}';
    }
}
