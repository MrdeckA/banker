package bj.ifri.banker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Banque;

@Repository
public interface BanqueRepository extends CrudRepository<Banque, Long> {

}