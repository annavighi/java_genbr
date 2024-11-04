package java_praticas_genbr;

import java.util.Stack;
import java.util.Scanner;

public class java_pratica7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> listaLivros = new Stack<String>();
		
		int opcao;
		String nomeLivro;
		
		do {
			System.out.println("\n");
			System.out.println("\n	Menu	");
			System.out.println("1: Adicionar novo título.");
			System.out.println("2: Lista de livros incluídos.");
			System.out.println("3: Retirar livro.");
			System.out.println("0: Sair");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome do livro: ");
				leia.skip("\\R?");
				nomeLivro = leia.nextLine();
				listaLivros.push(nomeLivro);
				System.out.println(nomeLivro + " foi adicionado à pilha.");
				break;
			case 2:
				if (listaLivros.isEmpty()) {
					System.out.println("\nPilha de livros vazia.");
				} else {
					System.out.println("\nLista atualizada:");
					System.out.println(listaLivros);
				}
				break;
			case 3:
				System.out.println("\n" + listaLivros.pop() + " foi retirado da lista.");
				break;
			}

		} while (opcao != 0);
		System.out.println("\nSistema encerrado.");

		leia.close();

	}
}