package co.edu.uelbosque.swii.calculadora;

public class Dividir implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.dividir(a,b);
	}

	private double dividir(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
