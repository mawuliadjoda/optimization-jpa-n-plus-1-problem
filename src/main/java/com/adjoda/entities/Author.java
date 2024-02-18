package com.adjoda.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity

/*
@NamedEntityGraph(
        name = "Author-books-graph",
        attributeNodes = @NamedAttributeNode("books")
)

 */
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    @JoinColumn(name = "author_id")
    protected List<Book> books;

     */
    public Author(String name) {
        this.name = name;
    }
}