package Loja;

public class Node {

	private Node proximo;
	private Produtos valor;
	
	
	Node() {
		
	}
	
	public Node(Node proximo, Produtos valor) {
		super();
		this.proximo = proximo;
		this.valor = valor;
	}
	
	
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	public Produtos getValor() {
		return valor;
	}
	public void setValor(Produtos valor) {
		this.valor = valor;
	}
	
	
	
}
