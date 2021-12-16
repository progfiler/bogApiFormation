package fr.semifir.monBlog.configurations;

import fr.semifir.monBlog.entities.Article;
import fr.semifir.monBlog.repositories.ArticleRepository;
import fr.semifir.monBlog.services.ArticleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class ArticleConfiguration {
    @Bean
    public ArticleService articleService(ArticleRepository repository) {
        return new ArticleService(repository);
    }
}
