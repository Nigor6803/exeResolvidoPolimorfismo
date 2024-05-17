package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;
import entidade.EmpregadoTercerizado;

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
			System.out.print("NOME:");
			edd.nextLine();
			String nome = edd.nextLine();
			System.out.print("HORA TRABALHADA:");
			int hora = edd.nextInt();
			System.out.print("VALOR POR HORA:");
			double valorPorHora = edd.nextDouble();
			
			if(ch == 'S') {
				System.out.print("TAXA ADICIONAL:");
				double taxaAdicional = edd.nextDouble();
				
				Empregado emp = new EmpregadoTercerizado(nome, hora, valorPorHora, taxaAdicional);
				lista.add(emp);
			} else {
				Empregado emp = new Empregado(nome, hora, valorPorHora);
				lista.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTO:");
		for (Empregado emp : lista) {
		System.out.println(emp.getNome()+" - $"+String.format("%.2f", emp.pagamento()));
		}
		
		edd.close();

	}

}
