package model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.jsp.tagext.TryCatchFinally;

public class DAO {
	/** Módulo de conexão **/
	// Parâmetro de conexão 
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "1234";
	// Método de conexão 
	 private Connection conectar() {
		 Connection con = null;
		 try {
		     Class.forName(driver);
			 con = DriverManager.getConnection(url, user, password);
			 return con;
		 } catch (Exception e) {
			 System.out.println(e);
			 return null;
		}
	}
	
}
