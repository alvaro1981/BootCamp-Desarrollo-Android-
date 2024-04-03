public class ConvertirDolar extends ConversorMoneda{
    float conversionDolar;
    static final float unDolarValorCl = 978.37f;
    @Override
    float convertirPesosChile(float cantidadPesosCl ) {
        this.cantidadPesosCl = cantidadPesosCl;
        conversionDolar = this.cantidadPesosCl / unDolarValorCl;
        return conversionDolar;
    }


}
