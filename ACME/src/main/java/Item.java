
public class Item {
	
	private Produto produto;
	private double quantidade;
	private double valorUnitario;
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	public double calculaSubTotal() {
		double subTotal = quantidade * valorUnitario;
		return subTotal;
	}
	
	

}
