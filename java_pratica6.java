package java_praticas_genbr;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class java_pratica6 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String nome;

		do {
			System.out.println("\n");
			System.out.println("\n	Menu	");
			System.out.println("1: Adicionar um novo cliente na fila");
			System.out.println("2: Listar todos os clientes na fila");
			System.out.println("3: Chamar um cliente");
			System.out.println("0: Sair");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println(nome + " foi adicionado/a à fila.");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nNão há clientes na fila.");
				} else {
					System.out.println("\nFila atualizada:");
					System.out.println(fila);
				}
				break;
			case 3:
				System.out.println("\nPróximo cliente: " + fila.remove());
				break;
			}

		} while (opcao != 0);
		System.out.println("\nSistema encerrado.");

		leia.close();

	}
}
