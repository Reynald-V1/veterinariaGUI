package visao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.sql.SQLException;
import dominio.*;
import persistencia.*;

public class VetController {
	
	private ObservableList<Funcionario> funcionarios = FXCollections.observableArrayList();
	private ObservableList<Cliente> clientes = FXCollections.observableArrayList();
	private ObservableList<Animal> animais = FXCollections.observableArrayList();
	

	    @FXML
	    private AnchorPane pesqClien;
	
		@FXML
	    private Button AltAnimal;

	    @FXML
	    private Button AltCliente;

	    @FXML
	    private Button AltFuncionario;
	    
	    @FXML
	    private Button BuscCliente;

	    @FXML
	    private Button BuscFuncionario;

	    @FXML
	    private Button CDclienteanimal;

	    @FXML
	    private Button CDfunc;

	    @FXML
	    private TextField CPF_func;

	    @FXML
	    private TextField CPFclien;

	    @FXML
	    private AnchorPane ClienRegistrar;

	    @FXML
	    private Button Dadoclien;

	    @FXML
	    private Button Dadofunc;

	    @FXML
	    private Button DelCliente;

	    @FXML
	    private Button DelFuncionario;

	    @FXML
	    private AnchorPane FuncRegistrar;

	    @FXML
	    private TableView<Funcionario> TBLfuncRelatorio;
	    
	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLCPF;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLEndereço;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLFunção;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLNascimento;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLSalario;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLSexo;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLTelefone;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLnome;
	    
	    
	    
	    
	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLCPFP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLEndereçoP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLFunçãoP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLNascimentoP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLSalarioP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLSexoP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLTelefoneP;

	    @FXML
	    private TableColumn<Funcionario, String> FuncTBLnomeP;

	    
	    
	    
	    
	    @FXML
	    private TextField NascimentoAnim;

	    @FXML
	    private TextField NascimentoClien;

	    @FXML
	    private TextField NomeAnim;

	    @FXML
	    private TextField NomeClien;

	    @FXML
	    private AnchorPane RelatorioFunc;

	    @FXML
	    private TextField SexoAnim;

	    @FXML
	    private TextField SexoClien;

	 

	    @FXML
	    private TextField TelClien;

	    @FXML
	    private TextField endereço_func;

	    @FXML
	    private Text erroCadFunc;
	    
	    @FXML
	    private Text ErroBuscaCliente;
	    
	    @FXML
	    private Button ExcluirFuncok;
	    
	    @FXML
	    private Text erroClien;

	    @FXML
	    private TextField especie;

	    @FXML
	    private TextField estado;

	    @FXML
	    private CheckBox feminino;
	    
	    @FXML
	    private TextField CPFfuncExclude;
	    
	    @FXML
	    private TextField CPFclienteExclude;
	    
	    @FXML
	    private Text ErroExcluirCliente;
	    
	    @FXML
	    private Text ErroDeletarFuncionario;
	    
	    @FXML
	    private Button ExcluirCliente;
	    
	    @FXML
	    private AnchorPane ExcludeCliente;
	    
	    @FXML
	    private AnchorPane ExcludeFunc;
	    
	    @FXML
	    private TextField função;

	    @FXML
	    private CheckBox masculino;

	    @FXML
	    private AnchorPane menu;

	    @FXML
	    private TextField nascimento_func;

	    @FXML
	    private TextField nome_func;
	    
	    @FXML
	    private TextField SexoFunc;

	    @FXML
	    private Button ok_clien;

	    @FXML
	    private Button ok_func;

	    @FXML
	    private TextField raça;

	    @FXML
	    private TextField salario;

	    @FXML
	    private TextField telefone_func;

	    @FXML
	    private Button voltar;
	    
	    @FXML
	    private Text ErroBuscarFuncionario;

	    @FXML
	    private Button voltar2;
	    
	    @FXML
	    private Button voltar3;
	    
	    @FXML
	    private Button voltar4;
	    
	    @FXML
	    private Button voltar5;
	    
	    @FXML
	    private Button voltar6;
	    
	    @FXML
	    private Button voltar7;

	    
	    @FXML
	    private Button BuscaFuncionario;

	    @FXML
	    private Button voltarClien;
	    
	    @FXML
	    private TableColumn<Cliente, String> ClienTBLCPF;

	    @FXML
	    private TableColumn<Cliente, String> ClienTBLnascimento;

	    @FXML
	    private TableColumn<Cliente, String> ClienTBLnome;

	    @FXML
	    private TableColumn<Cliente, String> ClienTBLsexo;

	    @FXML
	    private TableColumn<Cliente, String> ClienTBLtelefone;
	    
	    @FXML
	    private TableView<Cliente> TBLClienRelatorio;
    
	    @FXML
	    private AnchorPane RelatorioClien;
	    
	    @FXML
	    private AnchorPane pesquisaFuncionario;
	    
	    @FXML
	    private TableView<Funcionario> TBLfuncPesquisa;

	    @FXML
	    private TextField CPFbuscFunc;
	    
	    @FXML
	    private TableView<Animal> AnimalPesquisa;
	    
	    @FXML
	    private TableColumn<Animal, String> especieAnimP;
	    @FXML
	    private TableColumn<Animal, String> nascimentoAnimP;
	    @FXML
	    private TableColumn<Animal, String> raçaAnimP;
	    @FXML
	    private TableColumn<Animal, String> sexoAnimP;
	    @FXML
	    private TableColumn<Animal, String> nomeAnimP;
	    @FXML
	    private TableColumn<Animal, String> estadoAnimP;
	    @FXML
	    private TableColumn<Animal, String> CPFdonoP;
	    @FXML
	    private TableColumn<Animal, String> estadoP;
	    
	    
	    
	    @FXML
	    private TableView<Cliente> TBLClienPesquisa;

	    @FXML
	    private TableColumn<Cliente, String> ClienTBLCPFP;

	    @FXML
	    private TableColumn<Cliente, String> ClienTBLnascimentoP;
	    
	    @FXML
	    private TableColumn<Cliente, String> ClienTBLnomeP;
	    
	    @FXML
	    private TableColumn<Cliente, String> ClienTBLsexoP;
	    
	    @FXML
	    private TableColumn<Cliente, String> ClienTBLtelefoneP;
	    
	    @FXML
	    private TextField CPFbuscClien;
	    
	    @FXML
	    private Button BuscarClien;
	    
	    
   ///////////////Cadasatro Clliente/////////////////////////////////////////////////////////////
    @FXML
    void ClienCadastro(ActionEvent event) {
    	this.ClienRegistrar.setVisible(true);
    	this.menu.setVisible(false);
    }
    
    @FXML
    void CadastrarClienOk(ActionEvent event) throws SQLException {
    	Cliente clien = new Cliente();
    	ClienteDAO clienDAO = new ClienteDAO();
    	Animal anim = new Animal();
    	AnimalDAO animDAO = new AnimalDAO();
    	
    clien.setCPF(CPFclien.getText());
    
    if (clienDAO.pesquisa(CPF_func.getText())==null){
		
		erroClien.setText("registrado");
		erroClien.setVisible(true);
		
		clien.setCPF(CPFclien.getText());
		clien.setNome(NomeClien.getText());
		clien.setNascimento(NascimentoClien.getText());
		clien.setTelefone(TelClien.getText());
		clien.setSexo(SexoClien.getText());
		clienDAO.saveCliente(clien);
		
		//////////////CPF dono em animal///////////////////
		anim.setCPF_dono(CPFclien.getText());
		//////////////////////////////////////////////////
		
		anim.setEspecie(especie.getText());
		anim.setRaça(raça.getText());
		anim.setNome(NomeAnim.getText());
		anim.setNascimento(NascimentoAnim.getText());
		anim.setEstado(estado.getText());
		anim.setSexo(SexoAnim.getText());
		
		animDAO.saveAnimal(anim);
		
    }
    }
    
    ///////////////////////////DADOS CLIENTE/////////////////////////////////////////
	
    @FXML
	    void DadosClien(ActionEvent event) {
    	
    	
    	ClienteDAO clienDAO = new ClienteDAO();
    	
    	this.menu.setVisible(false);
    	this.RelatorioClien.setVisible(true);
    	clientes.clear();
    	
    	
    	ClienTBLCPF.setCellValueFactory(new PropertyValueFactory<>("CPF"));
    	
    	ClienTBLnascimento.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
    	
    	ClienTBLsexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
    	
    	ClienTBLtelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
    	
    	ClienTBLnome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    	
    	    	
    	clientes.addAll(clienDAO.getCliente());
    	
    	TBLClienRelatorio.setItems(clientes);
	    }
	 
	 
	 
   //////////////////////////CADASTRO FUNCIONARIO///////////////////////////////////////////////////

   
    
    @FXML
    void FuncCadastro(ActionEvent event) {
    	this.menu.setVisible(false);
    	this.FuncRegistrar.setVisible(true);
    } 
    @FXML
    void cadastrarFuncOk(ActionEvent event) throws SQLException {
    	
    	Funcionario func = new Funcionario();
    	FuncionarioDAO funcDAO = new FuncionarioDAO();
    	func.setCPF(CPF_func.getText());
    	if (funcDAO.pesquisa(CPF_func.getText()) == null) {
    		
			System.out.println("fisos");
    		erroCadFunc.setText("registrado");
			erroCadFunc.setVisible(true);		
			func.setNome(nome_func.getText());
			func.setCPF(CPF_func.getText());
			func.setEndereço(endereço_func.getText());
			func.setFunção(função.getText());
			func.setNascimento(nascimento_func.getText());
			func.setSalario(salario.getText());
			func.setTelefone(telefone_func.getText());
			func.setSexo(SexoFunc.getText());
			
			funcDAO.saveFuncionario(func);
			
			
    	}else {
    		
    		func.getCPF();
    		erroCadFunc.setText("erro");
			erroCadFunc.setVisible(true);
		}
    	
    	
    }
    
/////////////////////////DADOS DO FUNCIONARIO/////////////////////
    
    
    @FXML
    void dadosFunc(Event event) {
    	this.menu.setVisible(false);
    	this.RelatorioFunc.setVisible(true);
    	funcionarios.clear();
    	
    	FuncionarioDAO funcDAO = new FuncionarioDAO();
    	this.menu.setVisible(false);
    	this.RelatorioFunc.setVisible(true);
    	FuncTBLCPF.setCellValueFactory(new PropertyValueFactory<>("CPF"));
    	FuncTBLEndereço.setCellValueFactory(new PropertyValueFactory<>("endereço"));
    	FuncTBLFunção.setCellValueFactory(new PropertyValueFactory<>("função"));
    	FuncTBLNascimento.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
    	FuncTBLSalario.setCellValueFactory(new PropertyValueFactory<>("salario"));
    	FuncTBLSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
    	FuncTBLTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
    	FuncTBLnome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    	
    	
    	
    	funcionarios.addAll(funcDAO.getFuncionario());
    	TBLfuncRelatorio.setItems(funcionarios);
    }
    
    
    
    //////////////////////buscar Funcionario////////////////////////////
    
    

    @FXML
    void buscarFunc(ActionEvent event) {
    	this.menu.setVisible(false);
    	this.pesquisaFuncionario.setVisible(true);
    	
    }
    
    @FXML
    void PesquisaFunc(ActionEvent event) {
    	if (!CPFbuscFunc.getText().equals("")) {
    		
    		
			Funcionario func = new Funcionario();
			FuncionarioDAO funcDAO = new FuncionarioDAO();
			
			func = funcDAO.pesquisa(CPFbuscFunc.getText());
			
			if (func == null) {
				////erro 
				ErroBuscarFuncionario.setText("Erro");
				ErroBuscarFuncionario.setVisible(true);
			}else {
				////sucesso
				
				FuncTBLCPFP.setCellValueFactory(new PropertyValueFactory<>("CPF"));
		    	FuncTBLEndereçoP.setCellValueFactory(new PropertyValueFactory<>("endereço"));
		    	FuncTBLFunçãoP.setCellValueFactory(new PropertyValueFactory<>("função"));
		    	FuncTBLNascimentoP.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
		    	FuncTBLSalarioP.setCellValueFactory(new PropertyValueFactory<>("salario"));
		    	FuncTBLSexoP.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		    	FuncTBLTelefoneP.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		    	FuncTBLnomeP.setCellValueFactory(new PropertyValueFactory<>("nome"));
		    	
		    	
		    	
		    	funcionarios.clear();
		    	funcionarios.addAll(funcDAO.pesquisa(func.getCPF()));
		    	TBLfuncPesquisa.setItems(funcionarios);
			}
    	
    	}	
    	
    }
    
    
    
    /////////////////////////excluir funcionario///////////////////////////////////
    @FXML
    void excluirFuncTela(ActionEvent event) {
    	this.menu.setVisible(false);
    	this.ExcludeFunc.setVisible(true);
    }
    @FXML
    void ExcluirFuncionario(ActionEvent event){
    	
    	Funcionario func = new Funcionario();
    	FuncionarioDAO funcDAO = new FuncionarioDAO();
    	
    	func = funcDAO.pesquisa(CPFfuncExclude.getText());
    	if(func==null) {
    		func = new Funcionario();
    		ErroDeletarFuncionario.setText("Erro");
    		ErroDeletarFuncionario.setVisible(true);
    	}else {
    		ErroDeletarFuncionario.setText("sucesso");
    		ErroDeletarFuncionario.setVisible(true);
    		funcDAO.excluir(CPFfuncExclude.getText());
    	
    	}
    }
    
    ////////////////////////excluir cliente////////////////////////
    @FXML
    void ExcluirClienteMenu(ActionEvent event) {
    	ExcludeCliente.setVisible(true);
    	menu.setVisible(false);
    	ErroExcluirCliente.setText("este processo tambem apaga os animais do cliente");
		ErroExcluirCliente.setVisible(true);

    }
    @FXML
    void ExcluirCliente(ActionEvent event) {	
    	Cliente clien = new Cliente();
    	ClienteDAO clienDAO = new ClienteDAO();
    	AnimalDAO animDAO = new AnimalDAO();
    	
		clien = clienDAO.pesquisa(CPFclienteExclude.getText());
				
    	if (clien==null) {
    		clien = new Cliente();
    		ErroExcluirCliente.setText("Erro");
    		ErroExcluirCliente.setVisible(true);
    		    		
    	}else {
    		
    		ErroExcluirCliente.setText("sucesso");
    		ErroExcluirCliente.setVisible(true);
    		animDAO.excluir(CPFclienteExclude.getText());
    		clienDAO.excluir(CPFclienteExclude.getText());
    	
    	}
    }
    
    
/////////////////////////////Pesquisa cliente e animal////////////////
    
    
    @FXML
    void ProcurarCliente(ActionEvent event) {
    	this.pesqClien.setVisible(true);
    	this.menu.setVisible(false);
    }
    
    
    
    
    @FXML
    void PesquisaClien(ActionEvent event) {
    	if (!CPFbuscClien.getText().equals("")) {
    		
    		ClienteDAO clienDAO = new ClienteDAO();
    		Cliente clien = new Cliente();
    		AnimalDAO animDAO = new AnimalDAO();
    		
    		clien = clienDAO.pesquisa(CPFbuscClien.getText());
    		
    		if (clien == null) {
			
    			 ErroBuscaCliente.setText("erro");
				 ErroBuscaCliente.setVisible(true);	
			
				
    		}else {
		    	
		    	
		    	
		    	ClienTBLCPFP.setCellValueFactory(new PropertyValueFactory<>("CPF"));
		    	ClienTBLnascimentoP.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
		    	ClienTBLsexoP.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		    	ClienTBLnomeP.setCellValueFactory(new PropertyValueFactory<>("nome"));
		    	ClienTBLtelefoneP.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		    	
		    	nomeAnimP.setCellValueFactory(new PropertyValueFactory<>("nome"));
		    	nascimentoAnimP.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
		    	raçaAnimP.setCellValueFactory(new PropertyValueFactory<>("raça"));
		    	especieAnimP.setCellValueFactory(new PropertyValueFactory<>("especie"));
		    	sexoAnimP.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		    	estadoP.setCellValueFactory(new PropertyValueFactory<>("estado"));
		    	CPFdonoP.setCellValueFactory(new PropertyValueFactory<>("CPF_dono"));
		    	
		    	clientes.clear();   
		    	animais.clear();
		    	
		    	clientes.addAll(clienDAO.pesquisa(clien.getCPF()));
		    	animais.addAll(animDAO.pesquisa(clien.getCPF()));
		    	
		    	TBLClienPesquisa.setItems(clientes);
		    	AnimalPesquisa.setItems(animais);
		    	
			}
		}
    }
    
    
    
    
    
    
    
    
    
    
    
///////////////////////////voltar///////////////////////////////////////
    
   

    @FXML
    void voltar(ActionEvent event) {
    	
    	this.FuncRegistrar.setVisible(false);
    	this.RelatorioFunc.setVisible(false);
    	this.ClienRegistrar.setVisible(false);
    	this.RelatorioClien.setVisible(false);
    	this.pesquisaFuncionario.setVisible(false);
    	this.pesqClien.setVisible(false);
    	ErroBuscaCliente.setVisible(false);	
    	erroCadFunc.setVisible(false);
    	erroClien.setVisible(false);
    	ErroExcluirCliente.setVisible(false);
    	ErroBuscarFuncionario.setVisible(false);
    	ErroDeletarFuncionario.setVisible(false);
    	ExcludeFunc.setVisible(false);
    	ExcludeCliente.setVisible(false);
    	this.menu.setVisible(true);
    	
    }

}
	/*FuncionarioDAO funcDAO = new FuncionarioDAO();
    	this.menu.setVisible(false);
    	this.RelatorioFunc.setVisible(true);
    	FuncTBLCPF.setCellValueFactory(new PropertyValueFactory<>("CPF"));
    	FuncTBLEndereço.setCellValueFactory(new PropertyValueFactory<>("endereço"));
    	FuncTBLFunção.setCellValueFactory(new PropertyValueFactory<>("função"));
    	FuncTBLNascimento.setCellValueFactory(new PropertyValueFactory<>("nascimento"));
    	FuncTBLSalario.setCellValueFactory(new PropertyValueFactory<>("salario"));
    	FuncTBLSexo.setCellValueFactory(new PropertyValueFactory<>("sexo_func"));
    	FuncTBLTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
    	FuncTBLnome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    	funcionarios.addAll(funcDAO.getFuncionario());
    	TBLfuncRelatorio.setItems(funcionarios);*/

    