package dominio;

public final class Cliente extends Pessoa {
	private String NomeAnimal;
	private String sexo;
	private String CPF;
	private String telefone;
	private String nome;
	private String nascimento;
	
	public Cliente() {
		
	}
	
	public Cliente(String CPF, String nome, String telefone, String nascimento, String sexo){
		this.CPF = CPF;
		this.sexo = sexo;
		this.telefone = telefone;
		this.nome = nome;
		this.nascimento = nascimento;
	}


	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	
	
	public String getNomeAnimal() {
		return NomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		NomeAnimal = nomeAnimal;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
