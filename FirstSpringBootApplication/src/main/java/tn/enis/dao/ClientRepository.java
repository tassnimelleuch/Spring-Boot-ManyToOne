package tn.enis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enis.entity.Client;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByNomContainingIgnoreCaseOrPrenomContainingIgnoreCase(String nom, String prenom);
}