package bj.ifri.banker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}