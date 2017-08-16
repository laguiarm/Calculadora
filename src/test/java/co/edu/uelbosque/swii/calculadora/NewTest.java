package co.edu.uelbosque.swii.calculadora;


import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  
  @Test
  public void debeSumarCorrectamente() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("+", new Suma());
	  Comando operacion=EncontrarComando.cmd("+");
	  double resultado=operacion.ejecutarOperacion(3.2, 5);
	  double experado=8.2;
	  Assert.assertEquals(resultado, experado);
  }
  @Test
  public void debeRestarCorrectamente() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("-", new Resta());
	  Comando operacion=EncontrarComando.cmd("-");
	  double resultado=operacion.ejecutarOperacion(10, 5);
	  double experado=5;
	  Assert.assertEquals(resultado, experado);
  }
  @Test
  public void debeMultiplicarCorrectamente() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("*", new Multiplicar());
	  Comando operacion=EncontrarComando.cmd("*");
	  double resultado=operacion.ejecutarOperacion(10, 5);
	  double experado=50;
	  Assert.assertEquals(resultado, experado);
  }
  @Test
  public void debeDividirCorrectamente() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("/", new Dividir());
	  Comando operacion=EncontrarComando.cmd("/");
	  double resultado=operacion.ejecutarOperacion(10, 5);
	  double experado=2;
	  Assert.assertEquals(resultado, experado);
  }
  
  
  @Test(expectedExceptions=ComandoNoEncontradoException.class)
  public void noDebeEncontrarLaOperacionPotencia() throws ComandoNoEncontradoException {
	  Comando operacion=EncontrarComando.cmd("^");
  }
  
  @Test
  public void laOperacionSumaExiste() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("+", new Suma());
	  Comando operacion=EncontrarComando.cmd("+");
	  Assert.assertTrue(operacion instanceof Suma);
  }
  @Test
  public void laOperacionRestaExiste() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("-", new Resta());
	  Comando operacion=EncontrarComando.cmd("-");
	  Assert.assertTrue(operacion instanceof Resta);
  }
  @Test
  public void laOperacionMultiplicacionExiste() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("*", new Multiplicar());
	  Comando operacion=EncontrarComando.cmd("*");
	  Assert.assertTrue(operacion instanceof Multiplicar);
  }
  @Test
  public void laOperacionDivisionExiste() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp("/", new Dividir());
	  Comando operacion=EncontrarComando.cmd("/");
	  Assert.assertTrue(operacion instanceof Dividir);
  }
  
}
