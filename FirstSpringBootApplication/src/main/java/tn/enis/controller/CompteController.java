package tn.enis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tn.enis.entity.Client;
import tn.enis.entity.Compte;
import tn.enis.service.ClientService;
import tn.enis.service.CompteService;

@Controller
@RequestMapping("/comptes")
public class CompteController {
    private final CompteService compteService;
    private final ClientService clientService;

    public CompteController(CompteService compteService, ClientService clientService) {
        this.compteService = compteService;
        this.clientService = clientService;
    }

    @GetMapping
    public String listComptes(Model model) {
        model.addAttribute("comptes", compteService.findAll());
        return "comptes/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        Compte compte = new Compte();
        model.addAttribute("compte", compte);
        model.addAttribute("clients", clientService.findAll()); // Add clients list
        return "comptes/form";
    }

    @PostMapping("/save")
    public String saveCompte(@ModelAttribute Compte compte, 
                           @RequestParam Long clientId) {
        Client client = clientService.findById(clientId);
        compte.setClient(client);
        compteService.save(compte);
        return "redirect:/comptes";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Compte compte = compteService.findById(id);
        model.addAttribute("compte", compte);
        model.addAttribute("clients", clientService.findAll());
        return "comptes/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCompte(@PathVariable Long id) {
        compteService.deleteById(id);
        return "redirect:/comptes";
    }

}