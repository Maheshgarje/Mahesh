import java.sql.*;

public class create_database {

	public static void main(String args[]) {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "mahesh";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement smt = con.createStatement();

			String query = "create database book_mangement1 ";

			smt.execute(query);
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}