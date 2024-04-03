

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     ConvertirEuro  convertirEuro = new ConvertirEuro();
     ConvertirDolar convertirDolar = new ConvertirDolar();
     DecimalFormat  formateador = new DecimalFormat("###,###,###,###.##");

     System.out.println("|****************************************************|");
     System.out.println("|********  CONVERSOR DE MONEDA **********************|");
     System.out.println("|****************************************************|");
     System.out.print("\n INGRESE EL MONTO EN PESOS CHILENOS A CONVERTIR : ");

     float MontoPesosChilenos = validarPesos(scanner);
        System.out.println("*******| OPCIONES PARA LA CONVERSION |*******");
        System.out.println("| 1 --> CONVERTIR A DOLARES |****************");
        System.out.println("| 2 --> CONVERTIR A EUROS   |****************");
        System.out.print("INGRESE SU OPCION: ");
        int opciones = scanner.nextInt();
        switch (opciones){
            case 1 :

                System.out.println("Conversion a  Dolares : " +
                        formateador.format(convertirDolar.convertirPesosChile(MontoPesosChilenos)));
                break;

            case 2 :
                System.out.println("Conversion a  Euros  : " +
                        formateador.format(convertirEuro.convertirPesosChile(MontoPesosChilenos)));
                break;

            default:
                System.out.println("NO ES UNA OPCION VALIDA");
        }



    }
    public static float validarPesos(Scanner scanner ){
        float num;

        do {
            while (!scanner.hasNextFloat()) {
                scanner.next();
                System.out.println("No es un numero de coma flotante ");
                System.out.print("Intenta nuevamente ingresar el monto en pesos chilenos : ");
            }
            num = scanner.nextFloat();
            if(num <= 0){
                System.out.println("El número debe ser positivo");
            }
        }while (num <= 0);
        //  scanner.close();
        return  num ;
    }
}