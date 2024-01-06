package bj.ifri.banker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.CompteAvecInterets;

@Repository
public interface CompteAvecInteretsRepository extends JpaRepository<CompteAvecInterets, Integer> {

}