package revisao;
import java.util.Scanner;
public class TesteExercicio6E7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio6E7 e6E7 = new Exercicio6E7();
		System.out.print("Olá, você é porteiro né, quantas horas trabalhou?");
		e6E7.setHoras(input.nextDouble());
		
		e6E7.salario();
	}

}
