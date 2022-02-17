package dominio;
public class Funcionario extends Pessoa {
	private String salario;
	private String endere�o;
	private String sexo;
	private String fun��o;//atendente, limpeza, cirugi�o, assistente.
	private String CPF;
	private String telefone;
	private String nome;
	private String nascimento;
	
	public Funcionario() {
		
	}
	
	
	public Funcionario(String CPF, String nome, String endere�o, String telefone, String nascimento, String sexo, String fun��o, String salario){
		this.CPF = CPF;
		this.salario = salario;
		this.endere�o = endere�o;
		this.sexo = sexo;
		this.fun��o = fun��o;
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getFun��o() {
		return fun��o;
	}
	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}