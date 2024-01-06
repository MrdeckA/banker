package bj.ifri.banker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Agence;

@Repository
public interface AgenceRepository extends CrudRepository<Agence, Integer> {

}