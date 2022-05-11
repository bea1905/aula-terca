import java.time.LocalDate;
import java.util.ArrayList;

import pessoas.Cliente;

public class Venda {
	
	private int id;
	private LocalDate data;
	private double total;
	private Cliente cliente;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	
	public boolean verificaExiste(int idProduto) {
		
		return true;
	}
	
	
	public void excluirItem() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

}
