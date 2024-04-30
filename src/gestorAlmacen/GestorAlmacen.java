package gestorAlmacen;
import java.util.ArrayList;

import java.util.List;

public class GestorAlmacen {
	
	
	/**
	 * codigo para agregar productos
	 * codigo para eliminar productos
	 */
	public static final int ADD = 1000;
	public static final int REMOVE = 2000;

	
	private List<String> productos = new ArrayList<>();

	
	
	
	/**
	 * operacion para gestionar productos
	 * @param producto el producto en cuestion
	 * @param operacion el codigo de la operacion
	 * @throws Exception Excepcion personalizada
	 */
	public void gestionarProducto (String producto, int operacion) throws Exception {
		
		
		if(productos.contains(producto) && operacion == REMOVE) {
			
			productos.remove(producto);
			
		}
		else if(!productos.contains(producto) && operacion == ADD) {
			
			productos.add(producto);

		}
		else if(operacion==ADD) {
			throw new AddNewException("Imposible añadir, el producto ya estaba");
			
		}
		else if(operacion==REMOVE) {
			throw new removeProductoException("imposible borrar, el prodcuto no esta");
		}
		else throw new defaultException("Operacion no soportada");
		
	}
	
	
	
	
}
