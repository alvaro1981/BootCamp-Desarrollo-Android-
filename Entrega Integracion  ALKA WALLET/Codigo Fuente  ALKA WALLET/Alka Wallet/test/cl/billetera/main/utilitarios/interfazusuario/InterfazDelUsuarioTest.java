package cl.billetera.main.utilitarios.interfazusuario;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.management.remote.MBeanServerForwarder;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class InterfazDelUsuarioTest {
 //  @BeforeAll

  private final  InterfazDelUsuario interfazDelUsuario = new InterfazDelUsuario();
   Scanner scanner = new Scanner(System.in);

@BeforeAll


@Test

void IngresoOpciones() {
  assertEquals(1,interfazDelUsuario.validarIngresoOpciones(scanner.nextInt()));
}


 /*   void menuCrearCliente() {
    }
*/
    @org.junit.jupiter.api.Test
    void menuCreoExistosamenteCuenta() {
    }

    @org.junit.jupiter.api.Test
    void menuLogearPlataforma() {
    }

    @org.junit.jupiter.api.Test
    void menuMovimientosFinancieros() {
    }

    @org.junit.jupiter.api.Test
    void movimientosDineroCuentaBancaria() {
    }

    @org.junit.jupiter.api.Test
    void cambiarMonedaSaldo() {
    }
}