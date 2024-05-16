package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class Progama {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		List <Empregado> lista = new ArrayList<>();
		
		System.out.print("QUANTIDADE DE EMPREGADOS:");
		int n = edd.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println("EMPREGADO #"+i+":");
			System.out.print("TERCERIZADO:(S/N)");
			char ch = edd.next().charAt(0);
			
		}
		
		edd.close();

	}

}
