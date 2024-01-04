package bj.ifri.banker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bj.ifri.banker.model.Employe;
import bj.ifri.banker.repository.EmployeRepository;

import lombok.Data;

@Data
@Service
public class EmployeService {

	@Autowired
	private EmployeRepository employeeRepository;

	public Optional<Employe> getEmployee(final Integer id) {
		return employeeRepository.findById(id);
	}

	public Iterable<Employe> getEmployees() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(final Integer id) {
		employeeRepository.deleteById(id);
	}

	public Employe saveEmployee(Employe employee) {
		Employe savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

}
