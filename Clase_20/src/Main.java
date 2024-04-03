import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroMes;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" Ingrese un numero del mes ( del 1 al 12)  que quiere desplegar en pantalla :  ");
            while (!scanner.hasNextInt()) {
                System.out.println(" error no es un numero ");
                System.out.print(" Ingrese un numero del mes (del 1 al 12)  que quiere desplegar en pantalla :  ");
                scanner.next();
            }
            numeroMes = scanner.nextInt();
            if (numeroMes < 1 || numeroMes > 12) {
                System.out.println(" El numero ingresado no esta en el rango solicitado (del 1 al 12) ");
            }

        } while (numeroMes < 1 || numeroMes > 12);

        switch (numeroMes) {
            case 1:
                System.out.println("Enero");
                evaluarEstacion(numeroMes);
                break;
            case 2:
                System.out.println("Febrero");
                evaluarEstacion(numeroMes);
                break;
            case 3:
                System.out.println("Marzo");
                evaluarEstacion(numeroMes);
                break;
            case 4:
                System.out.println("Abril");
                evaluarEstacion(numeroMes);
                break;
            case 5:
                System.out.println("Mayo");
                evaluarEstacion(numeroMes);
                break;
            case 6:
                System.out.println("Junio");
                evaluarEstacion(numeroMes);
                break;
            case 7:
                System.out.println("Julio");
                evaluarEstacion(numeroMes);
                break;
            case 8:
                System.out.println("Agosto");
                evaluarEstacion(numeroMes);
                break;
            case 9:
                System.out.println("Septiembre");
                evaluarEstacion(numeroMes);
                break;
            case 10:
                System.out.println("Octubre");
                evaluarEstacion(numeroMes);
                break;
            case 11:
                System.out.println("Noviembre");
                evaluarEstacion(numeroMes);
                break;
            default:
                System.out.println("Diciembre");
                evaluarEstacion(numeroMes);
                break;

        }
    }

    private static void evaluarEstacion(int numeroMes) {

        if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11) {
            System.out.println("La estacion del año es Primavera ");

        } else if (numeroMes == 12 || numeroMes == 1 || numeroMes == 2) {
            System.out.println("La estacion del año es Verano ");
        } else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5) {
            System.out.println("La estacion del año es Otoño ");
        } else {
            System.out.println("La estacion del año es Invierno ");
        }

    }
}