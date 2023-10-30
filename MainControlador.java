import java.util.Scanner;
public class MainControlador {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Scanner consola = new Scanner(System.in);
        String menu = "-------Menu-------\n1.Controlar un dispositivo\n2.Ver dispositivo mas caro\nVer dispositivo mas barato ";
        boolean condicion = true;
        int opcion = 0;
        while (condicion) {
            System.out.println(menu);
            System.out.println("Seleccione una opcion: ");
            opcion = consola.nextInt();
            consola.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("------Dispositivos------");
                    System.out.println("1.iPhone X\n2.XPS 13\n3.VivoBook 15\n4.p50 pro\n5.s23 ultra\n6. MacBook Pro 14");
                    System.out.println("Seleccione un dispositivo");
                    int dispositivo = consola.nextInt();
                    consola.nextLine();
                    switch (dispositivo){
                        case 1:
                            System.out.println("1.Encender dispositivo\n2.Apagar dispositivo\n3.Subir volumen\n4.Bajar volumen\n5.Subir brillo\n6.Bajar brillo\n7.Reproducir video\n8.Pausar video\n9.Parar video\n.10.Cambiar video\n11.Mostrar estado\n12.Mostrar informacion");
                            int opcionDispo = consola.nextInt();
                            consola.nextLine();
                            switch (opcionDispo){

                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                    }
                    break;
            }

        }
    }
}
