package revisao;
import java.util.Scanner;
public class TesteExercicio9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio9 e9 = new Exercicio9();
		System.out.print("Digite um número e receba o nome do mês correspondente: ");
		e9.setNumero(input.nextInt());
		
		e9.mes();
	}

}
