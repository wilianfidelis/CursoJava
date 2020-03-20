package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();

			// EXAMPLE 1:
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);
			
			System.out.print("Digire seu nome: ");
			st.setString(1, sc.next());
			System.out.print("Digire seu e-mail: ");
			st.setString(2, sc.next());
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			System.out.print("Digite seu salario: ");
			st.setDouble(4, sc.nextDouble());
			System.out.print("Digite id do seu departamento: ");
			st.setInt(5, sc.nextInt());

			// EXAMPLE 2:
			//st = conn.prepareStatement(
			//		"insert into department (Name) values ('D1'),('D2')", 
			//		Statement.RETURN_GENERATED_KEYS);

			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		sc.close();
	}
}
