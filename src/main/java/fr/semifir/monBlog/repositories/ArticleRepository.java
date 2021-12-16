package fr.semifir.monBlog.repositories;

import fr.semifir.monBlog.entities.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {
    /**
     * Retourne un article selon son slug
     */
    Article findBySlug(String slug);

    /**
     * Retourne une liste d'article selon l'ID de l'utilisateur
     */
    List<Article> findByUtilisateur_Id(String id);
}
