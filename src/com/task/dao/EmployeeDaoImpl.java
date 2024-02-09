package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst = null;
    public static Connection connection = null;

	
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int empId = bean.getEmpid();
		String empName= bean.getEmpname();
		String empAddress= bean.getEmpaddress();	
			connection= DBUtil.getDBConnection();
			pst=connection.prepareStatement("insert into emp values(?,?,?)");
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setString(3, empAddress);
			pst.executeUpdate();
			System.out.println("Inserted one record successfully");	
	}
	@Override
	public void updateEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		int empId = bean.getEmpid();
		String empName= bean.getEmpname();
		String empAddress= bean.getEmpaddress();	
			connection= DBUtil.getDBConnection();
			pst=connection.prepareStatement("update emp set empname=? where empid=?");
			
			pst.setString(1, empName);
			pst.setInt(2, empId);
//			pst.setString(3, empAddress);
			pst.executeUpdate();
			System.out.println("Updated record succesfully");
	}
	
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int empId = bean.getEmpid();
		String empName= bean.getEmpname();
		String empAddress= bean.getEmpaddress();	
		 try (
			        Connection connection = DBUtil.getDBConnection();
			        PreparedStatement pst = connection.prepareStatement("SELECT * FROM emp ");
			        ResultSet rs = pst.executeQuery()
			    ) {
			        while (rs.next()) {
			            int id = rs.getInt(1);
			            String name = rs.getString(2);
			            String address = rs.getString(3);

			            System.out.println("Employee ID: " + id + ", Name: " + name + ", Address: " + address);
			        }

			        System.out.println("Selected data successfully");

			    } 
		 catch (ClassNotFoundException | SQLException e) {
			        e.printStackTrace(); // Handle the exception appropriately
			    }	
	}
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int empId = bean.getEmpid();
		String empName= bean.getEmpname();
		String empAddress= bean.getEmpaddress();	
			connection= DBUtil.getDBConnection();
			pst=connection.prepareStatement("delete from emp where empid = ? ");
			pst.setInt(1, empId);
			pst.executeUpdate();
			System.out.println("deleted one record successfully");	
		
		
	}
}
	



