package revisao;

public class Exercicio3 {
	
	private int numero1=0;
	private int numero2=1;
	private int numero;
	private int rep=0;
	
	public void sequencia() {
		
		while(rep<=101) {
			
			numero = numero1+numero2;
			System.out.print(numero1+", "+numero2+", "+numero+", ");
			numero1=numero2+numero;
			numero2 =numero+numero1;
		
			rep++;
		}
		
	}

}
