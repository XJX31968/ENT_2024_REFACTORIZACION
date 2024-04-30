package extractmethod;

public class ImpuestoISR extends Impuesto {

	@Override
	public double calcularISR(double ingresos) {
		
		if (ingresos < 50000) {

			impuesto = ingresos * 0.20;

			} else {

			impuesto = ingresos * 0.30;

			}
		
	}

	
	
}
