package cl.billetera.main.banco;

import java.util.ArrayList;

/**
 *
 * Esta clase posee un ArrayList de cuentas bancarias que ha creado el o los usuarios del sistema. Y como
 * dice su nombre administra esta ArrayList de clientes , agregando instancias nuevas al arraylist cuando
 * el usuario crea una nueva cuenta . Como en este Arraylist se encuentra todas las instancias de clientes
 * creados , se podria decir que es una pequeña tabla de datos de clientes con cuentas. Esta lista de clientes
 * es utilizada para hacer match cuando un usuario se quiere logear al sistema.
 * @author  Alvaro Alarcon Zamora.
 */
public class AdministradorCuentasBancarias {

    /**
     * ArrayList de instancias de la clase CuentaBancariaCliente, cada vez que el usuario crea una cuenta un
     * objeto es agregado a esta ArrayList. Por otra parte tambien si se quiere eliminar alguna cuenta tambien
     * se deberia eliminar el objeta de este ArrayList
     */
    private ArrayList<CuentaBancariaCliente> arregloCuentasBancarias = new ArrayList<>();

    /**
     * Este atributo es aumentado en una unidad cada vez que un usuario crea una cuenta bancaria en el
     * sistema. Luego de incrementar un unidad ,  se le asignara a la nueva cuenta , esta identificacion unica
     * en el ArrayList de cuentas bancarias. Se le podria cambiar su valor inicial a un valor diferente de 0 y desde
     * ese valor se comenzaran a sumar una unidad cada vez que una cuenta sea creada.
     */
   private int idCuentaBancariaCliente = 0;

    /**
     * Este metodo agrega a la ArrayList de cuentas bancarias una nueva cuenta.
     * @param cuentaBancariaCliente : instancia de clase CuentaBancariaCliente que se agregara al ArrayList.
     */
   public void agregarClienteCtaBancaria(CuentaBancariaCliente cuentaBancariaCliente){

       arregloCuentasBancarias.add(cuentaBancariaCliente);

   }
/*
   public void eliminarClienteCtaBancaria(String rutCliente ){
      for( int i = 0 ; i < arregloCuentasBancarias.size(); i++ ){
           if( arregloCuentasBancarias.get(i).getRutCliente().equals(rutCliente)){
               arregloCuentasBancarias.remove(i);
            }
      }
   }
 */

    /**
     * Metodo que elimina una instancia de CuentaBancariaCliente desde el ArrayList,
     * de esta forma el cliente ya no existiria y no se puede logear al sistema.
     * Este metodo no se usa por el momento.
     * @param ctaCliente : La instancia o objeto que se quiere borrar del ArrayList de cuentas.
     */
   public void eliminarClienteCtaBancaria(CuentaBancariaCliente ctaCliente){
               arregloCuentasBancarias.remove(ctaCliente);
   }

    /**
     * Metodo que busca a un cliente en el ArrayList de clientes por su atributo rutCliente.
     * @param rutCliente : rut del cliente que se buscara en el ArrayList de clientes de cuentas bancarias.
     * @return : retorna el objeto CuentaBancariaCliente que coincide con el rut ingresado como parametro.
     */
   public CuentaBancariaCliente buscarClienteporRut(String rutCliente){
       CuentaBancariaCliente cuentaEncontrada = null;
       for( int i = 0 ; i < arregloCuentasBancarias.size(); i++ ) {
           if (arregloCuentasBancarias.get(i).getRutCliente().equals(rutCliente)) {
              cuentaEncontrada = arregloCuentasBancarias.get(i);
           }
       }
       return cuentaEncontrada;
   }

    /**
     * Metodo que busca a un cliente en el ArrayList de clientes por su atributo mailCliente.
     * @param mailCliente : mail del cliente que se buscara en el ArrayList de clientes de cuentas bancarias.
     * @return : retorna el objeto CuentaBancariaCliente que coincide con el mail ingresado como parametro.
     */
    public CuentaBancariaCliente buscarClienteporMail(String mailCliente){
        CuentaBancariaCliente cuentaEncontrada = null;
        for( int i = 0 ; i < arregloCuentasBancarias.size(); i++ ) {
            if (arregloCuentasBancarias.get(i).getMailUsuario().equals(mailCliente)) {
                cuentaEncontrada = arregloCuentasBancarias.get(i);
            }
        }
        return cuentaEncontrada;
    }

    /**
     * Metodo que genera un numero de cuenta bancaria unica de forma simple al instanciar una clase
     * CuentaBancariaCliente y agregarla al ArrayList como una cuenta bancaria del nuevo cliente
     * creado. Simplemente le suma una unidad al atributo iidCuentaBancariaCliente de la clase como un
     * contador de clientes creados.
     */
    public int generarIdCuentaCliente(){
      return   this.idCuentaBancariaCliente+=1;
    }






}
