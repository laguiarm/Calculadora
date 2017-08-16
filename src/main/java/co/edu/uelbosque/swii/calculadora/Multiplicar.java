package co.edu.uelbosque.swii.calculadora;

public class Multiplicar implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.multiplicar(a,b);
	}

	private double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
