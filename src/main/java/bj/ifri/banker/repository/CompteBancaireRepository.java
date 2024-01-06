package bj.ifri.banker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.CompteBancaire;

@Repository
public interface CompteBancaireRepository extends CrudRepository<CompteBancaire, Integer> {

}