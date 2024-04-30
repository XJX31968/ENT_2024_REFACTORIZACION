package extractmethod;

public class ImpuestoIEPS extends Impuesto {

	@Override
	public double calcularIEPS(double ingresos) {
		
		return ingresos * 0.05;
	}

	
	
}
