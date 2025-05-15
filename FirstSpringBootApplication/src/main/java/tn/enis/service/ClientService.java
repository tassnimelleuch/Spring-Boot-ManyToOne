package tn.enis.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enis.entity.Client;
import tn.enis.dao.ClientRepository;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
    
    public Client findById(Long id) { 
        return clientRepository.findById(id).orElse(null);
    }
    
    public Client save(Client client) {
        return clientRepository.save(client);
    }
    
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
    
    public List<Client> searchClients(String query) {
        if (query == null || query.trim().isEmpty()) {
            return Collections.emptyList();
        }
        return clientRepository.findByNomContainingIgnoreCaseOrPrenomContainingIgnoreCase(query, query);
    }
}