import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int primerOperando;
        int segundoOperando;
        boolean continuar;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*************************************************************************************");
            System.out.println("*******************************  CALCULADORA  ***************************************");
            System.out.println("****Instrucciones : ingresar 2 numeros enteros y elegir la  operacion matematica ****");
            System.out.println("*************************************************************************************");
            primerOperando = ingresoOperando(scanner, 1);
            segundoOperando = ingresoOperando(scanner, 2);
            continuar = elegirOperacionMatematica(primerOperando, segundoOperando, scanner);
        } while (continuar);

    }

    /**
     * @param scanner
     * @param numeroOperando
     * @return
     */
    private static int ingresoOperando(Scanner scanner, int numeroOperando) {
        int num;
        do {
            System.out.print("Introduce el  operando numero " + numeroOperando + " : ");
            while (!scanner.hasNextInt()) {
                System.out.println("No es un numero entero ");
                scanner.next();
                System.out.print("Introduce el operando numero " + numeroOperando + " : ");
            }
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("El número debe ser positivo");
            }
        } while (num <= 0);
        return num;
    }


    /**
     * @param operadorUno
     * @param operadorDos
     * @param scanner
     * @return
     */
    public static boolean elegirOperacionMatematica(int operadorUno, int operadorDos, Scanner scanner) {

        int operacion;
        boolean seguir = true;

        System.out.println("*******************************************************************************************");
        System.out.println("********* INGESAR EL NUMERO CORRESPONDIENTE A LA OPERACION MATEMATICA A EJECUTAR :*********");
        System.out.println("****  SUMAR             : 1  ****************************************************************");
        System.out.println("****  RESTAR            : 2  ****************************************************************");
        System.out.println("****  MULTIPLICACION    : 3  ****************************************************************");
        System.out.println("****  DIVISION          : 4  ****************************************************************");
        System.out.println("**** SALIR DEL PROGRAMA : 5  ****************************************************************");
        System.out.println("*********************************************************************************************");

        System.out.print("******INGRESE EL NUMERO : ");
        operacion = ingresoOperacionMath(scanner);


        switch (operacion) {
            case 1:
                System.out.println(" La suma de los 2 operandos es = " + suma(operadorUno, operadorDos));
                break;

            case 2:
                System.out.println(" La resta de los 2 operandos es = " + resta(operadorUno, operadorDos));
                break;

            case 3:
                System.out.println(" La multiplicacion de los 2 operandos es = " + multi(operadorUno, operadorDos));
                break;

            case 4:
                System.out.println(" La division  de los 2 operandos es = " + division(operadorUno, operadorDos));
                break;

            default:
                seguir = false;
                break;


        }
        return seguir;
    }

    private static int ingresoOperacionMath(Scanner scanner) {
        int num;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("No es un numero entero ");
                scanner.next();
                System.out.print("Ingresar un numero entero del 1 al 4 para elegir una operacion  ");
            }
            num = scanner.nextInt();
            if (num < 1) {
                System.out.println("El número debe ser positivo y distinto de 0");
            }
        } while ((num <= 0) || (num > 5));
        return num;
    }

    private static int suma(int num1, int num2) {
        return (num1 + num2);
    }

    private static int resta(int num1, int num2) {
        return (num1 - num2);
    }

    private static int multi(int num1, int num2) {
        return (num1 * num2);
    }

    private static int division(int num1, int num2) {
        return (num1 / num2);
    }
}

