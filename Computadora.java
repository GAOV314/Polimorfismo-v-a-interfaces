public class Computadora extends Dispositivo{
    //Atributos
    private String RAM;
    private String sizeDisco;
    private String tipoDisco;
    private String velCpu;
    private String velGpu;

    //Constructor
    public Computadora(int precio, String visaCuotas, String marca, String modelo, String RAM, String sizeDisco, String tipoDisco, String velCpu, String velGpu) {
        super(precio, visaCuotas, marca, modelo);
        this.RAM = RAM;
        this.sizeDisco = sizeDisco;
        this.tipoDisco = tipoDisco;
        this.velCpu = velCpu;
        this.velGpu = velGpu;
    }

    public Computadora(){
        reproduccion = new String[4];
        reproduccion[0] = "Video#1";
        reproduccion[1] = "Video#2";
        reproduccion[2] = "Video#3";
        reproduccion[3] = "Video#4";
        reproduccion[4] = "Video#5";
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

    //Metodo toString
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

    @Override
    public void encender() {
        if(estado == true){
            System.out.println("El ordenador esta ya encendido.");
        }else{
            estado = true;
            System.out.println("El ordenador se ha encendido.");
        }
    }

    @Override
    public void apagar() {
        if(estado == false){
            System.out.println("El ordenador ya esta apagado.");
        }else{
            estado = false;
            System.out.println("El ordenador se ha apagado.");
        }
    }

    @Override
    public void subirVolumen() {
        if(volumen==100){
            System.out.println("Volumen del ordenador actualmente al maximo: "+volumen);
        } else if (volumen<100) {
            volumen = volumen + 10;
            System.out.println("Se ha subido el volumen del ordenador a: "+volumen);
        }
    }

    @Override
    public void bajarVolumen() {
        if(volumen == 0){
            System.out.println("Volumen del telefono actualmente al minimo: "+volumen);
        } else if (volumen>0) {
            volumen = volumen-10;
            System.out.println("Se ha bajado el volumen del telefono a: "+volumen);
        }
    }

    @Override
    public void subirBrillo() {
        if(brillo==0){
            System.out.println("El brillo del telefono esta actualmente al maximo: "+brillo);
        } else if (brillo<100) {
            brillo=brillo+5;
            System.out.println("Se ha subido el brillo del telefono a: "+brillo);

        }
    }

    @Override
    public void bajarBrillo() {
        if(brillo==100){
            System.out.println("EL brillo del telefono esta actualmente al minimo: "+brillo);
        } else if (brillo>0) {
            brillo = brillo - 5;
            System.out.println("Se ha bajado el brillo del telefono a: "+brillo);
        }
    }

    @Override
    public void mostrarEstado() {
        if (estado == false) {
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
    public void cambiarVideo() {
        if(videoRepro == reproduccion[0]){
            videoRepro = reproduccion[1];
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro == reproduccion[1]) {
            videoRepro = reproduccion[2];
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro == reproduccion[2]) {
            videoRepro = reproduccion[3];
            System.out.println("Reproduciendo: "+videoRepro);
        } else if (videoRepro == reproduccion[3]) {
            videoRepro = reproduccion[4];
            System.out.println("Reproduccion: "+videoRepro);
        } else if (videoRepro == reproduccion[4]) {
            videoRepro = reproduccion[0];
            System.out.println("Reproduccion: "+videoRepro);
        }
    }
    @Override
    public void pararVideo() {
        estadoReproduccion = false;
        System.out.println("El video se ha parado de reproducir");
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
