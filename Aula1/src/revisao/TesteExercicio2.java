package revisao;
import java.util.Scanner;

public class TesteExercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio2 e2 = new Exercicio2();
		
		System.out.print("Olá, deseja acessar a calculadora?\n1 - Sim\n2 - Não\nResposta: ");
		e2.setN(input.nextInt());
		
		while(e2.getN()==1) {
			System.out.println("\nDigite dois valores que deseja calcular.");
			System.out.print("Valor a: ");
			e2.setV1(input.nextDouble());
			System.out.print("Valor b: ");
			e2.setV2(input.nextDouble());
			System.out.println("\nQue operação você deja realizar?");
			System.out.print("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nResposta: ");
			e2.setResposta(input.nextInt());
			
		e2.calculadora();
		
		System.out.print("\nOlá, deseja acessar a calculadora?\n1 - Sim\n2 - Não\nResposta: ");
		e2.setN(input.nextInt());
	}
	}
}
