package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			// bloqueia atualização automatica, ate dar commit
			conn.setAutoCommit(false);

			int row1 = st.executeUpdate("UPDATE seller SET BaseSalary = 3000 " + "WHERE DepartmentId = 1");
			// int x=1;
			// if(x<2) throw new SQLException("Fake Error");
			int row2 = st.executeUpdate("UPDATE seller SET BaseSalary = 5400 " + "WHERE DepartmentId = 2");

			// autorizando
			conn.commit();

			System.out.println("Done! Rows affected: " + row1);
			System.out.println("Done! Rows affected: " + row2);

		} catch (SQLException e) {
			// rollback é pra voltar ao que estava
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Cause by" + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback");
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}
