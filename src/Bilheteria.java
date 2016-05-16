import java.util.List;

public class Bilheteria implements Runnable {
	
	private long idThread;
	private List<Passagem> passagem;
	
	public long getIdThread() {
		return idThread;
	}

	public Bilheteria(List<Passagem> passagem){
		this.passagem = passagem;
	}
	
	public void setIdThread(long idThread) {
		this.idThread = idThread;
	}
	
	public void imprimirIngresso(Passagem i){
		System.out.println("Bilheretia: "+getIdThread()
						+"\nNumero: "+i.getNumero()
					    +"\nValor: "+i.getValor()
					    +"\nDescrição: "+i.getDescricao()
					    +"\n\n");
	}
	
	public int getNumeroIngresso(){
		return passagem.size(); //Pega o numero de itens na lista
	}
	

	public void venderIngresso(){
		//Verifica se existe passagem na lista 
		if(getNumeroIngresso() > -1){
			//Caso ocorra alguma exeception de index, o sistema não para.
			try{
				Passagem i = passagem.remove(0); // Pega a passagem na lista e depois a remove
				imprimirIngresso(i); //Imprime a Passagem com os dados coletados da lista
				
			}catch(IndexOutOfBoundsException e){
				System.err.println("Bilheretia: "+getIdThread()+" - Passagem não encontada na lista "+e.getMessage());
			}

		}else{
			System.out.println("Bilheretia: "+getIdThread()+" - Passagem esgotado !!");
		}
	}
	
	public void run() {
		for(int i=0;i<120;i++){
			venderIngresso(); //Vende 120 passagem para cada thread
		}
	}

}
