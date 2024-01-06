package bj.ifri.banker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.banker.model.Banque;

@Repository
public interface BanqueRepository extends JpaRepository<Banque, Long> {

}