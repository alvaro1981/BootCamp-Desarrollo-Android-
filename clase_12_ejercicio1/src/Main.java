import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           int edad ;
           int peso ;

        System.out.print("Ingrese su edad :  ");
           edad = scanner.nextInt();
        System.out.print(" Ingrese su peso : ");
           peso = scanner.nextInt();
        if(edad >=18 && edad <= 65)
            if(peso >= 50 ) {
                System.out.println("Puede ser donante de sangre");
            }else System.out.println("No puede ser un donante porque su peso es inferior a 50 kg ");
        else System.out.println(" Su edad no le permite ser donante de sangre ");

    }

}