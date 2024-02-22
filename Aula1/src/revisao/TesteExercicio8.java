package revisao;
import java.util.Scanner;
public class TesteExercicio8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio8 e8 = new Exercicio8();
		System.out.println("Vamos calcular se você está lucrando ou tá no prejuizo na venda do seu produto!");
		System.out.print("Digite o preço do produto: ");
		e8.setValor1(input.nextDouble());
		System.out.print("Digite o valor do produto: ");
		e8.setValor2(input.nextDouble());;
		
		e8.lucro();
	}

}
