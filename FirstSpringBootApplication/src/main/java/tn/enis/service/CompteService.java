package tn.enis.service;

import java.util.List;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tn.enis.entity.Compte;
import tn.enis.dao.CompteRepository;
@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAll() {
        return compteRepository.findAll();
    }

    public Compte findById(Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    public Compte save(Compte compte) {
        if (compte.getClient() == null) {
            throw new IllegalArgumentException("Client must be specified");
        }
        return compteRepository.save(compte);
    }

    @Transactional
    public void deleteById(Long id) {
        Compte compte = compteRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Account not found"));
        
        compte.setClient(null);
        compteRepository.saveAndFlush(compte);
        
        compteRepository.delete(compte);
    }
}