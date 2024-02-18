package com.adjoda.service;

import com.adjoda.entities.Author;
import com.adjoda.entities.Book;
import com.adjoda.entities.Customer;
import com.adjoda.repository.AuthorRepository;
import com.adjoda.repository.BookRepository;
import com.adjoda.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CustomService {

    private final CustomerRepository customerRepository;

    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;
    public void populateDB() {
        Author author = new Author("ADJODA");
        author = authorRepository.save(author);

        Book book = new Book("Rich dad & poor dad");
        book.setAuthor(author);
        book = bookRepository.save(book);



        // Author author2 = new Author("KOFFI");
        // author2 = authorRepository.save(author2);

		Book book2 = new Book("Financial mindset");
		book2.setAuthor(author);
		book2 = bookRepository.save(book2);




        Customer customer = new Customer("John", "John");
        customer.setBooks(List.of(book, book2));
        customer = customerRepository.save(customer);
    }

    public void selectCustomers () {
        List<Customer> customers = customerRepository.findAll();


        for (Customer customer : customers) {
            List<Book> books = customer.getBooks();

            for (Book book : books) {
                Author author = book.getAuthor();

            }
            //System.out.println(books);
        }

    }

    public void selectBook() {
        List<Book> books = bookRepository.findAllBooks();


        for (Book book : books) {
            Author author = book.getAuthor();
            System.out.println(author.getName());
        }


    }

    public void selectAuthor() {
        List<Author> authors = authorRepository.findAll();
    }
}
