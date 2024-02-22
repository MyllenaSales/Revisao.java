package revisao;

public class Exercicio2 {
	
	private Double v1;
	private Double v2;
	private int n;
	private int resposta;
	
	
	
	public Double getV1() {
		return v1;
	}



	public void setV1(Double v1) {
		this.v1 = v1;
	}



	public Double getV2() {
		return v2;
	}



	public void setV2(Double v2) {
		this.v2 = v2;
	}



	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	public int getResposta() {
		return resposta;
	}



	public void setResposta(int resposta) {
		this.resposta = resposta;
	}



	public void calculadora() {
	
			switch(resposta) {
			case 1:
				System.out.println(v1+" + "+v2+" = "+(v1+v2));
				
				break;
			
			case 2:
				
					System.out.println(v1 +" - "+ v2 +" = "+(v1-v2));
	
				break;
			
			case 3:
				
				System.out.println(v1 + " x "+v2 +" = "+ (v1*v2));
				
				break;
			
			case 4:
				
				System.out.println(v1+"/"+v2+" = "+(v1/v2));
			}
		}
}
