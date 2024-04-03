import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int numero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero : ");
        numero = scanner.nextInt();
        System.out.println(" el doble del numero es :" + (2*numero));
        System.out.println(" el triple  del numero es :" + (3*numero));
        System.out.println(" La raiz cuadrada del numero es  :" + Math.sqrt(numero));
        System.out.println(" El  numero elevado a la 7 es   :" + Math.pow(numero,7));

    }

}