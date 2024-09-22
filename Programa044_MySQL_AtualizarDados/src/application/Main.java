package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=DB.getConnection();
			ps=conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
			ps.setDouble(1,200.0);
			ps.setInt(2,2);
			
			int rowAffected= ps.executeUpdate();
			System.out.println("Done! Rows affected: "+ rowAffected);
						
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		
	}
}
