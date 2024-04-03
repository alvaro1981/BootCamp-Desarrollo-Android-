//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("IMPRIME POR PANTALLA NUMEROS PARES DEL 1 AL 100 ");

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0)  System.out.print(i+" ");
        }
    }
}