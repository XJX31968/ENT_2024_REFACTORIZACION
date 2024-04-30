package combineMethod1;

public class Calculadora {
	
	
	/**
	 * codigo de suma 
	 * codigo de resta
	 */
	public static final int SUMA = 1000;
	public static final int RESTA = 2000;
	
	
	/**
	 * Operacion para sumar o restar
	 * @param operador1 el primer operador
	 * @param operador2 el segundo operador
	 * @param operacion dependiendo de si es suma o resta hara su respectiva operacion
	 * @return devuelve el resultado
	 * @throws Exception en caso de que no sea ninguno de los 2 códigos devuelve una excepcion de error
	 */
	
	public int Operacion(int operador1, int operador2, int operacion) throws Exception {
		
		switch(operacion) {
		
		case SUMA: return operador1+operador2;
		case RESTA: return operador1-operador2;
		default: throw new Exception("operacion incorrecta");
		}
	}
	

		}
	

