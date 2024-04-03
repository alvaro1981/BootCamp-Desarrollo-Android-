import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ocupacion = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad : ");
        int edad = scanner.nextInt();
        //scanner.next();
        System.out.print("Ingrese su ocupacion : ");

        ocupacion = scanner.nextLine();
        scanner.next();
        System.out.print("Nombre    : " + nombre);
        System.out.println("Edad      : " + edad);
        System.out.println("Ocupacion : " + ocupacion);



    }
}