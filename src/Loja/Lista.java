package Loja;

public class Lista {

	private Node primeiro;
	private Node ultimo;
	
	public Lista() {
		primeiro = null; //iniciar a lista
	}
	
	public void adicionar(Produtos valor) {
		Node node = new Node();
		node.setValor(valor);
		
		if(primeiro == null && ultimo == null) {
			primeiro = node;
			ultimo = node;	
		} else {
			ultimo.setProximo(node);
			ultimo = node;
		}
	}
		
		public void exibir() {
			for(Node no=primeiro;no!=null;no=no.getProximo()) {
				System.out.println(no.getValor());
			}
		}
	
	
	
	
	
}
