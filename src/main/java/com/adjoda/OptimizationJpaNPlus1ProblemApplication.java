package com.adjoda;

import com.adjoda.entities.Author;
import com.adjoda.entities.Book;
import com.adjoda.entities.Customer;
import com.adjoda.repository.AuthorRepository;
import com.adjoda.repository.BookRepository;
import com.adjoda.repository.CustomerRepository;
import com.adjoda.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class OptimizationJpaNPlus1ProblemApplication implements CommandLineRunner {
	@Autowired
	private CustomService customService;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(OptimizationJpaNPlus1ProblemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// customService.populateDB();

		customService.selectCustomers();

		// customService.selectBook();
		// List<Book> books = bookRepository.findAllBooks();

		// bookRepository.findAllBooks();

		// customerRepository.findAll();
	}

}
