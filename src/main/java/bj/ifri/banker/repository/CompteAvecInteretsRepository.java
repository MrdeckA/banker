package bj.ifri.banker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.CompteAvecInterets;

@Repository
public interface CompteAvecInteretsRepository extends CrudRepository<CompteAvecInterets, Long> {

}