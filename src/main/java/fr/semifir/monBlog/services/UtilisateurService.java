package fr.semifir.monBlog.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.semifir.monBlog.dtos.GetUserProfilDTO;
import fr.semifir.monBlog.entities.Utilisateur;
import fr.semifir.monBlog.repositories.UtilisateurRepository;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public class UtilisateurService {

    private UtilisateurRepository repository;
    private ModelMapper mapper;

    public UtilisateurService(
            UtilisateurRepository repository,
            ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<Utilisateur> findAll() {
        return this.repository.findAll();
    }

    public Optional<Utilisateur> findById(String id) {
        return this.repository.findById(id);
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return this.repository.save(utilisateur);
    }

    public void delete(Utilisateur utilisateur) {
        this.repository.delete(utilisateur);
    }

    public GetUserProfilDTO getProfil(String id) {
        Optional<Utilisateur> utilisateur = this.repository.findById(id);
        GetUserProfilDTO getUserProfilDTO = mapper.map(utilisateur.get(), GetUserProfilDTO.class);
        return getUserProfilDTO;
    }
}
