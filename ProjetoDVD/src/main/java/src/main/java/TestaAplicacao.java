package src.main.java;

public class TestaAplicacao {

	public static void main(String[] args) {
	
		Pessoa atorPrincipal = new Pessoa();
		atorPrincipal.setNome("Arnold");
		
		Pessoa diretor = new Pessoa();
		diretor.setNome("Steve");
		
		Genero genero = new Genero();
		genero.setDescricao("Guerra");
		
		Dvd dvd = new Dvd();
		
		dvd.setTitulo("Poeira");
		dvd.setSinopse("Uma sinopse qualquer");
		dvd.setDiretor(diretor);
		dvd.setAtorPricipal(atorPrincipal);
		dvd.setGenero(genero);
		
		System.out.println(dvd.toString());
	

	}

}
