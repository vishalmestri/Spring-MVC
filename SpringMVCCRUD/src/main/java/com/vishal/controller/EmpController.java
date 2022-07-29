package com.vishal.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vishal.model.EmployeeModel;
import com.vishal.service.EmployeeService;

@Controller

//@Scope("request")
public class EmpController {

	
	@Autowired
	EmployeeService employeeService;
	
	
	
	
	private static Logger logger=Logger.getLogger(EmpController.class.toString());
	
	//@ResponseBody
	@GetMapping("/newEmp")
	public String newEmp(@ModelAttribute("empModel") EmployeeModel emp  ) {
		logger.info("Thread-"+Thread.currentThread().getName()+"-newEmp | this="+this);
		

		return "newEmp";
	}
	
	@GetMapping("/empDashboard")
	public String empDashboard(Model model) {
		logger.info("Thread-"+Thread.currentThread().getName()+"-empDashboard | this="+this);
		List<EmployeeModel> list=employeeService.getAllEmployees();
		
		model.addAttribute("listOfEmps", list);
		logger.info("empDashboard|list size ="+list.size());
		return "empDashboard1";
	}
	
	@PostMapping("/processNewEmp")
	public String processNewEmp( @ModelAttribute("empModel") EmployeeModel emp,BindingResult b) {
		logger.info("Thread-"+Thread.currentThread().getName()+"-processNewEmp | this="+this);
		
		logger.info(emp.getName()+"|"+emp.getGender());
		employeeService.addEmployee(emp);
		
		return "redirect:/empDashboard";
	}
}
