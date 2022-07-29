package com.vishal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.vishal.model.EmployeeModel;

@Service
public class EmployeeService {
	
	private static AtomicInteger currentId=new AtomicInteger(1);
	private static List<EmployeeModel> listOfEmployees=new ArrayList<>();
	
	public void addEmployee(EmployeeModel emp) {
		emp.setId(currentId.getAndIncrement()+"");
		listOfEmployees.add(emp);
	}
	
	
	public List<EmployeeModel>  getAllEmployees() {
		return listOfEmployees;
	}

}
