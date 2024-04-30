package shotgunSurgery;

public class OperacionesCliente extends Cliente {
	
	private boolean cambio= false;

	public void setDireccion(String direccion) {
		
		this.direccion=direccion;
		
	}
	
	public void setCorreo(String correo) {
		
		
		this.correo=correo;
	}

	public OperacionesCliente(boolean cambio) {
		super(direccion, correo);
		this.cambio = cambio;
		
	}
	
	
	
	
	
	
}
