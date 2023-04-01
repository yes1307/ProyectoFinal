package herencia.pasteleria;

import java.util.Scanner;

public class PruebaDeSabor{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("******BIENVENIDO A NUSTRO MENU PASTELERO******");
        mostrarOpciones();
        System.out.println("Ingrese opcion deseada: ");
        int opcion = scanner.nextInt();
        ejecutarOpcion(opcion);
        scanner.close();
    }
    static void mostrarOpciones() {
        System.out.println("1: Pastel Basico");
        System.out.println("2: Pastel Cumpleaños");
        System.out.println("3: Pastel Bodas");
        System.out.println("4: Salir del programa");
    }
    static void ejecutarOpcion(int opcion) {
        Pastel pastel = new Pastel();
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("*******Pastel Basico*******");
                pastel.setPrecio(400);
                System.out.println("Sabor de Pastel Basico: " + pastel.getSabor());
                System.out.println("Costo del Pastel " + "$" + pastel.getPrecio());

                System.out.println("*************Te gusto la opción*************");
                System.out.println("Ingresa tu opcion si deseas consultar otro pastel: ");
                opcion = scanner.nextInt();
                ejecutarOpcion(opcion);

                break;
            case 2:
                System.out.println("*******Pastel Cumpleaños*******");
                PastelFiestaCumple pastelFiestaCumple = new PastelFiestaCumple();
                pastelFiestaCumple.setVelas(6);
                pastelFiestaCumple.setPrecio(655.5);
                System.out.println("Sabor de Pastel de Cumpleaños: " + pastelFiestaCumple.getSabor());
                System.out.println("Cantidad de velas en el Pastel: " + pastelFiestaCumple.getVelas());
                System.out.println("Costo de Pastel de Cumpleaños " + "$" + pastelFiestaCumple.getPrecio());

                System.out.println("*************Te gusto la opción*************");
                System.out.println("Ingresa tu opcion si deseas consultar otro pastel: ");
                opcion = scanner.nextInt();
                ejecutarOpcion(opcion);
                break;
            case 3:
                System.out.println("*******Pastel Bodas*******");
                PastelBoda pastelBoda = new PastelBoda();
                pastelBoda.setPrecio(1500.5);
                pastelBoda.setNiveles(4);
                System.out.println("Sabor de Pastel de Bodas: " + pastelBoda.getSabor());
                System.out.println("Niveles que componen al Pastel de Bodas: " + pastelBoda.getNiveles());
                System.out.println("Costo de Pastel de Bodas " + "$" + pastelBoda.getPrecio());

                System.out.println("*************Te gusto la opción*************");
                System.out.println("Ingresa tu opcion si deseas consultar otro pastel: ");
                opcion = scanner.nextInt();
                ejecutarOpcion(opcion);
                break;
            case 4:
                System.out.println("Salir del programa");
                break;
            default:
                System.out.println("Opcion no valida");
                System.out.println("Por favor ingresa una opcion del menu disponible, de lo contrario ingresa (4), para salir...");
                opcion = scanner.nextInt();
                ejecutarOpcion(opcion);
        }
    }

}
