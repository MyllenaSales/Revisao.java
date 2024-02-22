package revisao;

public class Exercicio4 {
	
	private Double valor;
	
	
	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}


	public void retornoValor() {
		if(valor%2==0) {
			System.out.println("É par.");
		}else {
			System.out.println("É ímpar.");
		}
	}

}
