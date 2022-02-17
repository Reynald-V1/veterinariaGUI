package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dominio.Animal;

public class AnimalDAO {
	public void saveAnimal(Animal animal) throws SQLException {
		String sql = "insert into animal(CPF_dono, nome_anim, sexo_anim, raça, espécie, nascimento_anim, estado) values (?, ?, ?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(sql);

			prep.setString(1, animal.getCPF_dono());
			prep.setString(2, animal.getNome());
			prep.setString(3, animal.getSexo());
			prep.setString(4, animal.getRaça());
			prep.setString(5, animal.getEspecie());
			prep.setString(6, animal.getNascimento());
			prep.setString(7, animal.getEstado());

			prep.execute();

		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());

		} finally {
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

///////////////////////////////excluir////////////////////////////////////////
	public void excluir(String CPFdono) {
		String SQL = "delete from animal where CPF_dono like ?";
		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(SQL);
			prep.setString(1, CPFdono);

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

////////////////////////////update////////////////////////////////////////////
	public void alterar(Animal animal) throws SQLException {

		String SQL = "update animal set nome_anim=?, nascimento_anim=?, sexo_anim=?, raça=?, espécie=?, estado=? where CPF_dono= ?";
		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(SQL);

			prep.setString(1, animal.getNome());
			prep.setString(2, animal.getNascimento());
			prep.setString(3, animal.getSexo());
			prep.setString(4, animal.getRaça());
			prep.setString(5, animal.getEspecie());
			prep.setString(6, animal.getEstado());

			// qual mudar
			prep.setString(7, animal.getCPF_dono());

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
	public Animal pesquisa(String CPF) {

		String sql = "SELECT * from animal where CPF_dono=?";
		Connection con = null;
		PreparedStatement prep = null;
		Animal animal = null;

		try {

			con = Conexão.conectar();
			prep = con.prepareStatement(sql);

			prep.setString(1, CPF);
			ResultSet rs = prep.executeQuery();
			if (rs.next()) {
				animal = new Animal(rs.getString("CPF_dono"), rs.getString("nome_anim"), rs.getString("sexo_anim"), rs.getString("raça"), 
						rs.getString("espécie"), rs.getString("nascimento_anim"), rs.getString("estado"));
			}

		con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return animal;

	}

//////////////////mostrar animais///////////////////////////////
	public List<Animal> getAnimal() {
		String sql = "SELECT * FROM animal";
		List<Animal> anim = new ArrayList<Animal>();
		Connection con = null;
		PreparedStatement prep = null;

		ResultSet lista = null;

		try {
			con = Conexão.conectar();

			prep = con.prepareStatement(sql);

			lista = prep.executeQuery();

			while (lista.next()) {
				Animal anima = new Animal();
				anima.setEstado(lista.getString("estado"));
				anima.setNome(lista.getString("nome_anim"));
				anima.setRaça(lista.getString("raça"));
				anima.setSexo(lista.getString("sexo_anim"));
				anima.setNascimento(lista.getString("nascimento_anim"));
				anima.setEspecie(lista.getString("espécie"));
				anima.setCPF_dono(lista.getString("CPF_dono"));
				anim.add(anima);
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
		return anim;
	}

}
