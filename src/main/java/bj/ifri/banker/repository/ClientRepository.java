package bj.ifri.banker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}