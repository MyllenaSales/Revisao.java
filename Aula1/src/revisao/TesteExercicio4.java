package revisao;
import java.util.Scanner;

public class TesteExercicio4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio4 e5 = new Exercicio4();
		System.out.print("Digite um valor e descubra se é par ou ímpar: ");
		e5.setValor(input.nextDouble());
		
		e5.retornoValor();
	}

}
