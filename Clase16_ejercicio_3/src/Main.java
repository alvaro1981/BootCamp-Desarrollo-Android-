//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] dobles = {1.23, 2.34, 3.45, 4.56,5.67, 6.78, 7.89};
        mostrar(dobles);

    }

    public static void mostrar( double[] elementos){
        for(double elemento : elementos) System.out.println(elemento);

    }
}