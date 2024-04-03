import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arreglo = new int[3];
        int mayor=0;
        for(int i=0;i<3;i++){
            System.out.print("Ingrese el un numero entero en arreglo["+i+"] :");
            arreglo[i]=scanner.nextInt();
        }
        for (int i : arreglo){
            if(i>mayor) mayor=i;
        }
        System.out.println("El mayor numero ingresado es  = " + mayor );
    }
}