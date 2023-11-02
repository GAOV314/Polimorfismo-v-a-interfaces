/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * 29/10/23
 * Interface con las funciones de un dispositivo
 */
public interface Dispositivo {
    /**
     * Enciende el dispositivo
     */
    void encender();

    /**
     * Apaga el dispositivo
     */
    public void apagar();

    /**
     * Sube en un porcentaje el volumen
     */
    public void subirVolumen();

    /**
     * Baja en un porcentaje el volumen
     */
    public void bajarVolumen();

    /**
     * Sube en un porcentaje el brillo
     */
    public void subirBrillo();

    /**
     * Baja en un porcentaje el brillo
     */
    public void bajarBrillo();

    /**
     * Muestra el estado del dispositivo, relacionado a las funciones
     */
    public void mostrarEstado();

    /**
     * Muestra las propiedades del dispositivo
     */
    public void mostrarInfo();

    /**
     * Reproduce el video de forma secuencial
     */
    public void reproducirVideo();

    /**
     * Pausa el video
     */
    public void pausarVideo();

    /**
     * Para el video reproduciendose
     */
    public void pararVideo();

    /**
     * Cambia de video de forma secuencial
     */
    public void cambiarVideo();
}


