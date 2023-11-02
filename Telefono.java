/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * 29/10/23
 * Clase que representa dispositivo tipo telefono
 */
public class Telefono extends EquipoElectronico implements Dispositivo{
    //Atributos
    private String ram;
    private String procesador;
    private String almInterno;
    private String extensionMemoria;
    private String incluyeCubo;
    private String cincoG;

    /**
     *Crea un objeto de tipo Telefono
     * @param modelo
     * @param marca
     * @param visaCuotas
     * @param precio
     * @param ram
     * @param procesador
     * @param almInterno
     * @param extensionMemoria
     * @param incluyeCubo
     * @param cincoG
     */
    public Telefono(String marca,String modelo,String ram,String visaCuotas,int precio,String procesador,String almInterno,String extensionMemoria,String incluyeCubo,String cincoG) {
        super(modelo, marca, visaCuotas, precio);
        this.ram = ram;
        this.procesador = procesador;
        this.almInterno = almInterno;
        this.extensionMemoria = extensionMemoria;
        this.incluyeCubo = incluyeCubo;
        this.cincoG = cincoG;
    }


    //Gets() y Sets()
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getAlmInterno() {
        return almInterno;
    }

    public void setAlmInterno(String almInterno) {
        this.almInterno = almInterno;
    }

    public String getExtensionMemoria() {
        return extensionMemoria;
    }

    public void setExtensionMemoria(String extensionMemoria) {
        this.extensionMemoria = extensionMemoria;
    }

    public String getIncluyeCubo() {
        return incluyeCubo;
    }

    public void setIncluyeCubo(String incluyeCubo) {
        this.incluyeCubo = incluyeCubo;
    }

    public String getCincoG() {
        return cincoG;
    }

    public void setCincoG(String cincoG) {
        this.cincoG = cincoG;
    }

    /**
     * Muestra los atributos del objeto
     * @return
     */
    @Override
    public String toString() {
        return "Telefono{" +
                "ram=" + ram +
                ", procesador='" + procesador + '\'' +
                ", almInterno=" + almInterno +
                ", extensionMemoria='" + extensionMemoria + '\'' +
                ", incluyeCubo='" + incluyeCubo + '\'' +
                ", cincoG='" + cincoG + '\'' +
                ", precio=" + precio +
                ", visaCuotas=" + visaCuotas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", volumen=" + volumen +
                ", brillo=" + brillo +
                ", estado=" + estado +
                '}';
    }

    /**
     * Enciende un telefono
     */
    @Override
    public void encender() {
        if(estado){
            System.out.println("El telefono esta ya encendido.");
        }else{
            estado = true;
            System.out.println("El telefono se ha encendido.");
        }
    }

    /**
     * Apaga un telefono
     */
    @Override
    public void apagar() {
        if(estado){
            estado = false;
            System.out.println("El telefono se ha apagado.");
        }else{
            System.out.println("El telefono ya esta apagado.");
        }
    }

    /**
     * Sube el volumen del telefono en un porcentaje
     */
    @Override
    public void subirVolumen() {
        if(volumen==100){
            System.out.println("Volumen del telefono actualmente al maximo: "+volumen);
        } else if (volumen<100) {
            volumen = volumen + 2;
            System.out.println("Se ha subido el volumen del telefono a: "+volumen);
        }
    }

    /**
     * Baja el volumen del telefono en un porcentaje
     */
    @Override
    public void bajarVolumen() {
        if(volumen == 0){
            System.out.println("Volumen del telefono actualmente al minimo: "+volumen);
        } else if (volumen>0) {
            volumen = volumen-2;
            System.out.println("Se ha bajado el volumen del telefono a: "+volumen);
        }
    }

    /**
     * Sube el brillo de un telefono en un porcentaje
     */
    @Override
    public void subirBrillo() {
        if(brillo==100){
            System.out.println("El brillo del telefono esta actualmente al maximo: "+brillo);
        } else if (brillo<100) {
            brillo=brillo+3;
            System.out.println("Se ha subido el brillo del telefono a: "+brillo);

        }
    }

    /**
     * Baja el brillo de un telefono en un porcentaje
     */
    @Override
    public void bajarBrillo() {
        if(brillo==0){
            System.out.println("EL brillo del telefono esta actualmente al minimo: "+brillo);
        } else if (brillo>0) {
            brillo = brillo - 3;
            System.out.println("Se ha bajado el brillo del telefono a: "+brillo);
        }
    }

    /**
     * Muestra el estado actual del telefono
     */
    @Override
    public void mostrarEstado() {
        if(estado){
            System.out.println("---------ESTADO---------");
            System.out.println("El telefono esta encendido");
            System.out.println("Volumen: "+volumen);
            System.out.println("Brillo: "+brillo);
            System.out.println("Video reproduciendose: "+ videoRepro);

        }else{
            System.out.println("El telefono esta actualmente apagado ");
            System.out.println("Para ver mas informacion, encienda el telefono.");

        }
    }

    /**
     * Muestra la informacion del telefono
     */
    @Override
    public void mostrarInfo() {
        System.out.println("------Mostrar informacion------");
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("visa cuotas"+ visaCuotas);
        System.out.println("precio "+ precio);
        System.out.println("ram: "+ ram);
        System.out.println("procesador: "+procesador);
        System.out.println("almacenamiento interno: "+almInterno);
        System.out.println("Permite extension de memoria: "+extensionMemoria);
        System.out.println("Incluye cubo para cargar: "+incluyeCubo);
        System.out.println("Incluye 5G: "+cincoG);
    }

    /**
     * Reproduce un video del telefono
     */
    @Override
    public void reproducirVideo() {
        if(estadoReproduccion){
            System.out.println("El video ya se esta reproduciendo");
        }
        estadoReproduccion = true;
        videoRepro = "Video#1";
        System.out.println("Reproduciendo: "+videoRepro);
    }

    /**
     * Pausa el video que se este reproduciendo del telefono
     */
    @Override
    public void pausarVideo() {
        System.out.println("Se ha pausado el video");
    }

    /**
     * Para el video que se este reproduciendo del telefono
     */
    @Override
    public void pararVideo() {
        estadoReproduccion = false;
        System.out.println("El video se ha parado de reproducir");
    }

    /**
     * Cambia el video que se este reproduciendo del telefono de forma secuencial
     */
    @Override
    public void cambiarVideo() {
        if (videoRepro.equals("Video#1")) {
            videoRepro = "Video#2";
            System.out.println("Reproduciendo: " + videoRepro);
        } else if (videoRepro.equals("Video#2")) {
            videoRepro = "Video#3";
            System.out.println("Reproduciendo: " + videoRepro);
        } else if (videoRepro.equals("Video#3")) {
            videoRepro = "Video#1";
            System.out.println("Reproduciendo: " + videoRepro);
        }

    }

    /**
     * Compara el valor del precio de un dispositivo y otro
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(EquipoElectronico o) {
        if(this.getPrecio()>o.getPrecio()){
            return 1;
        }else if(this.getPrecio() <o.getPrecio()){
            return -1;
        }else{
            return 0;
        }
    }
}
