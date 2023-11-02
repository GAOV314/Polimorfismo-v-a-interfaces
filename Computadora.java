/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * 29/10/23
 * Clase que representa dispositivo tipo computadora
 */
public class Computadora extends EquipoElectronico implements Dispositivo{
    //Atributos
    private String RAM;
    private String sizeDisco;
    private String tipoDisco;
    private String velCpu;
    private String velGpu;

    /**
     * Crea un objeto de tipo computadora
     * @param marca
     * @param modelo
     * @param RAM
     * @param visaCuotas
     * @param precio
     * @param sizeDisco
     * @param tipoDisco
     * @param velCpu
     * @param velGpu
     */
    public Computadora(String marca,String modelo,String RAM,String visaCuotas,int precio,String sizeDisco,String tipoDisco,String velCpu,String velGpu) {
        super(modelo, marca, visaCuotas, precio);
        this.RAM = RAM;
        this.sizeDisco = sizeDisco;
        this.tipoDisco = tipoDisco;
        this.velCpu = velCpu;
        this.velGpu = velGpu;
    }

    //Gets() y Sets()
    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getSizeDisco() {
        return sizeDisco;
    }

    public void setSizeDisco(String sizeDisco) {
        this.sizeDisco = sizeDisco;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public String getVelCpu() {
        return velCpu;
    }

    public void setVelCpu(String velCpu) {
        this.velCpu = velCpu;
    }

    public String getVelGpu() {
        return velGpu;
    }

    public void setVelGpu(String velGpu) {
        this.velGpu = velGpu;
    }


    /**
     * Muestra los atributos del objeto
     * @return
     */
    @Override
    public String toString() {
        return "Computadora{" +
                "RAM=" + RAM +
                ", sizeDisco=" + sizeDisco +
                ", tipoDisco='" + tipoDisco + '\'' +
                ", velCpu=" + velCpu +
                ", velGpu=" + velGpu +
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
     *Enciende una computadora
     */
    @Override
    public void encender() {
        if(estado){
            System.out.println("El ordenador esta ya encendido.");
        }else{
            estado = true;
            System.out.println("El ordenador se ha encendido.");
        }
    }

    /**
     *Apaga una computadora
     */
    @Override
    public void apagar() {
        if(estado){
            System.out.println("El ordenador ya esta apagado.");
        }else{
            estado = false;
            System.out.println("El ordenador se ha apagado.");
        }
    }

    /**
     *Sube el volumen de una computadora en un porcentaje
     */
    @Override
    public void subirVolumen() {
        if(volumen==100){
            System.out.println("Volumen del ordenador actualmente al maximo: "+volumen);
        } else if (volumen<100) {
            volumen = volumen + 10;
            System.out.println("Se ha subido el volumen del ordenador a: "+volumen);
        }
    }

    /**
     *Baja el volumen de una computadora en un porcentaje
     */
    @Override
    public void bajarVolumen() {
        if(volumen == 0){
            System.out.println("Volumen del telefono actualmente al minimo: "+volumen);
        } else if (volumen>0) {
            volumen = volumen-10;
            System.out.println("Se ha bajado el volumen del telefono a: "+volumen);
        }
    }

    /**
     *Subre el brillo de una computadora en un porcentaje
     */
    @Override
    public void subirBrillo() {
        if(brillo==100){
            System.out.println("El brillo del telefono esta actualmente al maximo: "+brillo);
        } else if (brillo<100) {
            brillo=brillo+5;
            System.out.println("Se ha subido el brillo del telefono a: "+brillo);

        }
    }

    /**
     *Baja el brillo de una computadora en un porcentaje
     */
    @Override
    public void bajarBrillo() {
        if(brillo==0){
            System.out.println("EL brillo del telefono esta actualmente al minimo: "+brillo);
        } else if (brillo>0) {
            brillo = brillo - 5;
            System.out.println("Se ha bajado el brillo del telefono a: "+brillo);
        }
    }

    /**
     * Muestra el estado actual de una computdora
     */
    @Override
    public void mostrarEstado() {
        if (estado) {
            System.out.println("El ordenador esta actualmente apagado");
            System.out.println("Para ver mas informacion, encienda el ordenador.");
        } else {
            System.out.println("---------ESTADO---------");
            System.out.println("El telefono esta encendido");
            System.out.println("Volumen: " + volumen);
            System.out.println("Brillo: " + brillo);
            System.out.println("Video reproduciendose: " + videoRepro);
        }
    }

    /**
     *Muestra la informacion de la computadora
     */
    @Override
    public void mostrarInfo() {
        System.out.println("------Mostrar informacion------");
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("visa cuotas"+ visaCuotas);
        System.out.println("precio "+ precio);
        System.out.println("ram: "+ RAM);
        System.out.println("Tamaño disco: "+ sizeDisco);
        System.out.println("Tipo disco: "+tipoDisco);
        System.out.println("Velocidad del CPU: "+velCpu);
        System.out.println("Velocidad del GPU: "+velGpu);
    }

    /**
     *Reproduce un video de la computadora
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
     *Pausa un video de la computadora
     */
    @Override
    public void pausarVideo() {
        System.out.println("Se ha pausado el video");
    }

    /**
     *Cambia el video de una computadora de forma secuencial
     */
    @Override
    public void cambiarVideo() {
        if(videoRepro.equals("Video#1")){
            videoRepro = "Video#2";
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro.equals("Video#2")) {
            videoRepro = "Video#3";
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro.equals("Video#3")) {
            videoRepro = "Video#4";
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro.equals("Video#4")) {
            videoRepro = "Video#5";
            System.out.println("Reproduccion: "+videoRepro);
        } else if (videoRepro.equals("Video#5")) {
            videoRepro = "Video#1";
            System.out.println("Reproduccion: "+videoRepro);
        }
    }
    /**
     *Pausa el video de la computadora
     */
    @Override
    public void pararVideo() {
        estadoReproduccion = false;
        System.out.println("El video se ha parado de reproducir");
    }

    /**
     * Compara el valor del precio de un objeto y otro, y regresa un valor segun el caso
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
