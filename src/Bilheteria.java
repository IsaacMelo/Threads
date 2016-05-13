import java.util.ArrayList;
import java.util.List;

public class Bilheteria implements Runnable {
	
	private long idThread;
	private List<Ingresso> ingresso;
	static int numero = 99;
	
	public int getNumIngresso(){
		return numero--;
	}
	
	public long getIdThread() {
		return idThread;
	}

	public void setIdThread(long idThread) {
		this.idThread = idThread;
	}

	
	public Bilheteria(List<Ingresso> ingresso){
		this.ingresso = ingresso;
	}
	
	public Bilheteria(int numIngresso){
		gerarIngresso(numIngresso);
	}
	
	public void gerarIngresso(int numIngresso){
		for(int i=1; i<=numIngresso;i++ ){
		
			ingresso.add(new Ingresso(i,1.00,"Ingresso jogo"));

		}
	}
	
	public void imprimirIngresso(Ingresso i){	
		System.out.println("thread: "+getIdThread()
						+"\nNumero: "+i.getNumero()
					    +"\nValor: "+i.getValor()
					    +"\nDescrição: "+i.getDescricao()
					    +"\n\n");
	}
	
	public int getNumeroIngresso(){
		return ingresso.size();
	}
	
	public void venderIngresso(int numIngresso){
		if(getNumeroIngresso() > 0){
			System.err.println(getNumeroIngresso());
			//imprimirIngresso(numIngresso);
			ingresso.remove(numIngresso);

		}else{
			System.out.println("Ingresso esgotado !!");
		}

	}

	public void getIngresso(){

		int index = getNumIngresso();
		if(index > 0){
			
			System.err.println("thread: "+getIdThread()+" - "+index);
			Ingresso i = ingresso.remove(index);
			imprimirIngresso(i);
			;

		}else{
			System.out.println("Ingresso esgotado !!");
		}
	}
	
	public void run() {
		//gerarIngresso(10);
		for(int i=0;i<100;i++){
			//venderIngresso(i);
			getIngresso();
			//System.out.println("Numero: "+i+" thread: "+getIdThread());
		}
	}

}
