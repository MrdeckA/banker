package bj.ifri.banker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bj.ifri.banker.model.Agence;
import bj.ifri.banker.repository.AgenceRepository;

import lombok.Data;

@Data
@Service
public class AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    public Optional<Agence> getAgence(final Integer id) {
        return agenceRepository.findById(id);
    }

    public Iterable<Agence> getAgences() {
        return agenceRepository.findAll();
    }

    public void deleteAgence(final Integer id) {
        agenceRepository.deleteById(id);
    }

    public Agence saveAgence(Agence agence) {
        Agence savedAgence = agenceRepository.save(agence);
        return savedAgence;
    }

}