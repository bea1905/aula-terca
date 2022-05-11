package pessoas;
import java.time.LocalDate;

public class Gerente extends Pessoa {
	
	private LocalDate dataContratacao;
	

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
}
