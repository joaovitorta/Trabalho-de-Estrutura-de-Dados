package TrabalhoAzul;


import java.util.Scanner;

public class Arvore<T extends Comparable> {

	private No raiz;

	public Arvore(){
		this.raiz = null;
	}

	public void adicionar(){

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa:");
		String nome = entrada.next();

		if(this.validateNome(nome)) {
			System.out.println("\n[ERRO] essa pessoa ja existe na arvore, por favor insira um novo registro\n");
			return;
		}

		System.out.println("Digite o CPF:");
		String cpf = entrada.next();


		if(validateCpf(cpf)) {
			System.out.println("\n[ERRO] esse CPF ja existe na arvore, por favor insira um novo registro\n");
			return;
		}


		System.out.println("Digite o telefone:");
		int telefone = entrada.nextInt();
		System.out.println("Digite o email:");
		String email = entrada.next();
		System.out.println("Digite o saldo do cliente:");
		double saldoCliente = entrada.nextDouble();


		Cliente cliente = new Cliente(nome, cpf, telefone, email, saldoCliente);
		No novoNo = new No (cliente);
		if (raiz == null){
			this.raiz = novoNo;
		}else{
			No atual = this.raiz;
			while(true){
				if (novoNo.getCliente().getNome().compareTo(atual.getCliente().getNome()) <0){
					if (atual.getEsquerda() != null){
						atual = atual.getEsquerda();
					}else{
						atual.setEsquerda(novoNo);
						break;
					}
				}else{ //se for maior 
					if (atual.getDireita() != null){
						atual = atual.getDireita();
					}else{
						atual.setDireita(novoNo);
						break;
					}
				}
			}
		}
		System.out.println("Pessoa incluida na arvore com sucesso!\n");
	}

	public No getRaiz() {
		return raiz;
	}

	public void emOrdem(No atual){
		if(this.getRaiz() == null) {
			System.out.println("A arvore ainda nao tem filhos!\n");
		}
		if (atual != null){
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getCliente().getNome());
			emOrdem(atual.getDireita());
		}        
	}

	public void preOrdem(No atual){
		if(this.getRaiz() == null) {
			System.out.println("A arvore ainda nao tem filhos!\n");
		}
		if (atual != null){
			System.out.println(atual.getCliente().getNome());
			preOrdem(atual.getEsquerda());            
			preOrdem(atual.getDireita());
		}        
	}

	public void posOrdem(No atual){
		if(this.getRaiz() == null) {
			System.out.println("A arvore ainda nao tem filhos!\n");
		}
		if (atual != null){            
			posOrdem(atual.getEsquerda());            
			posOrdem(atual.getDireita());
			System.out.println(atual.getCliente().getNome());
		}        
	}

	public boolean validateNome(String nome) {
		// buscar o elemento na �rvore
		No atual = this.raiz;
		while (atual != null) {
			if (atual.getCliente().getNome().equals(nome)) {
				return true;	
			} else if (nome.compareTo(atual.getCliente().getNome()) == -1) { 
				atual = atual.getEsquerda();
			} else {
				atual = atual.getDireita();
			}
		}
		return false;
	}


	public boolean validateCpf(String cpf) {
		// buscar o elemento na �rvore
		No atual = this.raiz;
		while (atual != null) {
			if (atual.getCliente().getCpf().equals(cpf)) {
				return true;	
			} else if (cpf.compareTo(atual.getCliente().getCpf()) == -1) { 
				atual = atual.getEsquerda();
			} else {
				atual = atual.getDireita();
			}
		}
		return false;
	}
	public void consultarDados() {
		Scanner entrada = new Scanner(System.in);
		No atual = this.raiz;
		System.out.println("Qual o nome do cliente que será consultado?");
		String nomeEscolhido = entrada.next();

		while(atual != null) {

			if(atual.getCliente().getNome().equals(nomeEscolhido)) {
				System.out.println("Nome: "+atual.getCliente().getNome());
				System.out.println("CPF: "+atual.getCliente().getCpf());
				System.out.println("Telefone: "+atual.getCliente().getTelefone());
				System.out.println("E-mail: "+atual.getCliente().getEmail());
				System.out.println("Saldo: "+atual.getCliente().getSaldoCliente());
				atual = null;
			}else {
				if (atual.getCliente().getNome().compareTo(nomeEscolhido) >0){
					if (atual.getEsquerda() != null){
						atual = atual.getEsquerda();
					}else{
						System.out.println("Esse nome não existe!");
						break;
					}

				}else{ //se for maior 
					if (atual.getDireita() != null){
						atual = atual.getDireita();
					}else{
						System.out.println("Esse nome não existe!");
						break;
					}
				}
			}
		}
	}
}


