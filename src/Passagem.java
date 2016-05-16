
public class Passagem {

	int numero;
	double valor;
	String descricao;

	public Passagem(int numero,double valor,String descricao){
		this.numero = numero;
		this.valor = valor;
		this.descricao = descricao;		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
