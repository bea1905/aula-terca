package src.main.java;

public class Dvd {
	private String titulo;
	private String sinopse;
	private Genero genero = new Genero();
	
	private Pessoa atorPricipal = new Pessoa();
	private Pessoa diretor = new Pessoa();
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Pessoa getAtorPricipal() {
		return atorPricipal;
	}
	public void setAtorPricipal(Pessoa atorPricipal) {
		this.atorPricipal = atorPricipal;
	}
	public Pessoa getDiretor() {
		return diretor;
	}
	public void setDiretor(Pessoa diretor) {
		this.diretor = diretor;
	}
	@Override
	public String toString() {
		return "DVD: " + getTitulo();
	}
	
	
	
}
