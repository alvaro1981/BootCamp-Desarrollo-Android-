public class ConvertirEuro extends ConversorMoneda {

    float conversionEuro;
    static final float unEuroValorCl = 1060.38f;
    @Override
    float convertirPesosChile(float cantidadPesosCl ) {
        this.cantidadPesosCl = cantidadPesosCl;
        conversionEuro = this.cantidadPesosCl / unEuroValorCl;
        return conversionEuro;
    }
}
