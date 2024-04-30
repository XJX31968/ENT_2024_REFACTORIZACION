package extractmethod;

public  class Iva extends Impuesto {

	@Override
	public double calcularIVA(double ingresos) {
		
		if (ingresos < 10000) {

			impuesto = ingresos * 0.10;

			} else if (ingresos >= 10000 && ingresos < 50000) {

			impuesto = ingresos * 0.15;

			} else {

			impuesto = ingresos * 0.20;

			}
	}

	
	
	
}
