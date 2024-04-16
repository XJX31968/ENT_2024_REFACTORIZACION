package ejercicio1;

public class Calculadora {

	    public int sumar(int a, int b) {
	        int resultado = a + b;
	        return resultado;
	    }

	    public int restar(int a, int b) {
	        int resultado = a - b;
	        return resultado;
	    }

	    public int multiplicar(int a, int b) {
	        int resultado = a * b;
	        return resultado;
	    }

	    public int dividir(int a, int b) throws divisionExcepcion  {
	       
	    	
	    	if (b == 0) {
	            
	            throw new divisionExcepcion ("no se puede dividir entre 0");
	        } else {
	            int resultado = a / b;
	            return resultado;
	        }
	    }

	   
	}

	
	
	

