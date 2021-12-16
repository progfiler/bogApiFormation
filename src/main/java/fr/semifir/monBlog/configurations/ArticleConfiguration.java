package fr.semifir.monBlog.configurations;

import fr.semifir.monBlog.repositories.ArticleRepository;
import fr.semifir.monBlog.services.ArticleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ArticleConfiguration {
    @Bean
    public ArticleService articleService(ArticleRepository repository) {
        return new ArticleService(repository);
    }
}
