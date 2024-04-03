package cl.billetera.main;
import cl.billetera.main.banco.AdministradorCuentasBancarias;
import cl.billetera.main.banco.CuentaBancariaCliente;
import cl.billetera.main.utilitarios.conversor.ConversorMoneda;
import cl.billetera.main.utilitarios.conversor.ConvertirDolar;
import cl.billetera.main.utilitarios.conversor.ConvertirEuro;
import cl.billetera.main.utilitarios.interfazusuario.InterfazDelUsuario;


/**
 *
 * Clase Main : Contiene la logica principal del programa  , se encarga de instanciar las clases interfazDelUsuario,
 * AdministradorCuentasBancarias y ConversorMoneda , para luego utilizar sus metodos que por medio de la interaccion
 * con el usuario del sistema  se podran crear cuentas bancarias de clientes, logearse al sistema, realizar movimientos
 * financieros de una cuenta en particular y consultar el saldo de la cuenta en diferentes tipos de monedas .
 *  @author  Alvaro Alarcon Zamora.
 *
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            InterfazDelUsuario interfazDelUsuario = new InterfazDelUsuario();
            AdministradorCuentasBancarias administradorCuentasBancarias = new AdministradorCuentasBancarias();
            ConversorMoneda convertirDolar = new ConvertirDolar();
            ConversorMoneda convertirEuro = new ConvertirEuro();
            CuentaBancariaCliente cuentaBancariaCliente;
            int opcionInicioWallet;
            boolean logeado;
            int tipoMovimiento;
            do{
                do{
                    opcionInicioWallet = interfazDelUsuario.inicioWalletDigital();
                    if (opcionInicioWallet == 1) {
                        cuentaBancariaCliente = interfazDelUsuario.menuCrearCliente(administradorCuentasBancarias);
                        if (cuentaBancariaCliente != null) {
                            administradorCuentasBancarias.agregarClienteCtaBancaria(cuentaBancariaCliente);
                            interfazDelUsuario.menuCreoExistosamenteCuenta(administradorCuentasBancarias.
                                    buscarClienteporMail(cuentaBancariaCliente.getMailUsuario()));
                        }
                    }
                }while(opcionInicioWallet != 2);

                 cuentaBancariaCliente = interfazDelUsuario.menuLogearPlataforma(administradorCuentasBancarias);
                 logeado = (cuentaBancariaCliente != null);

                 if(logeado){
                        do{
                            tipoMovimiento = interfazDelUsuario.menuMovimientosFinancieros(cuentaBancariaCliente);
                            switch (tipoMovimiento) {
                                case 1:
                                    cuentaBancariaCliente.ingresarDineroCuenta(
                                            interfazDelUsuario.movimientosDineroCuentaBancaria("DEPOSITAR"));
                                    break;
                                case 2:
                                    cuentaBancariaCliente.retirarDineroCuenta(
                                            interfazDelUsuario.movimientosDineroCuentaBancaria("RETIRAR"));
                                    break;
                                case 3:
                                    interfazDelUsuario.cambiarMonedaSaldo(cuentaBancariaCliente,
                                            convertirDolar, "DOLARES");
                                    break;
                                case 4:
                                    interfazDelUsuario.cambiarMonedaSaldo(cuentaBancariaCliente,
                                            convertirEuro, "EUROS");
                                    break;
                                case 5:
                                    logeado = false;
                                    break;
                                case 6:
                                    System.out.println("****||>>>> LA BILLETERA ELECTRONICA SE CERRARA <<<<||****");
                                    return;
                            }

                        } while(tipoMovimiento < 5);
                 }
           }while(!logeado);
    }
}