package revisao;
import java.util.Scanner;
public class TesteExercicio1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio1 e1 = new Exercicio1();
		System.out.print("Digite um valor e visualize a respectivia tabuada: ");
		e1.setResposta(input.nextInt());
		
		e1.tabuada();
		
	}

}
