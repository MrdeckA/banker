package bj.ifri.banker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bj.ifri.banker.model.Employe;
import bj.ifri.banker.repository.EmployeeProxy;

import lombok.Data;

@Data
@Service
public class EmployeeService {

	@Autowired
	private EmployeeProxy employeeProxy;

	public Employe getEmployee(final int id) {
		return employeeProxy.getEmployee(id);
	}

	public Iterable<Employe> getEmployees() {
		return employeeProxy.getEmployees();
	}

	public void deleteEmployee(final int id) {
		employeeProxy.deleteEmployee(id);
	}

	public Employe saveEmployee(Employe employee) {
		Employe savedEmployee;

		// Functional rule : Last name must be capitalized.
		employee.setLastName(employee.getLastName().toUpperCase());

		if (employee.getId() == null) {
			// If id is null, then it is a new employee.
			savedEmployee = employeeProxy.createEmployee(employee);
		} else {
			savedEmployee = employeeProxy.updateEmployee(employee);
		}

		return savedEmployee;
	}

}
