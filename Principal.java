package TrabalhoAzul;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Arvore<String> arvore = new Arvore<String>();

		Arvore<String> arvore = new Arvore();

		Scanner entrada = new Scanner(System.in);
		int input,usuario;
		String senha;

		System.out.println("Digite o usuario:");
		usuario = entrada.nextInt();
		System.out.println("Digite a senha:");
		senha = entrada.next();

		if(senha.compareTo("adminis") == 0 && usuario == 11111) {

			do {
				System.out.println("1-Inserir pessoa na arvore.");
				System.out.println("2-Listar arvore pre-Ordem.");
				System.out.println("3-Listar arvore em Ordem.");
				System.out.println("4-Listar arvore pos-Ordem.");
				System.out.println("5- Consultar dados de um cliente..");
				System.out.println("0-Sair");
				input = entrada.nextInt();

				switch(input) {
				case 0:
					System.out.println("Voce saiu do programa!");
					break;
				case 1:
					arvore.adicionar();
					break;
				case 2:
					arvore.preOrdem(arvore.getRaiz());
					break;
				case 3:
					arvore.emOrdem(arvore.getRaiz());
					break;
				case 4:
					arvore.posOrdem(arvore.getRaiz());
					break;
				case 5:
					arvore.consultarDados();
					break;
				default:
					System.out.println("[ERRO] Opcao invalida, por favor tente novamente!");
					break;
				}

			}while(input != 0);


		}else {
			System.out.println( "Conta incorreta");
		}

	}

}

