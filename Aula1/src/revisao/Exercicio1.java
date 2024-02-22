package revisao;

public class Exercicio1 {
	
	private int rep=0;
	private int resposta;
	
	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}

	public void tabuada(){
				
			while(rep<=10) {
				
				System.out.println(resposta+" x "+rep+" = "+(resposta*rep));
				rep++;
			}
	}

}
