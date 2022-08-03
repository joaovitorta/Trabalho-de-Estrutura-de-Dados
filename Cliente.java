package TrabalhoAzul;

public class Cliente {
	private String nome;
	private String cpf;
	private int telefone;
	private String email;
	private double saldoCliente;

	public Cliente(String nome, String cpf, int telefone, String email, double saldoCliente) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.saldoCliente = saldoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSaldoCliente() {
		return saldoCliente;
	}

	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}


}
