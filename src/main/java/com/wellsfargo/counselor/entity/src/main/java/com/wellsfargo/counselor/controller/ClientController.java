package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }
}
