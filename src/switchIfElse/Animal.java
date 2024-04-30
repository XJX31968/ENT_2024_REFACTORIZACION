package switchIfElse;

public class Animal implements Sonido {

public static final int CODIGO_PERRO = 1000;
public static final int CODIGO_GATO = 2000;
public static final int CODIGO_PAJARO = 3000;
	

	private int codigo_animal;
	
	
	
	
	/**
	 * constructor con el codigo del animal
	 * @param codigo_animal que implementamos con un codigo estatico por animal 
	 */
	public Animal(int codigo_animal) {
		super();
		this.codigo_animal = codigo_animal;
	}



	

	public String hacerSonido(int codigo_animal) {
		
		switch(codigo_animal) {
		
		case 1000: return "guau"; 
		case 2000: return "Miau";
		case 3000: return "Pio";
		}
		return "Animal no encontrado";
		
		
		
	}

}
