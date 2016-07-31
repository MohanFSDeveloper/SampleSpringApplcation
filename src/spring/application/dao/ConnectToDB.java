package spring.application.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.application.vo.EmployeeDetailvo;
@Repository
public class ConnectToDB {

	@Autowired
	private SessionFactory employeeSchema;
	
	Session session = null;
	@Transactional
	public List<EmployeeDetailvo> getEmployeeDetails(){
		List<EmployeeDetailvo> employeeDtls = null;
		try{
			session= employeeSchema.getCurrentSession();
			employeeDtls = session.createQuery("from EmployeeDetailvo").list();
			System.out.println("employeeDtls:::::::"+employeeDtls.size());
			return employeeDtls;
		}catch(Exception e){
			e.getMessage();
		}finally{
			if(session  != null && session.isOpen())
			session.close();
		}
		return null;
	}
}
