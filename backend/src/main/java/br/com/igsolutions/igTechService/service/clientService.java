package br.com.igsolutions.igTechService.service;

import br.com.igsolutions.igTechService.model.Client;
import br.com.igsolutions.igTechService.repositories.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clientService {

    @Autowired
    private clientRepository clientRepository;

    public List<Client> listClients() {
        return clientRepository.findAll();
    }

    public Client registerClient(Client client) {
        return clientRepository.save(client);
    }
}
