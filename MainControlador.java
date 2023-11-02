/**
 * @author Gadiel Amir Ocana Veliz
 * Caner: 231270
 * Universidad del Valle de Guatemalas
 * Programacion Orientada a Objetos
 * 29/10/23
 * Clase main maneja la logica y la llamada de metodos del programa
 */
import java.util.Scanner;
public class MainControlador {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        //Carga el archivo csv
        empleado.cargarArchivo();
        Scanner consola = new Scanner(System.in);
        String menu = "-------Menu-------\n1.Controlar un dispositivo\n2.Ver clasificacion del precio\n3.Salir del sistema";
        String menuFunciones = "1.Encender dispositivo\n2.Apagar dispositivo\n3.Aumentar volumen\n4.Disminuir volumen\n5.Aumentar brillo\n6.Disminuir brillo\n7.Reproducir video\n8.Pausar video\n9.Parar video\n10.Cambiar video\n11.Mostrar estado\n12.Mostrar informacion";
        boolean condicion = true;
        try {
            while (condicion) {
                System.out.println(menu);
                System.out.println("Seleccione una opcion: ");
                int opcion = consola.nextInt();
                consola.nextLine();
                //Menu principal
                switch (opcion) {
                    //Controlar dispositivo
                    case 1:
                        System.out.println("1.iphone x\n2.xps 13\n3.VivoBook 15\n4.p50 pro");
                        System.out.println("Ingrese un modelo para controlar (Ingrese tal cual el nombre del dispositivo): ");
                        String modelo = consola.nextLine();
                        //En caso de Iphone X
                        if (modelo.equals("iphone x")) {
                            System.out.println(menuFunciones);
                            System.out.println("Seleccione una opcion: ");
                            int opcionFunciones = consola.nextInt();
                            consola.nextLine();

                            switch (opcionFunciones) {
                                //Encender
                                case 1:
                                    empleado.encender("iPhone X");
                                    break;
                                //Apagar
                                case 2:
                                    empleado.apagar("iPhone X");
                                    break;
                                //Aumentar volumen
                                case 3:
                                    empleado.subirVolumen("iPhone X");
                                    break;
                                //Disminuir volumen
                                case 4:
                                    empleado.bajarVolumen("iPhone X");
                                    break;
                                //Aumentar brillo
                                case 5:
                                    empleado.subirBrillo("iPhone X");
                                    break;
                                //Disminuir brillo
                                case 6:
                                    empleado.bajarBrillo("iPhone X");
                                    break;
                                //Reproducir video
                                case 7:
                                    empleado.reproducirVideo("iPhone X");
                                    break;
                                //Pausar video
                                case 8:
                                    empleado.pausarVideo("iPhone X");
                                    break;
                                //Parar video
                                case 9:
                                    empleado.pararVideo("iPhone X");
                                    break;
                                //Cambiar video
                                case 10:
                                    empleado.cambiarVideo("iPhone X");
                                    break;
                                //Mostrar estado
                                case 11:
                                    empleado.mostrarEstado("iPhone X");
                                    break;
                                //Mostrar info
                                case 12:
                                    empleado.mostrarInfo("iPhone X");
                                    break;
                            }
                            //En caso de xps 13
                        } else if (modelo.equals("xps 13")) {
                            System.out.println(menuFunciones);
                            System.out.println("Ingrese una opcion: ");
                            int opcionFunciones = consola.nextInt();
                            consola.nextLine();
                            switch (opcionFunciones) {
                                //Encender
                                case 1:
                                    empleado.encender("XPS 13");
                                    break;
                                //Apagar
                                case 2:
                                    empleado.apagar("XPS 13");
                                    break;
                                //Aumentar volumen
                                case 3:
                                    empleado.subirVolumen("XPS 13");
                                    break;
                                //Disminuir volumen
                                case 4:
                                    empleado.bajarVolumen("XPS 13");
                                    break;
                                //Aumentar brillo
                                case 5:
                                    empleado.subirBrillo("XPS 13");
                                    break;
                                //Disminuir brillo
                                case 6:
                                    empleado.bajarBrillo("XPS 13");
                                    break;
                                //Reproducir video
                                case 7:
                                    empleado.reproducirVideo("XPS 13");
                                    break;
                                //Pausar video
                                case 8:
                                    empleado.pausarVideo("XPS 13");
                                    break;
                                //Parar video
                                case 9:
                                    empleado.pararVideo("XPS 13");
                                    break;
                                //Cambiar video
                                case 10:
                                    empleado.cambiarVideo("XPS 13");
                                    break;
                                //Mostrar estado
                                case 11:
                                    empleado.mostrarEstado("XPS 13");
                                    break;
                                //Mostrar info
                                case 12:
                                    empleado.mostrarInfo("XPS 13");
                                    break;
                            }
                            //En caso de VivoBook 15
                        } else if (modelo.equals("VivoBook 15")) {
                            System.out.println(menuFunciones);
                            System.out.println("Ingrese una opcion: ");
                            int opcionFunciones = consola.nextInt();
                            consola.nextLine();
                            switch (opcionFunciones) {
                                //Encender
                                case 1:
                                    empleado.encender("VivoBook 15");
                                    break;
                                //Apagar
                                case 2:
                                    empleado.apagar("VivoBook 15");
                                    break;
                                //Aumentar volumen
                                case 3:
                                    empleado.subirVolumen("VivoBook 15");
                                    break;
                                //Disminuir volumen
                                case 4:
                                    empleado.bajarVolumen("VivoBook 15");
                                    break;
                                //Aumentar brillo
                                case 5:
                                    empleado.subirBrillo("VivoBook 15");
                                    break;
                                //Disminuir brillo
                                case 6:
                                    empleado.bajarBrillo("VivoBook 15");
                                    break;
                                //Reproducir video
                                case 7:
                                    empleado.reproducirVideo("VivoBook 15");
                                    break;
                                //Pausar video
                                case 8:
                                    empleado.pausarVideo("VivoBook 15");
                                    break;
                                //Parar video
                                case 9:
                                    empleado.pararVideo("VivoBook 15");
                                    break;
                                //Cambiar video
                                case 10:
                                    empleado.cambiarVideo("VivoBook 15");
                                    break;
                                //Mostrar estado
                                case 11:
                                    empleado.mostrarEstado("VivoBook 15");
                                    break;
                                //Mostrar info
                                case 12:
                                    empleado.mostrarInfo("VivoBook 15");
                                    break;
                            }
                            //En caso de p50 pro
                        } else if (modelo.equals("p50 pro")) {
                            System.out.println(menuFunciones);
                            System.out.println("Ingrese una opcion: ");
                            int opcionFunciones = consola.nextInt();
                            consola.nextLine();
                            switch (opcionFunciones) {
                                //Encender
                                case 1:
                                    empleado.encender("p50 pro");
                                    break;
                                //Apagar
                                case 2:
                                    empleado.apagar("p50 pro");
                                    break;
                                //Aumentar volumen
                                case 3:
                                    empleado.subirVolumen("p50 pro");
                                    break;
                                //Disminuir volumen
                                case 4:
                                    empleado.bajarVolumen("p50 pro");
                                    break;
                                //Aumentar brillo
                                case 5:
                                    empleado.subirBrillo("p50 pro");
                                    break;
                                //Disminuir brillo
                                case 6:
                                    empleado.bajarBrillo("p50 pro");
                                    break;
                                //Reproducir video
                                case 7:
                                    empleado.reproducirVideo("p50 pro");
                                    break;
                                //Pausar video
                                case 8:
                                    empleado.pausarVideo("p50 pro");
                                    break;
                                //Parar video
                                case 9:
                                    empleado.pararVideo("p50 pro");
                                    break;
                                //Cambiar video
                                case 10:
                                    empleado.cambiarVideo("p50 pro");
                                    break;
                                //Mostrar estado
                                case 11:
                                    empleado.mostrarEstado("p50 pro");
                                    break;
                                //Mostrar info
                                case 12:
                                    empleado.mostrarInfo("p50 pro");
                                    break;
                            }
                        }
                        break;
                    //Mostrar clasificacion del precio mas caro y el mas barato
                    case 2:
                        empleado.clasificacionPrecio();
                        break;
                    //SALIR DEL PROGRAMA
                    case 3:
                        condicion = false;
                        System.out.println(" - Saliendo del sistema...");
                        break;

                }
            }
        } catch (Exception e) {
            consola.nextLine();
            System.out.println("Ingrese una opcion valida: " + e.getMessage());


        }
    }
}


