import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int num      = 0;
    int contador = 0;
    int impares  = 0 ;
    int pares    = 0;
    Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Ingrese un numero entero : " );
            num = scanner.nextInt();
            contador+=1;
            if (num%2 == 0) pares+=1;
            else  impares+=1;

        }while(num%5 != 0);
        System.out.println("Cantidad de numeros ingresados = " + contador);
        System.out.println("Cantidad de numeros pares  = " + pares );
        System.out.println("Cantidad de numeros impares = " + impares);
    }


}