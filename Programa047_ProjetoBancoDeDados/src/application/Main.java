
package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====Test Seller FindById=====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("=====Test Seller FindByDepartment=====");

		List<Seller> sellerdep = sellerDao.findByDepartment(new Department(5, null));
		for (Seller x : sellerdep) {
			System.out.println(x);
		}

		//System.out.println("=====Test deleteById=====");
		//sellerDao.deleteById(6);
		
		System.out.println("=====Test Insert=====");
		Department dep= new Department(); 
		Seller vendedor = new Seller();
		dep.setId(3);
		vendedor.setName("Fulano");
		vendedor.setEmail("Fulano@gmail.com");
		vendedor.setBaseSalary(1200.0);
		Date date = new Date();
		vendedor.setBirthDate(date);
		vendedor.setDepartment(dep);
		sellerDao.insert(vendedor);
		
		System.out.println("=====Test Seller FindAll=====");
		sellerdep = sellerDao.findAll();
		for (Seller x : sellerdep) {
			System.out.println(x);
		}
		
		System.out.println("=====Test Seller update=====");
		
		Seller sellerUpdate = sellerDao.findById(13);
		sellerUpdate.setName("Nao e fulano");
		sellerUpdate = sellerDao.findById(14);
		sellerUpdate.setName("Nao e fulano");
		sellerUpdate = sellerDao.findById(15);
		sellerUpdate.setName("Nao e fulano");
		sellerUpdate = sellerDao.findById(16);
		sellerUpdate.setName("Nao e fulano");

		sellerDao.update(sellerUpdate);
		List<Seller> todos=sellerDao.findAll();
		for (Seller x : todos) {
			System.out.println(x);
		}
	}
}
