package fr.semifir.monBlog.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetUserProfilDTO {
    private String id;
    private String nom;
    private String prenom;
}
