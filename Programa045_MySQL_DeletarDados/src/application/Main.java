package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=DB.getConnection();
			ps=conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "id = ?");
			ps.setInt(1,2);
			
			int rowAffected= ps.executeUpdate();
			System.out.println("Done! Rows affected: "+ rowAffected);
						
		}catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		
	}
}
