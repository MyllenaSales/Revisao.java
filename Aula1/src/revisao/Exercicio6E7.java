package revisao;

public class Exercicio6E7 {
	
	private Double horas;
	private Double valor;
	
	public Double getHoras() {
		return horas;
	}


	public void setHoras(Double horas) {
		this.horas = horas;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public void salario(){
		valor = (horas * 12.25);

		System.out.println("Você deve receber R$" + valor + " referente a quantidade de horas de trabalho indicadas.");
		
		if(valor<50) {
			System.out.println("Dirija-se a direção do hotel!!!");
		}
	}

}
