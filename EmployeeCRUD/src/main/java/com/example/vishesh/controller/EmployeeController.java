package com.example.vishesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.vishesh.dao.EmpRepo;
import com.example.vishesh.model.Employee;
@Controller
public class EmployeeController {

	@Autowired
	EmpRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(Employee emp) {
		repo.save(emp);
		return "home.jsp";
	}
	
	@GetMapping("/showEmployee")
	public ModelAndView showEmployee(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("showEmployee.jsp");
		Employee employee=repo.findById(id).orElse(null);
		mv.addObject(employee);
		return mv;
	}
	
	@GetMapping("/Employees")
	@ResponseBody
	public List<Employee> showAllEmployee() {
		
		return repo.findAll();
	}
	
	@GetMapping("/Employee/{id}")
	@ResponseBody
	public Employee showAllEmployee(@PathVariable("id") int id) {
		
		return repo.findById(id).orElse(null);
	}
	
	@DeleteMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("deleteEmployee.jsp");
		Employee employee= repo.getOne(id);
		repo.delete(employee);
		return mv;
	}
	
}
