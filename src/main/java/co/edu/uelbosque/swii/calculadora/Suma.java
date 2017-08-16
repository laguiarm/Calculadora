package co.edu.uelbosque.swii.calculadora;

public class Suma implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.sumar(a, b);
	}
	
	public double sumar(double a, double b){
		return a+b;
	}

}
