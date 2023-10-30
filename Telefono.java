public class Telefono extends Dispositivo{
    //Atributos
    private String ram;
    private String procesador;
    private String almInterno;
    private String extensionMemoria;
    private String incluyeCubo;
    private String cincoG;

    //Constructor
    public Telefono(int precio, String visaCuotas, String marca, String modelo, String ram, String procesador, String almInterno, String extensionMemoria, String incluyeCubo, String cincoG) {
        super(precio, visaCuotas, marca, modelo);
        this.ram = ram;
        this.procesador = procesador;
        this.almInterno = almInterno;
        this.extensionMemoria = extensionMemoria;
        this.incluyeCubo = incluyeCubo;
        this.cincoG = cincoG;
    }
    public Telefono(){
        reproduccion = new String[2];
        reproduccion[0] = "Video#1";
        reproduccion[1] = "Video#2";
        reproduccion[2] = "Video#3";
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

    //Metodo toString
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

    @Override
    public void encender() {
        if(estado == true){
            System.out.println("El telefono esta ya encendido.");
        }else{
            estado = true;
            System.out.println("El telefono se ha encendido.");
        }
    }

    @Override
    public void apagar() {
        if(estado == false){
            System.out.println("El telefono ya esta apagado.");
        }else{
            estado = false;
            System.out.println("El telefono se ha apagado.");
        }
    }

    @Override
    public void subirVolumen() {
        if(volumen==100){
            System.out.println("Volumen del telefono actualmente al maximo: "+volumen);
        } else if (volumen<100) {
            volumen = volumen + 2;
            System.out.println("Se ha subido el volumen del telefono a: "+volumen);
        }
    }

    @Override
    public void bajarVolumen() {
        if(volumen == 0){
            System.out.println("Volumen del telefono actualmente al minimo: "+volumen);
        } else if (volumen>0) {
            volumen = volumen-2;
            System.out.println("Se ha bajado el volumen del telefono a: "+volumen);
        }
    }

    @Override
    public void subirBrillo() {
        if(brillo==0){
            System.out.println("El brillo del telefono esta actualmente al maximo: "+brillo);
        } else if (brillo<100) {
            brillo=brillo+3;
            System.out.println("Se ha subido el brillo del telefono a: "+brillo);

        }
    }

    @Override
    public void bajarBrillo() {
        if(brillo==100){
            System.out.println("EL brillo del telefono esta actualmente al minimo: "+brillo);
        } else if (brillo>0) {
            brillo = brillo - 3;
            System.out.println("Se ha bajado el brillo del telefono a: "+brillo);
        }
    }

    @Override
    public void mostrarEstado() {
        if(estado == false){
            System.out.println("El telefono esta actualmente apagado ");
            System.out.println("Para ver mas informacion, encienda el telefono.");
        }else{
            System.out.println("---------ESTADO---------");
            System.out.println("El telefono esta encendido");
            System.out.println("Volumen: "+volumen);
            System.out.println("Brillo: "+brillo);
            System.out.println("Video reproduciendose: "+ videoRepro);

        }
    }

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

    @Override
    public void reproducirVideo() {
        if(estadoReproduccion == true){
            System.out.println("El video ya se esta reproduciendo");
        }
        estadoReproduccion = true;
        videoRepro = reproduccion[0];
        System.out.println("Reproduciendo: "+videoRepro);
    }

    @Override
    public void pausarVideo() {
        System.out.println("Se ha pausado el video");
    }

    @Override
    public void pararVideo() {
        estadoReproduccion = false;
        System.out.println("El video se ha parado de reproducir");
    }

    @Override
    public void cambiarVideo() {
        if(videoRepro == reproduccion[0]){
            videoRepro = reproduccion[1];
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro == reproduccion[1]) {
            videoRepro = reproduccion[2];
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro == reproduccion[2]) {
            videoRepro = reproduccion[0];
            System.out.println("Reproduciendo: "+videoRepro);
        }
    }


    @Override
    public int compareTo(Object o) {
        if (this.precio>((Dispositivo)o).getPrecio())
            return 1;
        if (this.precio<((Dispositivo)o).getPrecio())
            return -1;
        return 0;
    }
}
