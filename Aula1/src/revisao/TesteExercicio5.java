package revisao;
import java.util.Scanner;
public class TesteExercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio5 e5 = new Exercicio5();
		System.out.print("Digite um valor para saber se ele é par ou ímpar, e se é primo: ");
		e5.setNumero(input.nextDouble());
		
		e5.primo();
	}
}
