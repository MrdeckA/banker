package bj.ifri.banker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Employe;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {

}