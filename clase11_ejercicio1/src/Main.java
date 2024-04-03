import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "contraseña";
        System.out.print("Ingrese la contraseña :");
        String comparaPassword = scanner.nextLine();
        if (comparaPassword.toLowerCase().compareTo(password) == 0)
            System.out.println("La contraseña es correcta ");
        else
            System.out.println("La contraseña es incorrecta " ) ;








    }
}