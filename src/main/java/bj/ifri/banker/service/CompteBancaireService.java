package bj.ifri.banker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bj.ifri.banker.model.CompteBancaire;
import bj.ifri.banker.repository.CompteBancaireRepository;

import lombok.Data;

@Data
@Service
public class CompteBancaireService {

    @Autowired
    private CompteBancaireRepository compteBancaireRepository;

    public Optional<CompteBancaire> getCompteBancaire(final Integer id) {
        return compteBancaireRepository.findById(id);
    }

    public Iterable<CompteBancaire> getCompteBancaires() {
        return compteBancaireRepository.findAll();
    }

    public void deleteCompteBancaire(final Integer id) {
        compteBancaireRepository.deleteById(id);
    }

    public CompteBancaire saveCompteBancaire(CompteBancaire CompteBancaire) {
        CompteBancaire savedCompteBancaire = compteBancaireRepository.save(CompteBancaire);
        return savedCompteBancaire;
    }

}