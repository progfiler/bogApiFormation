package fr.semifir.monBlog.configurations;

import fr.semifir.monBlog.repositories.UtilisateurRepository;
import fr.semifir.monBlog.services.UtilisateurService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilisateurConfiguration {

    @Bean
    public UtilisateurService utilisateurService(
            UtilisateurRepository repository,
            ModelMapper mapper
    ) {
        return new UtilisateurService(repository, mapper);
    }
}
