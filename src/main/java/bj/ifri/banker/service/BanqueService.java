package bj.ifri.banker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bj.ifri.banker.model.Banque;
import bj.ifri.banker.repository.BanqueRepository;

import lombok.Data;

@Data
@Service
public class BanqueService {

    @Autowired
    private BanqueRepository banqueRepository;

    public Optional<Banque> getBanque(final Long id) {
        return banqueRepository.findById(id);
    }

    public Iterable<Banque> getBanques() {
        return banqueRepository.findAll();
    }

    public void deletebanque(final Long id) {
        banqueRepository.deleteById(id);
    }

    public Banque saveBanque(Banque banque) {
        Banque savedbanque = banqueRepository.save(banque);
        return savedbanque;
    }

}
