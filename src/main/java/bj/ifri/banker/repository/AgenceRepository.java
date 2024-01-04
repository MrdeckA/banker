package bj.ifri.banker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Integer> {

}