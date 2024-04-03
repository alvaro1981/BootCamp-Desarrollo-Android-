
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int suma = 0;
        int tamanoArreglo;
        int[] iterador;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" INGRESAR LA CANTIDAD DE NUMEROS QUE DESEA SUMAR : ");
        tamanoArreglo = scanner.nextInt();
        iterador = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            System.out.print(" \n INGRESE EL NUEVO NUMERO A SUMAR : ");
            iterador[i]= scanner.nextInt();
            suma += iterador[i];
        }
        System.out.println("EL RESULTADO DE LA SUMA DE TODOS LOS NUMEROS ES : " + suma );
    }
}