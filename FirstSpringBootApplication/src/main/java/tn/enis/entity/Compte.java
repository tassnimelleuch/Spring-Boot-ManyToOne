package tn.enis.entity;

import jakarta.persistence.*;
@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
    private Long rib;
    private double solde;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    
    // Constructors, getters, and setters
    public Compte() {
    }

    public Compte(double solde, Client client) {
        this.solde = solde;
        this.client = client;
    }

    // Getters and setters
    public Long getRib() {
        return rib;
    }

    public void setRib(Long rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}