package model;

import java.sql.Connection;
import java.sql.SQLException;


public class JDBCExemplo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta!");
		connection.close();
	}
}
