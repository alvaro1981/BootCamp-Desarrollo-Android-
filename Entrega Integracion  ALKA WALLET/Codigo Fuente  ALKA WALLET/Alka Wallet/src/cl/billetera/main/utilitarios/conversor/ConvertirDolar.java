package cl.billetera.main.utilitarios.conversor;

/**
 *
 * Clase hija de la clase abstracta ConversorMoneda, esta clase define el metodo abstracto convertirPesosChile
 * declarado por su clase padre, para que pueda hacer la conversion de CLP a DOLARES.
 * @author  Alvaro Alarcon Zamora.
 */
public class ConvertirDolar extends ConversorMoneda {
    /**
     * atributo que retornara la conversion de los pesos chilenos a dolares .
     */
    double conversionDolar;

    /**
     * Constante que contiene el valor del un un dolar en pesos chilenos.
     */
    static final double unDolarValorCl = 978.37f;

    /**
     * Definicion del metodo abstracto de la clase padre ConversorMoneda , para que se puedar convertir
     * la cantidad de dinero en pesos a dolares americanos.
     * @param cantidadPesosCl : La cantidad de dinero en pesos chilenos que se convertiran a dolares.
     * @return retorna la cantidad de dinero en pesos chilenos a dolares americanos
     */
    @Override
    public double convertirPesosChile(double cantidadPesosCl) {
        this.cantidadPesosCl = cantidadPesosCl;
        conversionDolar = this.cantidadPesosCl / unDolarValorCl;
        return conversionDolar;
    }


}
