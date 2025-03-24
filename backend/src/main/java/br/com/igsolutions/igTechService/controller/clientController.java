package br.com.igsolutions.igTechService.controller;

import br.com.igsolutions.igTechService.model.Client;
import br.com.igsolutions.igTechService.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/client")
public class clientController {
    @Autowired
    private clientService clientService;

    @GetMapping
    public List<Client> clientList() {
        return clientService.listClients();
    }

    @PostMapping
    public Client registerClient(@RequestBody Client client) {
        return clientService.registerClient(client);
    }
}
