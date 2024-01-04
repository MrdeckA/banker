package bj.ifri.banker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.CompteBancaire;

@Repository
public interface CompteBancaireRepository extends JpaRepository<CompteBancaire, Integer> {

}