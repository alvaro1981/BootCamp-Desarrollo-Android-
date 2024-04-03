import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int partidosGanados, partidosEmpatados, partidosPerdidos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("|** Debes Ingresar los Partidos Ganados,**|");
        System.out.println("|** empatados y perdidos de tu equipo ****|");
        System.out.println("|** favorito  ****************************|");
        System.out.println("******************************************|");

        System.out.print("\n  NUMERO DE PARTIDOS GANADOS  : ");
        partidosGanados = validarIngresoPartido(scanner);
        System.out.print("  NUMERO DE PARTIDOS EMPATADOS: ");
        partidosEmpatados = validarIngresoPartido(scanner);
        System.out.print("  NUMERO DE PARTIDOS PERDIDOS : ");
        partidosPerdidos  = validarIngresoPartido(scanner);

        EquipoFavorito equipoFavorito = new EquipoFavorito(partidosGanados,
                partidosEmpatados, partidosPerdidos);
        System.out.println("  PUNTOS DE PARTIDOS GANADOS    : " + equipoFavorito.getPuntosPartidosGanados() );
        System.out.println("  PUNTOS DE PARTIDOS EMPATADOS  : " + equipoFavorito.getPuntosPartidosEmpatados() );
        System.out.println("  PUNTAJE TOTAL DE LA LIGA      : " + equipoFavorito.getPuntosTotales() );

    }
    public static int validarIngresoPartido(Scanner scanner ){
        int num;

        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("No es un numero entero ");
                System.out.print("Intenta nuevamente ingresar : ");
            }
            num = scanner.nextInt();
            if(num <= 0){
                System.out.println("El número debe ser positivo");
            }
        }while (num <= 0);
        //  scanner.close();
        return  num ;
    }
}