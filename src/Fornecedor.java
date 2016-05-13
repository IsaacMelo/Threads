import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	
	private List<Ingresso> ingresso = new ArrayList<Ingresso>();
	
	public void gerarIngresso(int numIngresso){
		for(int i=1; i<=numIngresso;i++ ){
		
			ingresso.add(new Ingresso(i,1.00,"Ingresso jogo"));

		}
	}
}
