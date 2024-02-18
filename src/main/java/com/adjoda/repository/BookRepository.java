package com.adjoda.repository;

import com.adjoda.entities.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b")
    @EntityGraph("Book.author")
    List<Book> findAllBooks();

    @Override
    @EntityGraph("Book.author")
    List<Book> findAll();
}
