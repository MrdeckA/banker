package bj.ifri.banker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import bj.ifri.banker.model.Employe;
import bj.ifri.banker.service.EmployeService;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@RequestMapping("employees")
@CrossOrigin(origins = "*")
@Data
@Controller
public class EmployeeController {

	@Autowired
	private EmployeService employeeService;

	/**
	 * Read - Get all employees
	 * 
	 * @return - An Iterable object of Employee full filled
	 */
	// @GetMapping("/")
	// public Iterable<Employe> getEmployees() {
	// return employeeService.getEmployees();
	// }

	@GetMapping("/")
	public String home(Model model) {
		// Iterable<Employe> listEmployee = employeeService.getEmployees();
		// model.addAttribute("employees", listEmployee);
		return "home";
	}

	@GetMapping("/createEmployee")
	public String createEmployee(Model model) {
		Employe e = new Employe();
		model.addAttribute("employee", e);
		return "formNewEmployee";
	}

	@GetMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable("id") final Long id, Model model) {
		return "formUpdateEmployee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public ModelAndView deleteEmploye(@PathVariable("id") final int id) {
		return new ModelAndView("redirect:/");
	}

}