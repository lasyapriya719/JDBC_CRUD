
package com.task.ui;
import java.sql.SQLException;
import java.util.Scanner;
import com.task.service.*;
import com.task.bean.EmployeeBean;
public class Demo_CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		System.out.println("1.Insert Employee Data");//create
		System.out.println("2.Update Employee Data");//update
		System.out.println("3.Select Employee Data");//read
		System.out.println("4.Delete Employee Data");//delete
		int option= sc.nextInt();
		switch(option) {
		case 1:
		{
			insertEmployee();
			break;
		}
		case 2:
		{
			updateEmployee();
			break;
		}
		case 3:
		{
		selectEmployee();
			break;
		}
		case 4:
		{
			deleteEmployee();
			break;
		}
		default:
		{
		System.out.println("Option entered does not match");	
		}
		}
		
	}

	

	private static void insertEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpid(105);
		bean.setEmpname("Pagal");
		bean.setEmpaddress("GNT");
		service.insertEmployee(bean);
	}
	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpid(105);
		bean.setEmpname("Athreya");
		service.updateEmployee(bean);
	}
	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeBean bean= new EmployeeBean();
//		bean.setEmpid(101);
		service.selectEmployee(bean);
		
	}
	
	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeBean bean= new EmployeeBean();
		bean.setEmpid(105);
		service.deleteEmployee(bean);
		
	}		

}
