package revisao;

public class Exercicio5 {
	
	private Double numero;
	private int i;
	private int contador;
	
	


	public Double getNumero() {
		return numero;
	}




	public void setNumero(Double numero) {
		this.numero = numero;
	}




	public int getI() {
		return i;
	}




	public void setI(int i) {
		this.i = i;
	}




	public int getContador() {
		return contador;
	}




	public void setContador(int contador) {
		this.contador = contador;
	}

	public void primo() {
		if(numero%2==0) {
			System.out.println("É par.");
		}else {
			System.out.println("É ímpar.");
		}
		
		for(i=1;i<=50;i++) {
			
			if(numero%i==0) {
				contador++;
				
			}

		}
		if(contador>2) {
			System.out.println("Não é um valor primo");
		}else {
			System.out.println("É primo.");
		}
	}

}
