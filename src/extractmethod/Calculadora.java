package extractmethod;

public class Calculadora {

	public static final int IMPUESTO_IVA = 1000;
	public static final int IMPUESTO_IEPS = 2000;
	public static final int IMPUESTO_ISR = 3000;
	
	/**
	 * calculamos el impuesto total haciendo uso de codigos y subclases
	 * @param ingresos el parametro de ingresos
	 * @param tipoImpuesto el codigo con el tipo de impuesto
	 * @return devuelve el impuesto dependiendo del codigo
	 * @throws Exception 
	 */
	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception {
		
		
		double impuesto = 0;
		
		if(tipoImpuesto== IMPUESTO_IVA) {
			
			impuesto = calcularIVA(ingresos);
			
		}
		else if(tipoImpuesto == IMPUESTO_IEPS) {
			
			impuesto = calcularIEPS(ingresos);
		}
		else if(tipoImpuesto == IMPUESTO_ISR) {
			
			impuesto = calcularISR(ingresos);
			
		}
		else {
			throw new Exception ("Impuesto no encontrado");
			
		}
		
		
		
	}
	
	
	
	
	
	
}
