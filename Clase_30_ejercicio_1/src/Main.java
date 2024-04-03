import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cafetera cafetera = new Cafetera(10000,5000);
        int accionCafetera;
        boolean salirCafetera = false;

        while (!salirCafetera) {

            System.out.println(" CONTENIDO ACTUAL DE LA  CAFETERA = " + cafetera.getCantidadActual() +" ml");
            System.out.println(" CAPACIDAD MAXIMA DE LA CAFETERA  = " + cafetera.getCapacidadMaxima() + " ml");
            System.out.println("|*******************************************************************|");
            System.out.println("|*              MENU CAFETERA                                      *|");
            System.out.println("|*******************************************************************|");
            System.out.println("|******|---------------------------------|**************************|");
            System.out.println("|******|    1 - SERVIR UNA TAZA DE CAFE  |**************************|");
            System.out.println("|******|    2 - LLENAR CAFETERA          |**************************|");
            System.out.println("|******|    3 - AGREGAR CAFE             |**************************|");
            System.out.println("|******|    4 - VACIAR CAFETERA          |**************************|");
            System.out.println("|******|    5 - AJUSTAR CAPACIDAD MAXIMA |**************************|");
            System.out.println("|******|    6 - SALIR DEL MENU           |**************************|");
            System.out.println("|******|_________________________________|**************************|");
            System.out.println("|*******************************************************************|");

            do {
                System.out.print("|******* OPCION  --> :  ");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("OPCION INVALIDA , VUELVA A INTENTAR ");
                    System.out.print("|******* OPCION  --> :  ");
                }
                accionCafetera = scanner.nextInt();

            } while ((accionCafetera <= 0) || (accionCafetera > 6));

            salirCafetera = ejecutarAccionCafetera(accionCafetera, scanner, cafetera);

        }
    }

    private static boolean ejecutarAccionCafetera(int accionCafetera, Scanner scanner, Cafetera cafetera) {

          boolean salirPrograma = false;

          switch ( accionCafetera ){
            case  1 :
                menuServirTaza(scanner, cafetera);
                break;

            case 2 :
                System.out.println(" Se lleno la cafetera al Maximo que es : " + cafetera.getCapacidadMaxima()
                        + " ml . Para esto se  le tuvo que agregar " + cafetera.llenarCafetera() + " ml de cafe");
                break;

            case 3 :
                menuAgregarCafe(scanner,cafetera);
                break;

            case 4:
                cafetera.vaciarCafetera();
                System.out.println(" La Cafetera se vacio ");
                break;

            case 5:
                menuAajustarCapacidadMaxCafetera(scanner,cafetera);
                System.out.println(" ");
                break;

            case 6:
                salirPrograma = true;
                break;


        }
      return salirPrograma;
    }

    private static void menuAajustarCapacidadMaxCafetera(Scanner scanner, Cafetera cafetera) {

        System.out.print(" Ingrese la capacidad maxima de la Cafetera en ml :  ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("OPCION INVALIDA , VUELVA A INTENTAR ");
            System.out.print(" Ingrese la capacidad maxima de la Cafetera en ml :  ");
        }

        cafetera.setCapacidadMaxima(scanner.nextInt());


    }

    private static void menuServirTaza(Scanner scanner, Cafetera cafetera) {

        System.out.print(" Ingrese la capacidad en ml de su taza  :  ");

        while (!scanner.hasNextInt()) {
                  scanner.next();
                  System.out.println("OPCION INVALIDA , VUELVA A INTENTAR ");
                  System.out.print(" Ingrese la capacidad en ml de su taza  :  ");
        }

        cafetera.servirTaza(scanner.nextInt());

    }

    private static void menuAgregarCafe(Scanner scanner, Cafetera cafetera){

        int cafeSobra;
        System.out.print(" Ingrese cantidad de cafe en ml para agregar a la cafetera  :  ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("OPCION INVALIDA , VUELVA A INTENTAR ");
            System.out.print(" Ingrese la capacidad en ml de su taza  :  ");
        }
        cafeSobra = cafetera.agregarCafe(scanner.nextInt());
        if (cafeSobra > 0){
            System.out.println("La cantidad de cafe agregado sobrepaso la capacidad " +
                    "maxima de la cafetera por "+ cafeSobra + " ml");
        }

    }

}