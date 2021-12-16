package fr.semifir.monBlog.controllers;

import fr.semifir.monBlog.dtos.GetUserProfilDTO;
import fr.semifir.monBlog.entities.Utilisateur;
import fr.semifir.monBlog.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    UtilisateurService service;

    public UtilisateurController(UtilisateurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Utilisateur> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Utilisateur> findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @GetMapping("profil/{id}")
    public GetUserProfilDTO getUserProfil(@PathVariable String id) {
        return this.service.getProfil(id);
    }

    @PostMapping
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return this.service.save(utilisateur);
    }

    @PutMapping
    public Utilisateur update(@RequestBody Utilisateur utilisateur) {
        return this.service.save(utilisateur);
    }

    @DeleteMapping
    public void delete(@RequestBody Utilisateur utilisateur) {
        this.service.delete(utilisateur);
    }

}
