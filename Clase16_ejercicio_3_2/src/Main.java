//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] palabras = {"uno ", "dos ", " tres ", "cuatro ","cinco ", "seis", "siete"};
        mostrar(palabras);

    }

    public static void mostrar( String[] elementos){
        for(String elemento : elementos) System.out.println(elemento);

    }

}