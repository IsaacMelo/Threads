import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Passagem> passagem = new ArrayList<Passagem>();
	Fornecedor fornecedor = new Fornecedor();
	passagem = fornecedor.gerarIngresso(120);

	Bilheteria bilheteria1 = new Bilheteria(passagem);
	bilheteria1.setIdThread(1);
	
	Bilheteria bilheteria2 = new Bilheteria(passagem);
	bilheteria2.setIdThread(2);
	
	Thread t = new Thread(bilheteria1);
	t.start();	
	Thread t1 = new Thread(bilheteria2);
	t1.start();	
	

	}

}
