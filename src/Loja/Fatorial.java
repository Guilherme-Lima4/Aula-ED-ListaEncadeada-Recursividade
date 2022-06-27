package Loja;

public class Fatorial {
	
	private int numero;
	
	Fatorial(){
		
	}


	public int fatorialRecursivo(int numero) {
		
		if(numero == 1) {
			return 1;
		} else {
			return numero + fatorialRecursivo(numero - 1);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
