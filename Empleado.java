/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * 29/10/23
 * Clase maneja las funcoines relacionadas a dispositivo y la lista polimorfica
 */
;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Empleado{
    //Atributos
    List<EquipoElectronico> dispositivos= new ArrayList<>();

    /**
     * Costructor vacio para acceder a los metodos de Empleado
     */
    public Empleado(){
    }

    /**
     *Llama el metodo para encender un dispositivo
     * @param modelo
     */
    public void encender(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.encender();
            }
        }
    }

    /**
     *Llama el metodo para apagar un dispositvo
     * @param modelo
     */
    public void apagar(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.apagar();
            }
        }
    }

    /**
     *Llama el metodo para subir el volumen de un dispositivo en un porcentaje
     * @param modelo
     */
    public void subirVolumen(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.subirVolumen();
            }
        }
    }

    /**
     *Llama el metodo para bajar el volumen de un dispositivo en un porcentaje
     * @param modelo
     */
    public void bajarVolumen(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.bajarVolumen();
            }
        }
    }

    /**
     *Llama el metodo para subir el brillo de un dispositivo en un porcentaje
     * @param modelo
     */
    public void subirBrillo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.subirBrillo();
            }
        }
    }

    /**
     *Llama el metodo para bajar el brillo de un dispositivo en un porcentaje
     * @param modelo
     */
    public void bajarBrillo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.bajarBrillo();

            }
        }
    }

    /**
     *Llama el metodo para mostrar el estado actual del dispositivo
     * @param modelo
     */
    public void mostrarEstado(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.mostrarEstado();
            }
        }
    }

    /**
     *Llama el metodo para mostrar la informacion del dispositivo
     * @param modelo
     */
    public void mostrarInfo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.mostrarInfo();
            }
        }
    }

    /**
     *Llama el metodo para reproducir un video del dispositivo
     * @param modelo
     */
    public void reproducirVideo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.reproducirVideo();
            }
        }
    }

    /**
     *Llama el metodo para pausar el video de un dispositivo
     * @param modelo
     */
    public void pausarVideo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.pausarVideo();
            }
        }
    }

    /**
     *Llama el metodo para pausar un video del dispositivo
     * @param modelo
     */
    public void pararVideo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.pararVideo();
            }
        }
    }

    /**
     *Llama el metodo para cambiar el video que se esta reproduciendo de manera secuencial de un dispositivo
     * @param modelo
     */
    public void cambiarVideo(String modelo){
        for(EquipoElectronico d : dispositivos){
            if(modelo.equals(d.getModelo())){
                d.cambiarVideo();
            }
        }
    }
    /**
     * Carga un archivo de tipo csv al array de dispositivos
     */
         public void cargarArchivo() {
             //Pegar aca la direccion del csv si su dispositivo no es mac.
             String archivo = "/Users/GadielOcana/IdeaProjects/Stand/src/dispositivo.csv";
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo))){
                String line;

                while((line = bufferedReader.readLine())!=null){
                    try{
                        if(!line.trim().isEmpty()){
                            String[] fields = line.split(",");
                            String marca = fields[0];
                            String modelo = fields[1];
                            String ram = fields[2];
                            String visaCuotas=fields[3];
                            int precio = Integer.parseInt(fields[4]);
                            String atributo1 = fields[5];
                            String atributo2 = fields[6];
                            String atributo3 = fields[7];
                            String atributo4 = fields[8];
                            String atributo5 = fields[9];
                            if (atributo5.equals("x")){

                                EquipoElectronico nuevoDispo = new Computadora(marca,modelo,ram,visaCuotas,precio,atributo1,atributo2,atributo3,atributo4);
                                dispositivos.add(nuevoDispo);
                            }else{

                                EquipoElectronico nuevoDispo = new Telefono(marca,modelo,ram,visaCuotas,precio,atributo1,atributo2,atributo3,atributo4,atributo5);
                                dispositivos.add(nuevoDispo);
                            }



                        }
                    }catch (Exception e){
                        System.out.println(" - Verifique el formato de la siguiente linea: "+line);
                    }

                }

            }catch (IOException e){
                System.out.println("Revise el nombre del archivo");
            }
        }

    /**
     * Muestra el dispositivo con mayor precio y menor precio, haciendo uso del metodo CompareTo() y sort()
     */
    public void clasificacionPrecio(){
             Collections.sort(dispositivos);
            System.out.println("El dispositivo con mayor precio es: "+dispositivos.get(3).getPrecio());
            System.out.println("El dispositivo con menor precio es: "+dispositivos.get(0).getPrecio());
        }
}
