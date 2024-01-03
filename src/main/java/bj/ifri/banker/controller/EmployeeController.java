package bj.ifri.banker.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bj.ifri.banker.model.Employe;
import bj.ifri.banker.service.EmployeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeService employeeService;

	/**
	 * Read - Get all employees
	 * 
	 * @return - An Iterable object of Employee full filled
	 */
	@GetMapping("/employees")
	public Iterable<Employe> getEmployees() {
		return employeeService.getEmployees();
	}

}