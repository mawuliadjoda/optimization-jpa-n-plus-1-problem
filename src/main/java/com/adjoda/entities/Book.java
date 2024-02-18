package com.adjoda.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@NamedEntityGraph(
        name = "Book.author",
        attributeNodes = @NamedAttributeNode("author")
)
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Author author;

    public Book(String name) {
        this.name = name;
    }
}
