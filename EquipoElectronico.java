/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * 29/10/23
 * Clase padre de Computadora, Telefono. Implementa la interfaz comparable y la hereda a Computadora y Telefono.
 * Cumple asociacion con Empleado
 */
public abstract class EquipoElectronico implements Comparable<EquipoElectronico>{
    protected String modelo;
    protected String marca;
    protected String visaCuotas;
    protected int precio;
    protected boolean estado;
    protected int volumen;
    protected int brillo;
    protected String videoRepro;
    protected boolean estadoReproduccion;

    /**
     * Crea un objeto de tipo EquipoElectronico
     * @param modelo
     * @param marca
     * @param visaCuotas
     * @param precio
     */
    public EquipoElectronico(String modelo, String marca, String visaCuotas, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.visaCuotas = visaCuotas;
        this.precio = precio;
    }
    //Gets() y sets()
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVisaCuotas() {
        return visaCuotas;
    }

    public void setVisaCuotas(String visaCuotas) {
        this.visaCuotas = visaCuotas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public String getVideoRepro() {
        return videoRepro;
    }

    public void setVideoRepro(String videoRepro) {
        this.videoRepro = videoRepro;
    }

    public boolean isEstadoReproduccion() {
        return estadoReproduccion;
    }

    public void setEstadoReproduccion(boolean estadoReproduccion) {
        this.estadoReproduccion = estadoReproduccion;
    }

    /**
     * Muetra la informacio del dispositivo
     */
    public void mostrarInfo() {
    }

    /**
     * Muestra el estado del dispositivo
     */
    public void mostrarEstado() {
    }

    /**
     * Reproduce un video publicitario
     */
    public void reproducirVideo() {
    }

    /**
     * Pausa el video que se esta reproduciendo actualmente
     */
    public void pausarVideo() {
    }

    /**
     * Se cambia el video de forma secuencial
     */
    public void cambiarVideo() {
    }

    /**
     * Para el video que se esta actualmente reproduciendo
     */
    public void pararVideo() {
    }

    /**
     * Se baja el brillo en un porcentaje
     */
    public void bajarBrillo() {
    }

    /**
     * Se sube el brillo en un porcentaje
     */
    public void subirBrillo() {
    }

    /**
     * Se baja el volumen en un porcentaje
     */
    public void bajarVolumen() {
    }

    /**
     * Se sube el volumen en un porcentaje
     */
    public void subirVolumen() {
    }

    /**
     * Se apaga el dispositivo
     */
    public void apagar() {
    }

    /**
     * Se enciende el dispositivo
     */
    public void encender() {
    }
}
