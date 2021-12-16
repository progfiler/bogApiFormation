package fr.semifir.monBlog.entities;

import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Utilisateur {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String courriel;
    private String pseudo;
}
