package Loja;
import java.util.*;

public class PrincipalFatorial {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int num;
		
		Fatorial fatorial = new Fatorial();
		
		System.out.println("Insira um numero para ser calculado o Fatorial: ");
		num = l.nextInt();
		
		System.out.println("O fatorial do numero e: " + fatorial.fatorialRecursivo(num));

		
	}

}
