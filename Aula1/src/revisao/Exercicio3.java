package revisao;

public class Exercicio3 {
	
	private int numero1=1;
	private int numero2=1;
	private int numero=0;
	private int rep=0;
	
	public void sequencia() {

		System.out.print(numero+", ");
		while(rep<=5) {

			System.out.print(numero1+", "+numero2+", ");
			numero1 = numero1+numero2;
			numero2 = numero1+numero2;
			
			rep++;
		}
	}

}
