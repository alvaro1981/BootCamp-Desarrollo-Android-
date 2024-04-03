package cl.billetera.main.banco;

/**
 *
 * Clase CuentaBancariCliente: Esta clase es instanciada cuando el usuario de la billetera digital crea una cuenta.
 * Los objetos intanciados de esta clase contienen la informacion personal del cliente para quien fue creada la cuenta,
 * tambien incluye en uno de sus atributos el saldo de la cuenta banacaria instanciada.
 *  @author  Alvaro Alarcon Zamora
 */
public class CuentaBancariaCliente {

    /**
     * nombre de cliente de la cuenta bancaria.
     */
    private String nombreCliente;

    /**
     * apellido paterno del cliente de la  cuenta bancaria.
     */
    private String apellidoPaterno;

    /**
     * apellido materno del cliente de la cuenta bancaria.
     */
    private String apellidoMaterno;

    /**
     * Rut del cliente de la cuenta bancaria.
     */
    private String rutCliente;

    /**
     * mail del usuario  , este atributo es uno de los que solicitara
     * la plataforma para que el usuario pueda logearse al sistema.
     */
    private String mailUsuario;

    /**
     * Este atributo contiene la password o contraseña que se le solicitara al usuario para poder ingresar
     * a la plataforma. Cabe destacar que al momento que el sistema le solicita al usuario el mail y la contraseña para
     * ingresar a la plataforma , si la contraseña no coincide con el mail ingresado la plataforma no le permitira
     * ingresar a la cuenta solicitada.
     */
    private String passwordCuenta;

    /**
     * Este es el numero de cuenta corriente que es generado por la clase AdministradorCuentaBancaria, lo que hace esta
     * clase es simplemente aumentar en una unidad  este valor cada vez que el usuario crea  exitosamente una cuenta
     * bancaria.
     */
    private int idCuentaCorriente;

    /**
     * contiene el monto de dinero en pesos chilenos que posee la instancia de la clase.
     */
    private double saldoCliente;

    /**
     * Constructor de la clase
     *
     * @param nombreCliente : nombre del cliente.
     * @param apellidoPaterno : apellido paterno del cliente.
     * @param apellidoMaterno : apellido materno del cliente.
     * @param rutCliente : rut del cliente.
     * @param mailUsuario : mail del cliente.
     * @param passwordCuenta : contraseña del cliente para ingresar a la plataforma.
     * @param idCuentaCorriente : numero de cuenta corriente o bancaria asignada y generada por el sistema.
     * @param saldoCliente : Saldo de la cuenta del cliente en pesos Chilenos.
     */
    public CuentaBancariaCliente(String nombreCliente,
                                 String apellidoPaterno,
                                 String apellidoMaterno,
                                 String rutCliente,
                                 String mailUsuario,
                                 String passwordCuenta,
                                 int idCuentaCorriente,
                                 double saldoCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rutCliente = rutCliente;
        this.mailUsuario = mailUsuario;
        this.passwordCuenta = passwordCuenta;
        this.idCuentaCorriente = idCuentaCorriente;
        this.saldoCliente = saldoCliente;
    }

    /**
     * Metodo utilizado para depositar dinero en la cuenta del cliente.
     * @param dinero :  dinero a depositar en la cuenta del cliente.
     */

    public void ingresarDineroCuenta(double dinero){
        this.saldoCliente += dinero;
    }

    /**
     * Metodo utilizado para girar  dinero de la cuenta del cliente.
     * @param dinero : dinero en pesos chilenos que se girara de la cuenta del cliente.
     * @return : retorna un boolean true si habia suficiente dinero en el saldo de la cuenta para efectuar el giro.
     * De lo contrario retorna un boolean false si la cantidad de dinero a girar es superior al saldo.
     */
    public boolean  retirarDineroCuenta(double dinero) {
        boolean saldoSuficiente = false;
        if (this.saldoCliente >= dinero) {
            saldoSuficiente = true;
            this.saldoCliente -= dinero;
        }
        return  saldoSuficiente;
    }

    /**
     * Metodo getter del atributo mailUsuario.
     * @return retorna el mail del usuario.
     */
    public String getMailUsuario() {
        return mailUsuario;
    }

    /**
     * metodo getter del atributo nombreCliente.
     * @return retorna el nombre del cliente.
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * metodo getter del atributo apellidoPaterno.
     * @return retorna el apellido paterno del cliente.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * metodo getter del atributp apellidoMaterno.
     * @return retorna el apellido Materno del cliente.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * metodo getter del atributo rutCliente.
     * @return retorna el rut del cliente.
     */
    public String getRutCliente() {
        return rutCliente;
    }

    /**
     * metodo getter del atributo passwordCuenta.
     * @return retorna la contraseña del cliente para ingresar al sistema.
     */
    public String getPasswordCuenta() {
        return passwordCuenta;
    }

    /**
     * Metodo getter del atributo idCuentaCorriente.
     * @return retorna el numero de cuenta corriente asignado y generado por el sistema.
     */
    public int getIdCuentaCorriente() {
        return idCuentaCorriente;
    }

    /**
     * Metodo getter del atributo saldoCliente.
     * @return : retorna el dinero en pesos chilenos que posee la cuenta del cliente.
     */
    public double getSaldoCliente() {
        return saldoCliente;
    }

    /**
     * Metodo Setter del atributo nombreCliente.
     * @param nombreCliente : nuevo nombre del cliente.
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Metodo setter del atributo apellidoPaterno.
     * @param : nuevo apellido paterno del cliente.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Metodo setter del atributo apellidoMaterno.
     * @param apellidoMaterno : nuevo apellido Materno del cliente.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Metodo setter del atributo rutCliente.
     * @param rutCliente : nuevo rut del cliente.
     */
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Metodo setter del atributo mailUsuario.
     * @param mailUsuario: nuevo mail del usuario.
     */
    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    /**
     * Metodo setter del atributo passwordCuenta.
     * @param passwordCuenta : nueva contraseña del cliente.
     */
    public void setPasswordCuenta(String passwordCuenta) {
        this.passwordCuenta = passwordCuenta;
    }

    /**
     * Metodo setter del atributo idCuentaCorriente.
     * @param idCuentaCorriente : nuevo numero de cuenta corriente.
     */
    public void setIdCuentaCorriente(int idCuentaCorriente) {
        this.idCuentaCorriente = idCuentaCorriente;
    }

    /**
     * Metodo setter del atributo saldoCliente.
     * @param saldoCliente: nuevo saldo del cliente.
     */
    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }
}
