package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat fmt= new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=DB.getConnection();
			ps=conn.prepareStatement(
					
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS
					
					
					/*
					"INSERT INTO department"
					+ "(Name)"
					+ "VALUES "
					+ "(?)" , Statement.RETURN_GENERATED_KEYS
					*/
					
					
					);
			
			//ps.setString(1, "Teste");
			
			ps.setString(1, "Abacaxi");
			ps.setString(2,"fruta@gmail.com");
			ps.setDate(3,new java.sql.Date(fmt.parse("12/03/2003").getTime()));
			ps.setDouble(4,2500.0);
			ps.setInt(5,2);
			
			int rowAffected= ps.executeUpdate();
			System.out.println("Done! Rows affected: "+ rowAffected);
			
			if(rowAffected>0) {
				ResultSet rs= ps.getGeneratedKeys();
				while(rs.next()) {
					int id=rs.getInt(1);
					System.out.println("Done! Id="+id);
				}
			}else {
				System.out.println("No rows affected!");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		
	}
}
