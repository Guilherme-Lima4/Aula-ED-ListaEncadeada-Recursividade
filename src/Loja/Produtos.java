package Loja;

public class Produtos {

	private String descricao;
	private double valor;
	
	Produtos() {
		
	}
	
	public Produtos(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString(){

	return "Produtos [descricao = " + descricao + ", valor = " + valor + "]";
	}
	
}
