package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class LivroDAO {
	PreparedStatement statement;
	Connection conexao;
	public void inserir(Livro livro) {
		conexao = Conexao.conectar();
		String sql = "INSERT INTO livros(titulo, autor, ano, paginas) VALUES(?,?,?,?)";
		try {
			statement = conexao.prepareStatement(sql);
			statement.setString(1, livro.getTitulo());
			statement.setString(2, livro.getAutor());
			statement.setInt(3, livro.getAno());
			statement.setInt(4, livro.getPaginas());
			statement.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public List<Livro> selecionarTodos(){
		conexao = Conexao.conectar();
		List<Livro> livros = new ArrayList<>();
		String sql = "SELECT * FROM livros";
		ResultSet Resultado = null;
		try {
			statement = conexao.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery(sql);
			while(resultado.next()) {
				Livro livro = new Livro();
				livro.setId(resultado.getInt("ID"));
				livro.setTitulo(resultado.getString("titulo"));
				livro.setAutor(resultado.getString("autor"));
				livro.setAno(resultado.getInt("ano"));
				livro.setPaginas(resultado.getInt("paginas"));
				livros.add(livro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return livros;
	}
	
	public void Excluir(int id) {
		conexao = Conexao.conectar();
		String sql = "DELETE FROM livros WHERE ID=?";
		try {
			statement = conexao.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void Alterar(Livro livro) {
		conexao = Conexao.conectar();
		String sql = "UPDATE livros SET titulo=?,autor=?, ano=?, paginas=? WHERE ID = ?";
		try {
			statement = conexao.prepareStatement(sql);
			statement.setString(1, livro.getTitulo());
			statement.setString(2, livro.getAutor());
			statement.setInt(3, livro.getAno());
			statement.setInt(4, livro.getPaginas());
			statement.setInt(5, livro.getId());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
