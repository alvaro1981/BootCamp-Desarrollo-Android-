//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        System.out.println("Suma de numeros del 1 10 con un for ");

        for (int i = 1; i <= 10; i++) {
            suma += i ;
            System.out.println("numero "+ i +" suma = " + suma );
        }
    }
}