import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	
	private List<Passagem> passagem = new ArrayList<Passagem>();
	
	public List<Passagem> gerarIngresso(int numIngresso){
		for(int i=1; i<=numIngresso;i++ ){
			passagem.add(new Passagem(i,40.00,"Passagem para Belo Horizonte - MG"));

		}
		
		return passagem;
	}
}
