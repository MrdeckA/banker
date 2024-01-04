package bj.ifri.banker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}