package extractmethod;

public abstract class Impuesto {

	/**
	 * operacion para calcular o el iva, o el ISR o el IEPS
	 * @param ingresos Estos son los ingresos
	 * @return devuelve el impuesto
	 */
	public abstract double calcular(double ingresos);
	
}
