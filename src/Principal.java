import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Bilheteria bilheteria = new Bilheteria();
		
	List<Ingresso> ingresso = new ArrayList<Ingresso>();
		
	for(int i=1; i<=100;i++ ){
			
		ingresso.add(new Ingresso(i,1.00,"Ingresso jogo"));
	}

	Bilheteria bilheteria1 = new Bilheteria(ingresso);
	bilheteria1.setIdThread(1);
	
	Bilheteria bilheteria2 = new Bilheteria(ingresso);
	bilheteria2.setIdThread(2);
	
	Thread t = new Thread(bilheteria1);
	t.start();	
	Thread t1 = new Thread(bilheteria2);
	t1.start();	
	
	
	//bilheteria.gerarIngresso();
	//bilheteria.imprimirIngresso();
	//System.out.println(((Bilheteria) bilheteria).getNumeroIngresso());
	//((Bilheteria) bilheteria).venderIngresso(0);
	//System.out.println(((Bilheteria) bilheteria).getNumeroIngresso());
	//((Bilheteria) bilheteria).venderIngresso(0);
	
	System.err.println(ingresso.size());
	
	
	}

}
