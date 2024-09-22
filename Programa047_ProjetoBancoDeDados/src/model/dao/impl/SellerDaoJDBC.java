package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DBException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {
	private Connection conn;

	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller obj) {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("insert into seller " + "(nome_seller, email,bithDate,baseSalary,id_department)"
					+ "values" + "(?,?,?,?,?)");
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getEmail());
			ps.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			ps.setDouble(4, obj.getBaseSalary());
			ps.setInt(5, obj.getDepartment().getId());
			int rowAffected = ps.executeUpdate();
			System.out.println(rowAffected);
			
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
		}
	}

	@Override
	public void update(Seller obj) {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("update seller "
					+ "set nome_seller=?, email=?, bithDate=?, baseSalary=?, id_department=? "
					+ "where id=?");
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getEmail());
			ps.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			ps.setDouble(4, obj.getBaseSalary());
			ps.setInt(5, obj.getDepartment().getId());
			ps.setInt(6, obj.getId());
			int rowAffected = ps.executeUpdate();
			System.out.println(rowAffected);
			
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
		}
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement ps = null;

		try {
			ps = conn.prepareStatement("delete from seller where id=?");
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
		}
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conn.prepareStatement("SELECT seller.*,department.nome_department " + "from seller JOIN department "
					+ "on seller.id_department=department.id " + "where seller.id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				Department dep = instantieteDepartment(rs);

				Seller obj = instantieteSeller(rs, dep);

				return obj;
			} else {
				return null;
			}
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(ps);
		}
	}

	private Seller instantieteSeller(ResultSet rs, Department dep) throws SQLException {
		Seller obj = new Seller();
		obj.setId(rs.getInt("id"));
		obj.setName(rs.getString("nome_seller"));
		obj.setEmail(rs.getString("email"));
		obj.setBaseSalary(rs.getDouble("baseSalary"));
		obj.setBirthDate(rs.getDate("bithDate"));
		obj.setDepartment(dep);
		return obj;
	}

	private Department instantieteDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("id_department"));
		dep.setNome(rs.getString("nome_department"));
		return dep;
	}

	@Override
	public List<Seller> findAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement("Select seller.*,department.nome_department from seller join department "
					+ "on seller.id_department = department.id " + "order by seller.nome_seller");
			rs = ps.executeQuery();

			List<Seller> sellers = new ArrayList<>();
			Department dep = new Department();
			while (rs.next()) {
				dep = instantieteDepartment(rs);
				Seller seller = instantieteSeller(rs, dep);
				sellers.add(seller);
			}
			return sellers;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(ps);
		}
	}

	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement("Select seller.*,department.nome_department from seller join department "
					+ "on seller.id_department = department.id " + "where department.id = ? "
					+ "order by seller.nome_seller");
			ps.setInt(1, department.getId());
			rs = ps.executeQuery();
			List<Seller> sellers = new ArrayList<>();
			if (department.getNome() == null && rs.next()) {
				department.setNome(rs.getString("nome_department"));
			}

			rs = ps.executeQuery();
			while (rs.next()) {
				Seller seller = instantieteSeller(rs, department);
				sellers.add(seller);
			}
			return sellers;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(ps);
		}
	}

}
