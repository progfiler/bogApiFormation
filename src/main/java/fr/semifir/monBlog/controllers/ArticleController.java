package fr.semifir.monBlog.controllers;

import fr.semifir.monBlog.entities.Article;
import fr.semifir.monBlog.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController {

    /**
     * J'initialise une variable d'instance qui contiendra mon service
     * pour le moment elle est vide -> null
     */
    ArticleService service;

    /**
     * Dans le constructeur : J'injecte la dépendance ArticleService
     * Qui va me permettre, grâce à SPRING, de récuperer une instance
     * d'ArticleService
     * @param service
     */
    public ArticleController(ArticleService service) {
        this.service = service;
    }

    /**
     * Méthode qui permet de retourner une liste d'Article
     * @return String
     */
    @GetMapping
    public List<Article> findAll() {
        return service.findAll();
    }

    /**
     * Méthode qui permet de retourner un article par rapport
     * à son slug
     * @param slug String
     * @return String
     */
    @GetMapping("{slug}")
    public Article findBySlug(@PathVariable String slug){
        return this.service.findBySlug(slug);
    }

    /**
     * Méthode qui permet de sauvegarder un article
     * @param article Article
     * @return String
     */
    @PostMapping
    public Article save(@RequestBody Article article) {
        return this.service.save(article);
    }

    /**
     * Méthode qui permet de mettre à jour un article
     * @param article Article
     * @return String
     */
    @PutMapping
    public Article update(@RequestBody Article article) {
        return this.service.save(article);
    }

    /**
     * Méthode qui permet de supprimer un article
     * @param article Article
     */
    @DeleteMapping
    public void delete(@RequestBody Article article) {
        this.service.delete(article);
    }

}
