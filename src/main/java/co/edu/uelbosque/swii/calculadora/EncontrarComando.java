package co.edu.uelbosque.swii.calculadora;

import java.util.HashMap;

public class EncontrarComando {

    private static HashMap<String,Comando> operaciones;
    
	public static Comando cmd(String key) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub
		if(operaciones.containsKey(key))
			return operaciones.get(key);
		throw new ComandoNoEncontradoException();
	}

	public static void addOp(String operador, Comando c) {
		if(operaciones==null)
			operaciones=new HashMap<String, Comando>();
		operaciones.put(operador, c );
		
	}

}
