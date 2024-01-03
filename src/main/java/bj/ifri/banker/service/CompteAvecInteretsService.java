package bj.ifri.banker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bj.ifri.banker.model.CompteAvecInterets;
import bj.ifri.banker.repository.CompteAvecInteretsRepository;

import lombok.Data;

@Data
@Service
public class CompteAvecInteretsService {

    @Autowired
    private CompteAvecInteretsRepository compteAvecInteretsRepository;

    public Optional<CompteAvecInterets> getCompteBancaire(final Long id) {
        return compteAvecInteretsRepository.findById(id);
    }

    public Iterable<CompteAvecInterets> getCompteBancaires() {
        return compteAvecInteretsRepository.findAll();
    }

    public void deleteCompteBancaire(final Long id) {
        compteAvecInteretsRepository.deleteById(id);
    }

    public CompteAvecInterets saveCompteBancaire(CompteAvecInterets CompteBancaire) {
        CompteAvecInterets savedCompteBancaire = compteAvecInteretsRepository.save(CompteBancaire);
        return savedCompteBancaire;
    }

}
