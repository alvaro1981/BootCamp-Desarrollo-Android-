package cl.billetera.main.utilitarios.conversor;

/**
 *
 * Clase hija de la clase abstracta ConversorMoneda, esta clase define el metodo abstracto convertirPesosChile
 * declarado por su clase padre, para que pueda hacer la conversion de CLP a EUROS.
 * @author  Alvaro Alarcon Zamora.
 */
public class ConvertirEuro extends ConversorMoneda {

    /**
     * atributo que retornara la conversion de los pesos chilenos a euros .
     */
    double conversionEuro;
    /**
     * Constante que contiene el valor del un euro en pesos chilenos.
     */
    static final double unEuroValorCl = 1060.38f;
    /**
     * Definicion del metodo abstracto de la clase padre ConversorMoneda , para que se puedar convertir
     * la cantidad de dinero en pesos a dolares americanos.
     * @param cantidadPesosCl : La cantidad de dinero en pesos chilenos que se convertiran a dolares.
     * @return retorna la cantidad de dinero en pesos chilenos a dolares americanos
     */
    @Override
    public double convertirPesosChile(double cantidadPesosCl) {
        this.cantidadPesosCl = cantidadPesosCl;
        conversionEuro = this.cantidadPesosCl / unEuroValorCl;
        return conversionEuro;
    }
}
