package co.edu.uelbosque.swii.calculadora;

public class Resta implements Comando{

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.restar(a, b);
	}
	public double restar(double a, double b){
		return a-b;
	}

}
