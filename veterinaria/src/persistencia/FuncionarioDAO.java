package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Funcionario;

public class FuncionarioDAO {
	public void saveFuncionario(Funcionario funcionario) throws SQLException {

		String sql = "insert into funcionario(CPF_func, nome_func, endereço_func, telefone_func, nascimento_func, sexo_func, funcao, salario)values(?, ?, ?, ?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(sql);
			prep.setString(1, funcionario.getCPF());
			prep.setString(2, funcionario.getNome());
			prep.setString(3, funcionario.getEndereço());
			prep.setString(4, funcionario.getTelefone());
			prep.setString(5, funcionario.getNascimento());
			prep.setString(6, funcionario.getSexo());
			prep.setString(7, funcionario.getFunção());
			prep.setString(8, funcionario.getSalario());

			prep.execute();

		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());

		} finally {

			////// fecha conexões
			try {
				if (prep != null) {
					prep.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (Exception e) {
				System.out.println("erro: " + e);
			}

		}

	}

////////////////////update///////////////////////////////////////////////////////////////////////////////////////////////////
	public void alterar(Funcionario funcionario) throws SQLException {

		String SQL = "update funcionario set nome_func=?, endereço_func=?, telefone_func= ?, nascimento_func=?, sexo_func=?, funcao=?, salario=? where CPF_func= ?";
		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(SQL);

			prep.setString(1, funcionario.getNome());
			prep.setString(2, funcionario.getEndereço());
			prep.setString(3, funcionario.getTelefone());
			prep.setString(4, funcionario.getNascimento());
			prep.setString(5, funcionario.getSexo());
			prep.setString(6, funcionario.getFunção());
			prep.setString(7, funcionario.getSalario());

			// qual mudar
			prep.setString(8, funcionario.getCPF());

			prep.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (prep != null) {
					prep.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

///////////////////////////////////pesquisar////////////////////////////////////////
public Funcionario pesquisa(String CPF) {
	

		String sql = "SELECT * from funcionario where CPF_func=?";
		Connection con = null;
		PreparedStatement prep = null;
		Funcionario funcionario = null;
		
		try {

			con = Conexão.conectar();
			prep = con.prepareStatement(sql);

			prep.setString(1, CPF);
			ResultSet rs = prep.executeQuery();
			if (rs.next()) {
				funcionario = new Funcionario(rs.getString("CPF_func"), rs.getString("nome_func"),
						rs.getString("endereço_func"), rs.getString("telefone_func"), rs.getString("nascimento_func"),
						rs.getString("sexo_func"), rs.getString("funcao"), rs.getString("salario"));	
					}
			
		con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
			 
		return funcionario;

	}

////////////////////////////excluir/////////////////////////////////////////////

	public void excluir(String cpf) {
		String SQL = "delete from funcionario where CPF_func like ?";
		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(SQL);
			prep.setString(1, cpf);

			prep.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (prep != null) {
					prep.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

/////////relatorio///////////////////////////////////////////////////////
	public List<Funcionario> getFuncionario() {

		String sql = "SELECT * FROM funcionario ";
		List<Funcionario> funcionario = new ArrayList<Funcionario>();
		Connection con = null;
		PreparedStatement prep = null;

		ResultSet lista = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(sql);
			lista = prep.executeQuery();
			while (lista.next()) {
				Funcionario func = new Funcionario();
				func.setCPF(lista.getString("CPF_func"));
				func.setNome(lista.getString("nome_func"));
				func.setTelefone(lista.getString("telefone_func"));
				func.setSexo(lista.getString("sexo_func"));
				func.setNascimento(lista.getString("nascimento_func"));
				func.setEndereço(lista.getString("endereço_func"));
				func.setFunção(lista.getString("funcao"));
				func.setSalario(lista.getString("salario"));
				funcionario.add(func);
			}

		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
		} finally {

			////// fecha conexões
			try {
				if (lista != null) {
					prep.close();
					con.close();
				}
				if (prep != null) {
					prep.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				System.out.println("erro: " + e2.getMessage());
			}

		}
		return funcionario;
	}

}
