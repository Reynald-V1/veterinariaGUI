package dominio;
public class Funcionario extends Pessoa {
	private String salario;
	private String endereço;
	private String sexo;
	private String função;//atendente, limpeza, cirugião, assistente.
	private String CPF;
	private String telefone;
	private String nome;
	private String nascimento;
	
	public Funcionario() {
		
	}
	
	
	public Funcionario(String CPF, String nome, String endereço, String telefone, String nascimento, String sexo, String função, String salario){
		this.CPF = CPF;
		this.salario = salario;
		this.endereço = endereço;
		this.sexo = sexo;
		this.função = função;
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

	
	


	
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}