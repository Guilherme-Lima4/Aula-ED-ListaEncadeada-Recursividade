package Loja;

public class Principal {
	
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		Produtos p1 = new Produtos("Leite", 5.00);
		Produtos p2 = new Produtos("Cafe", 18.00);
		
		lista.adicionar(p1);
		lista.adicionar(p2);
		
		lista.exibir();
		
	}

}
