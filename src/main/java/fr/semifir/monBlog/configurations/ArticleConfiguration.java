package fr.semifir.monBlog.configurations;

import fr.semifir.monBlog.services.ArticleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArticleConfiguration {

    @Bean
    public ArticleService articleService() {
        return new ArticleService();
    }
}
