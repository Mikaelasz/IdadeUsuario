import java.util.Scanner;


public class IdadeUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anoAtual;
		int anoNascimento;
		int idade;
		
		System.out.println("ENTRE COM O SEU ANO ATUAL: ");
		anoAtual = new Scanner(System.in).nextInt();
		
		System.out.println("ENTRE COM A DATA DE NASCIMENTO: ");
		anoNascimento = new Scanner(System.in).nextInt();
		idade = anoAtual - anoNascimento;
		System.out.println("A IDADE ATUAL É: " +idade);
	}

}
