package fr.semifir.monBlog.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.semifir.monBlog.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Le service permet d'appliquer ma couche métier
 * Actuellement ma couche métier ne fais pas grd chose
 * Elle va juste communiquer avec une BDD
 */
public class ArticleService {

    /**
        Je simule une base de données
        Je réa un "bouchon"
     */
    private List<Article> articles = new ArrayList<>();

    /**
        Dans le constructeur
        Je mets des faux articles
     */
    public ArticleService() {
        this.articles.add(new Article("Toto en vacances", "toto-en-vacances", "dzadfazdf"));
        this.articles.add(new Article("Toto au toilettes", "toto-au-toilettes", "zefgzarg,gre g re ga eragar"));
    }

    /**
     * On récupère une liste d'articles
     * @return List<Article>
     */
    public List<Article> findAll() {
        // Plus tards, cette méthode va nous permettre de communiquer
        // avec le REPOSITORY -> BDD
        return this.articles;
    }

    /**
     * On peu sauvegarder un article
     * Ajouter à la liste "articles", un nouvel article
     * @param  article
     * @return Article
     */
    public Article save(Article article) {
        this.articles.add(article);
        return article;
    }
}
