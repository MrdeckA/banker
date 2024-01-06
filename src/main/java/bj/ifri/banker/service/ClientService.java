package bj.ifri.banker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bj.ifri.banker.model.Client;
import bj.ifri.banker.repository.ClientRepository;

import lombok.Data;

@Data
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Optional<Client> getClient(final Long id) {
        // Optional<Client> ok = clientRepository.findById(id);
        // ok.get()

        return clientRepository.findById(id);
    }

    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }

    public void deleteClient(final Long id) {
        clientRepository.deleteById(id);
    }

    public Client saveClient(Client client) {
        Client savedClient = clientRepository.save(client);
        return savedClient;
    }

}