package fr.semifir.monBlog.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.semifir.monBlog.entities.Article;
import fr.semifir.monBlog.repositories.ArticleRepository;
import java.util.List;

/**
 * Le service permet d'appliquer ma couche métier
 * Actuellement ma couche métier ne fais pas grd chose
 * Elle va juste communiquer avec une BDD
 */
public class ArticleService {

    ArticleRepository repository;

    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    /**
     * Permet de retourner une liste d'articles
     * @return
     */
    public List<Article> findAll() {
        return this.repository.findAll();
    }

    /**
     * Permet de récuperer un article selon son slug
     * @param slug
     * @return
     */
    public Article findBySlug(String slug) {
        return this.repository.findBySlug(slug);
    }

    /**
     * Permet de sauvegarder ou de mettre à jours un article
     * @param article
     * @return
     */
    public Article save(Article article) {
        return this.repository.save(article);
    }

    /**
     * Permet de supprimer un article
     * @param article
     */
    public void delete(Article article) {
        this.repository.delete(article);
    }

    public List<Article> findArticleByUtilisateurId(String userId) {
        return this.repository.findByUtilisateur_Id(userId);
    }
}
