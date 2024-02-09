package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.*;

public  class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		
		dao.insertEmployee(bean);
		
	}

	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao= new EmployeeDaoImpl();
		dao.updateEmployee(bean);
		
	}

	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		dao.selectEmployee(bean);
		
	}
	
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao =new EmployeeDaoImpl();
		dao.deleteEmployee(bean);
	}

	

}
