package cl.billetera.main.utilitarios.conversor;

/**
 *
 * Clase abstracta que sera extendida en el sistema por las clases ConvertirDolar y ConvertirEuro definiendo el metodo
 * abstracto "convertirPesosChile" declarado en esta clase abstracta.
 * @author  Alvaro Alarcon Zamora.
 */
public abstract class ConversorMoneda {
    /**
     * atributo de la clase abstracta que contendra la cantidad de pesos a convertir.
     */
    double cantidadPesosCl;

    /**
     * Metodo abstracto que se encargara de hacer la conversion del dinero a la moneda correspondiente , que
     * sera definido en las clases hijas ConvertirDolar y ConvertirEuro.
     * @param cantidadPesosCl : La cantidad de dinero en pesos chilenos que se convertiran a otra divisa.
     * @return : El dinero convertido a la divisa definido en el metodo de  la clase hija que lo ejecuta.
     */
    public abstract  double convertirPesosChile(double cantidadPesosCl);
}


