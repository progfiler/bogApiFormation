package fr.semifir.monBlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document // Version NOSQL
// version SQL -> @Entity
// @Table(name = "NOM DE LA TABLE")
public class Article {
    /*
        @Id
        @GeneratedValue(strategy= GeneratedType.IDENTITY) -> AutoIncrement
     */
    @Id
    private String id;
    private String title;
    private String slug;
    private String content;
}
