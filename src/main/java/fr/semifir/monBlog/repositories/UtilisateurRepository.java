package fr.semifir.monBlog.repositories;

import fr.semifir.monBlog.entities.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
}
