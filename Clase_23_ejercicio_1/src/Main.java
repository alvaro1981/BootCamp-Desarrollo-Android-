import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorVocales = 0;
        System.out.print("Ingresar una Palabra  : ");
        String cadena =  scanner.nextLine();
        System.out.println("Se extraera la cuarta letra de la cadena que es : " +
                cadena.substring(3,4));
        cadena =cadena.toLowerCase();
        for(int i = 0;i<cadena.length();i++){
            if(cadena.charAt(i) == 'a'  || cadena.charAt(i) == 'e'
                    || cadena.charAt(i) == 'i'|| cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u') {
                contadorVocales +=1;

            }
        }
        System.out.println("la cantidad de vocales en la cadena fue : " + contadorVocales);
    }
}