package cl.billetera.main.utilitarios.interfazusuario;
import cl.billetera.main.banco.AdministradorCuentasBancarias;
import cl.billetera.main.banco.CuentaBancariaCliente;
import cl.billetera.main.utilitarios.conversor.ConversorMoneda;
import java.util.Scanner;

/**
 *
 * Clase InterfazDelUsuario : Clase que contiene metodos que desplegan  menus con opciones  que esperan respuestas del
 * usuario del sistema , en sintesis tiene todas las pantallas donde el programa interactua con el usuario. Estas
 * pantallas permitiran al usuario crear cuentas bancarias , logearse para acceder a una cuenta en particular y poder
 * realizar movimientos financieros en la cuenta a la cual se accedido.
 * @author  Alvaro Alarcon Zamora.
 */

public class InterfazDelUsuario {

    /**
     * Instancia de la clase Scanner ,  utilizado para recibir por la entrada estandar las decisiones del usuario frente
     * a las opcione que le entrega la  interfaz de usuario del sistema.
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Metodo InicioWalletDigital : Menu de bienvenida , con el proposito de que el usuario decida si quiere crear
     * una nueva cuenta bancaria o ingresar a una cuenta ya existente en la sistema.
     *
     * @return : retorna el numero de la opcion elegida por el usuario del sistema.
     */
    public int inicioWalletDigital(){

        System.out.println("****************************************************************");
        System.out.println("*************|    ALKEMY DIGITAL  |*****************************");
        System.out.println("****************************************************************");
        System.out.println("******** BIENVENIDOS A TU BILLETERA DIGITAL*********************");
        System.out.println("****************************************************************");
        System.out.println("************ _________________________________________________**");
        System.out.println("************|OPCION 1 : SI NECESITA CREAR UNA CUENTA BANCARIA|**");
        System.out.println("************|OPCION 2 : INGRESAR A SU CUENTA BANCARIA        |**");
        System.out.println("************|________________________________________________|**");
        System.out.print(" DIGITE EL NUMERO DE SU OPCION : ");
        return  validarIngresoOpciones(2);

    }

    /**
     * menuCrearCliente : metodo que interactua con el usuario del sistema para crear una cuenta bancaria para un
     * cliente, consultando por pantalla todos los datos necesarios para crear una cuenta bancaria en el sistema.
     * @param administradorCuentasBancarias : Instancia de la clase AdministradorCuentasBancarias, este objeto utilizara
     *                                       el metodo administradorCuentasBancarias.buscarClienteporMail(emailCliente)
     *                                      para informale al usuario si ya existe una cuenta con ese mail ingresado.
     *
     * @return retornara una instancia de la clase CuentaBancariaCliente si es que el usuario finalmente confirma que
     * la cuenta bancaria sea creada con los datos ingresados, en el caso contrario retornara NULL.
     */

    public CuentaBancariaCliente menuCrearCliente(AdministradorCuentasBancarias administradorCuentasBancarias){
        boolean clienteExiste;
        System.out.println("****************************************************************");
        System.out.println("**********| CREACION CUENTA BANCARIA   |************************");
        System.out.println("****************************************************************");
        scanner.nextLine();
        System.out.print(" Ingresar  Nombre: ");
        String nombreCliente  =  scanner.nextLine();
        System.out.print(" Ingresar  Apellido Paterno: ");
        String apellidoPaternoCliente  =  scanner.nextLine();
        System.out.print(" Ingresar  Apellido Materno: ");
        String apellidoMaternoCliente  =  scanner.nextLine();
        System.out.print(" Ingresar su RUT : ");
        String rutCliente  =  scanner.nextLine();
        String emailCliente;
        do {
            clienteExiste = false;
            System.out.print(" Ingresar su Correo Electronico : ");
            emailCliente = scanner.nextLine();
            if (administradorCuentasBancarias.buscarClienteporMail(emailCliente)  != null){
                System.out.print(" Ya existe una cuenta creada con el Email ingresado.");
                clienteExiste = true;
            }
          }while(clienteExiste);

        System.out.print("""
                Ahora se le solicitara crear una contraseña para su cuenta bancaria,\s
                la contraseña que creara a continuacion es la que se solicitara para \s
                ingresar a la plataforma de ALKEMY DIGITAL para poder hacer movimientos\s
                financieros.\s""");
        System.out.print("Ingrese su Contraseña : ");
        String passwordCliente  =  scanner.nextLine();
        System.out.println("Como requisito la cuenta nueva debe tener un  saldo inicial \n " +
                "igual o superior a 10.000 pesos CLP. ");
        System.out.print("Ingrese el saldo con el cual desea crear la  Cuenta Bancaria : ");
        double saldoInicalNuevaCuentaBancaria = validarDineroCuentaBancaria();
        System.out.println("******| OPCION 1 : CONFIRMAR LA CREACION DE LA CUENTA       |*****");
        System.out.println("******| OPCION 2 : NO CREAR CUENTA , VOLVER AL MENU INICIAL |*****");
        System.out.print("INGRESE UN OPCION : ");

        if (validarIngresoOpciones(2) == 1) {
            int idCuentaBancaria = administradorCuentasBancarias.generarIdCuentaCliente();

            return new CuentaBancariaCliente(nombreCliente,apellidoPaternoCliente,
                    apellidoMaternoCliente,rutCliente,emailCliente,passwordCliente,
                    idCuentaBancaria,saldoInicalNuevaCuentaBancaria);
        }
        return  null;
    }

    /**
     * menuCreoExistosamenteCuenta : Metodo que le informa al usuario del sistema  que la cuenta se creo exitosamente ,
     * desplegando por pantalla  la informacion relevante de la cuenta bancaria creada.
     * @param cuentaBancariaCliente : Instancia de la clase CuentaBancariaCliente de la cuenta recien creada,
     *                              la cual se utilizaran sus metodos getter para desplegar por pantalla informacion
     *                              de la cuenta creada recientemente.
     *
     */
    public void menuCreoExistosamenteCuenta(CuentaBancariaCliente cuentaBancariaCliente) {
        System.out.println("\n *************************************************************");
        System.out.println("********SE CREO EXITOSAMENTE LA CUENTA BANCARIA DE: ********* " );
        System.out.println("*************************************************************");
        System.out.println("NOMBRE     : " + cuentaBancariaCliente.getNombreCliente()
                + " " + cuentaBancariaCliente.getApellidoPaterno()+" "+ cuentaBancariaCliente.getApellidoMaterno());
        System.out.println("RUT                    : " + cuentaBancariaCliente.getRutCliente());
        System.out.println("MAIL                   : " + cuentaBancariaCliente.getMailUsuario());
        System.out.println("SALDO CUENTA BANCARIA  : " + cuentaBancariaCliente.getSaldoCliente()+
                " Pesos Chilenos");
        System.out.println("NUMERO CUENTA BANCARIA : " + cuentaBancariaCliente.getIdCuentaCorriente());
        scanner.nextLine();
        System.out.print("Presionar ENTER para seguir :");
        scanner.nextLine();

    }

    /**
     *
     * menuLogearPlataforma: Metodo que  permite ingresar al sistema  al usuario del programa , solicitando a este
     * ultimo el mail y contraseña del cliente que quiere ingresar al sistema.
     *
     * @param administradorCuentasBancarias : instancia de la clase AdministradorCuentasBancarias que se utlizara para
     *                                      enviarle como parametro al metodo buscarClienteEnAdministradordeCuentas,
     *                                      que se llamara en el retorno de este metodo.
     * @return retorna una instancia de la clase CuentaBancariaCliente si el objeto  administradorCuentasBancarias
     * logra encontrar la cuenta con los datos proporcionados por el usuario, si la cuenta bancaria no existe
     * retornara NULL.
     */
    public CuentaBancariaCliente menuLogearPlataforma(AdministradorCuentasBancarias administradorCuentasBancarias){
        System.out.println("****************************************************************");
        System.out.println("**********| INGRESO A LA CUENTA BANCARIA    |*******************");
        System.out.println("****************************************************************");
        scanner.nextLine();
        System.out.print("****** INGRESE SU MAIL  :  ");
        String mailCliente = scanner.nextLine();
        System.out.print("****** INGRESE PASSWORD :  ");
        String passwordCuentaCliente = scanner.nextLine();

        return buscarClienteEnAdministradordeCuentas(mailCliente, passwordCuentaCliente,
                                                      administradorCuentasBancarias);
    }

    /**
     * menuMovimientosFinancieros : Metodo que entrega informacion de la cuenta bancaria del cliente logeado junto con
     * un menu por pantalla para que el usuario seleccione un movimiento financiero de la cuenta,  ver el saldo en
     * una diferente moneda (dolares y euros) ,  volver al menu inicial o salir del programa.
     *
     * @param cuentaBancariaCliente : instancia de la clase CuentaBancariaCliente , se utilizan sus metodos getter para
     *                              desplegar por pantalla la informacion de la cuenta del cliente.
     * @return el numero de la opcion que el usuario eligio del menu.
     */
    public int menuMovimientosFinancieros( CuentaBancariaCliente cuentaBancariaCliente ){
        System.out.println("*************||------------------||*****************************");
        System.out.println("*************||  CUENTA BANCARIA ||*****************************");
        System.out.println("|| TITULAR DE LA CUENTA     : "+ cuentaBancariaCliente.getNombreCliente() +
                " " + cuentaBancariaCliente.getApellidoPaterno() +" "
                + cuentaBancariaCliente.getApellidoMaterno() );
        System.out.println("|| RUT                      : " + cuentaBancariaCliente.getRutCliente());
        System.out.println("|| NUMERO CUENTA BANCARIA   : " + cuentaBancariaCliente.getIdCuentaCorriente());
        System.out.println("|| SALDO DE LA CUENTA       : " + cuentaBancariaCliente.getSaldoCliente());
        System.out.println("************ ________________________________________________ **");
        System.out.println("************|OPCION 1 : DEPOSITAR DINERO                     |**");
        System.out.println("************|OPCION 2 : GIRAR DINERO                         |**");
        System.out.println("************|OPCION 3 : VER SALDO EN DOLARES                 |**");
        System.out.println("************|OPCION 4 : VER SALDO EN EUROS                   |**");
        System.out.println("************|OPCION 5 : VOLVER AL MENU DE INICIO             |**");
        System.out.println("************|OPCION 6 : SALIR DE LA BILLETERA DIGITAL        |**");
        System.out.println("************|________________________________________________|**");
        System.out.print(" DIGITE EL NUMERO DE SU OPCION : ");
        return  validarIngresoOpciones(6);
    }

    /**
     * movimientosDineroCuentaBancaria : Metodo que desplega una pantalla para que el usuario pueda ingresar el monto
     * de dinero que va girar o depositar en la cuenta.
     * @param movimiento: es un string que indica el movimiento financiero que se efectuara despues de ingresar el
     *                  monto de dinero, los strings definidos son GIRAR y DEPOSITAR.
     * @return  retorna el monto de dinero ingresado por el usuario para el movimiento financiero seleccionado.
     */
    public double movimientosDineroCuentaBancaria(String movimiento){
        System.out.println("****************************************************************");
        System.out.println("**| " + movimiento + " EN CUENTA BANCARIA  |***************************");
        System.out.println("****************************************************************");
        System.out.print(" INGRESE EL DINERO EN PESOS QUE DESEA " + movimiento + " : ");
        return validarMovimientosCuentaBancaria();
    }

    /**
     *
     * Metodo cambiarMonedaSaldo: Este metodo hace el cambio de pesos chilenos a Dolares o Euros , y muestra la
     * conversion por pantalla .
     * @param cuentaBancariaCliente : una instancia de la clase CuentaBancariaCliente de la cual se utilizara su
     *                              metodo getter para  devolver el saldo de esa cuenta para su posterior
     *                              conversion de moneda.
     * @param conversor : Puede ser la instancia de una de las 2 clases que se extienden de la clase abstracta
     *                    ConversorMoneda , que puede ser las clase ConvertirEuro o ConvertirDolar las cuales heredan
     *                    el metodo abstracto ConvertirPesosChile.
     * @param moneda : Es un string que indicara por pantalla al usuario a que tipo de moneda se convertio el saldo de
     *               la cuenta bancaria del cliente.
     */
    public void cambiarMonedaSaldo(CuentaBancariaCliente cuentaBancariaCliente , ConversorMoneda conversor, String moneda){

        System.out.println("****************************************************************");
        System.out.println("**| SU SALDO EN " + moneda + " : " +
                conversor.convertirPesosChile(cuentaBancariaCliente.getSaldoCliente()));
        System.out.println("****************************************************************");

    }

    /**
     * Metodo buscarClienteEnAdministradordeCuentas : Metodo que busca si una cuenta bancaria de cliente ha sido creada
     * o no. Lo que primero hace es buscar en el  array-list que maneja el objeto  administradorCuentasBancarias, si
     * el mail del cliente existe en el arraylist , luego comparara la contraseña,  si coicide con la que el usuario
     * ingreso por el sistema.
     *
     * @param mailCliente : es el mail que se buscara en el array-list de la instancia de la clase
     *                    administradorCuentasBancarias.
     * @param passwordCuentaCliente : Contraseña que tiene que debe hacer match con la cuenta que hace referencia
     *                              el parametro mailCliente.
     * @param administradorCuentasBancarias : instancia de la clase AdministradorCuentasBancarias, que es el que
     *                                     contiene el array-list de las cuentas de los clientes que se han creado
     *                                     en el sistema.
     * @return : instancia de la clase CuentaBancariaCliente que coincide con los parametros mailCliente y
     * passwordCuentaCliente que se le pasaron al metodo en cuestion(buscarClienteEnAdministradordeCuentas).
     */
    private CuentaBancariaCliente buscarClienteEnAdministradordeCuentas(String mailCliente,
                                                                        String passwordCuentaCliente,
                                                                        AdministradorCuentasBancarias administradorCuentasBancarias) {

      CuentaBancariaCliente cuentaBancariaCliente =  administradorCuentasBancarias.buscarClienteporMail(mailCliente);
      boolean clienteMatch = false;
        if ( cuentaBancariaCliente != null ){
            if (cuentaBancariaCliente.getPasswordCuenta().compareTo(passwordCuentaCliente) == 0){
                clienteMatch = true;
            }else {
                System.out.println("La contraseña es incorrecta , intente ingresar con otra contraseña.");
                System.out.print("Presione ENTER para continuar:");
                scanner.nextLine();
            }
        }else {
            System.out.println("El usuario ingresado no esta registrado como cliente, se recomienda crear una cuenta ");
            System.out.print("Presione ENTER para continuar:");
            scanner.nextLine();
        }

        return ( cuentaBancariaCliente != null && clienteMatch ) ? cuentaBancariaCliente : null;
    }

    /**
     * Metodo validarMovimientosCuentaBancaria : Es un metodo  utilitario para asegurarse que el usuario que esta
     * interactuando con el sistema ingrese por teclado  un valor double positivo mayor que 0. Si no es asi,
     * no podra salir del loop;
     * @return retorna una valor double positivo mayor que 0 .
     */
    private double  validarMovimientosCuentaBancaria() {
        double num;

        do {
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("No es un valor numerico valido ");
                System.out.print("Intenta nuevamente ingresar un valor numerico valido  : ");
            }
            num = scanner.nextDouble();
            if(num <= 0 ){
                System.out.println(" No se permite realizar movimientos con numeros negativos o 0 ");
                System.out.print("Intenta nuevamente ingresar un monto de dinero valido : ");

            }
        }while (num < 0);

        return  num ;
    }


    /**
     * Metodo validarDineroCuentaBancaria : Se utiliza para asegurarse que al crear una cuenta bancaria esta sea
     * creada con un saldo igual  o superior a 10.000 pesos chilenos , puesto que este es un requisito para la
     * creacion de una cuenta bancaria en el sistema.
     *
     * @return retorna un numero tipo  double positivo mayor o igual a 10.000 pesos chilenos, que es el valor de
     * dinero ingresado por el usuario como saldo inicial de la cuenta al momento de crearla.
     */
    private double  validarDineroCuentaBancaria() {
        double num;
        do {
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("No es un valor numerico valido ");
                System.out.print("Intenta nuevamente ingresar un valor numerico valido para crear la cuenta : ");
            }
            num = scanner.nextDouble();
            if(num < 10000){
                System.out.println(" El monto para abrir la cuenta no es suficiente ( > 10.000 pesos) ");
                System.out.print("Intenta nuevamente ingresar una opcion : ");
            }
        }while (num < 10000);

        return  num ;
    }

    /**
     * Metodo validarIngresoOpciones: Metodo utilitario , que permite asegurar  que el usuario esta ingresando una
     * opcion validad , o sea una opcion que sea un numero entero positivo no mayor al numero de opciones que se
     * le indica con el parametro numerodeOpciones.
     * @param numerodeOpciones: es el numero maximo que el usuario puede ingresar por el sistema, ya que es el numero
     *                       de opciones que tiene el menu que utiliza este metodo.
     * @return retorna un numero entero positivo igual o menor al parametro numerodeOpciones.
     */

    public int validarIngresoOpciones(int numerodeOpciones ){
        int num;
        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("NO ES UNA OPCION VALIDA ");
                System.out.print("Intenta nuevamente ingresar una opcion : ");
            }
            num = scanner.nextInt();
            if(num <= 0 || num > numerodeOpciones){
                System.out.println("NO ES UNA OPCION VALIDA ");
                System.out.print("Intenta nuevamente ingresar una opcion : ");
            }
        }while (num <= 0 || num > numerodeOpciones);
        //  scanner.close();
        return  num ;
    }


}
