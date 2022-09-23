package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private static final String url = "jdbc:mysql://localhost:3306/ds_biblioteca?useTimezone=true&serverTimezone=UTC";
	private static final String user = "root";
	private static final String senha = "";
	
	public static Connection conectar() {
		Connection  conexao = null;
		try {
			conexao = DriverManager.getConnection(url,user,senha);
			
			if (conexao != null) {
				System.out.println("ta rodano");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
		
	}
}
