import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero positivo: ");
         int numeroUno = scanner.nextInt();
     if ( numeroUno >= 1 ){
         if(numeroUno%2 == 0){
             System.out.println("El numero es par");
         }else System.out.println("El numero es impar");
     }else if(numeroUno == 0 ) System.out.println("El numero ingresado es 0");

    }
}