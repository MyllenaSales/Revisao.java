package revisao;

public class Exercicio8 {
	
	private Double valor1;
	private Double valor2;
	
	
	public Double getValor1() {
		return valor1;
	}


	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}


	public Double getValor2() {
		return valor2;
	}


	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public void lucro() {
		if(valor2>valor1/2) {
			System.out.println("Tá lucrando!");
		}else {
			System.out.println("Tá no prejuizo.");
		}
	}
}
