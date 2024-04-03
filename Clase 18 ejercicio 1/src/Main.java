import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese el primer operador para una suma :");
        int operadorUno = scanner.nextInt();
        System.out.print(" Ingrese el segundo operador para una suma :");
        int operadorDos = scanner.nextInt();
        System.out.println("La suma de los operadores es : " + (operadorUno + operadorDos ));
        System.out.print(" Ingrese un numero entero  :");
         operadorUno = scanner.nextInt();
        System.out.println(" EL cuadrado del numero elevado al  exponente 2 es = " + Math.pow(Math.pow(operadorUno,2),2));
        System.out.print("Ingrese una primera palabra : ");
        scanner.next();
        String cadenaUno = scanner.nextLine();
        System.out.print("Ingrese una segunda palabra : ");
        String cadenaDos = scanner.nextLine();
        System.out.println(" cadenas concatenadas : "+  cadenaUno.concat(cadenaDos));
        scanner.next();
        System.out.print(" Ingrese el primer operador para una suma :");
        operadorUno = scanner.nextInt();
        System.out.print(" Ingrese el segundo operador para una suma :");
        operadorDos = scanner.nextInt();
        if (operadorUno == operadorDos) System.out.println("los numero  son iguales ");
        else System.out.println("Los numero ingresados son diferentes");

    }
}