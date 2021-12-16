package fr.semifir.monBlog.repositories;

import fr.semifir.monBlog.entities.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {
    // Effectuer une recherche par slug
    Article findBySlug(String slug);
}
