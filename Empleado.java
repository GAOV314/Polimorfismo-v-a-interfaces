import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class Empleado{
    //Atributos
    ArrayList<Dispositivo> dispositivos;

    /**
     * Costructor vacio para instanciar lista
     */
    public Empleado(){
    ArrayList<Dispositivo> dispositivos= new ArrayList<>();

}
    public void encender(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.encender();
            }
        }
    }
    public void apagar(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.apagar();
            }
        }
    }
    public void subirVolumen(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.subirVolumen();
            }
        }
    }

    public void bajarVolumen(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.bajarVolumen();
            }
        }
    }

    public void subirBrillo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.subirBrillo();
            }
        }
    }
    public void bajarBrillo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.bajarBrillo();

            }
        }
    }

    public void mostrarEstado(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.mostrarEstado();
            }
        }
    }

    public void mostrarInfo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.mostrarInfo();
            }
        }
    }

    public void reproducirVideo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.reproducirVideo();
            }
        }
    }

    public void pausarVideo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.pausarVideo();
            }
        }
    }

    public void pararVideo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.pararVideo();
            }
        }
    }

    public void cambiarVideo(String modelo){
        for(Dispositivo d : dispositivos){
            if(modelo == d.getModelo()){
                d.cambiarVideo();
            }
        }
    }

    public void cargarArchivo(){
        String archivo = "Dispositivos.csv";
        try(Scanner scanner = new Scanner(new File(archivo),"UTF-8")){
            while (scanner.hasNextLine()){
                String[] campos = scanner.nextLine().split(",");
                String marca = campos [0];
                String modelo = campos [1];
                String memoriaRam = campos [2];
                String visaCuotas = campos [3];
                int precio = Integer.parseInt(campos [4]);
                String atributo1 = campos [5];
                String atributo2 = campos [6];
                String atributo3 = campos [7];
                String atributo4 = campos [8];
                String atributo5 = campos [9];

                if(atributo5.equals ("×")){
                    Dispositivo dispositivoNuevo = new Computadora(precio,visaCuotas,marca,modelo,memoriaRam, atributo1, atributo2, atributo3, atributo4);
                    dispositivos.add(dispositivoNuevo);
                }else{
                    Dispositivo dispositivoNuevo = new Telefono(precio,visaCuotas,marca,modelo,memoriaRam, atributo1, atributo2, atributo3, atributo4, atributo5);
                    dispositivos.add(dispositivoNuevo);
                }

            }
            System.out.println("Se ha cargado efectivamente el archivo CSV");

        }catch(FileNotFoundException e){
            System.out.println("In[Sistema]: No se pudo guardar el catálogo: " + e.getMessage());
        }
    }



}
