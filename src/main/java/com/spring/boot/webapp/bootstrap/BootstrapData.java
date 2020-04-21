package com.spring.boot.webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.webapp.domain.Author;
import com.spring.boot.webapp.domain.Book;
import com.spring.boot.webapp.domain.Publisher;
import com.spring.boot.webapp.repository.AuthorRepository;
import com.spring.boot.webapp.repository.BookRepository;
import com.spring.boot.webapp.repository.PublisherRepository;


@Component
public class BootstrapData implements CommandLineRunner {
	
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		Publisher publisher = new Publisher();
		publisher.setName("SFG Publishing");
		publisher.setAdderssLine1("chandni chawk");
		publisher.setCity("Delhi");
		
		publisherRepository.save(publisher);
		
		Author eric = new Author("Eric","Evans");
		Book book = new Book("Domain driven design", "123123");
		eric.getBook().add(book);
		book.getAuthor().add(eric);
		book.setPublisher(publisher);
		publisher.getBook().add(book);
		
		authorRepository.save(eric);
		bookRepository.save(book);
		publisherRepository.save(publisher);
		
		Author rod = new Author("Rod", "Jhonson");
		Book noEJB = new Book("J2EE development without EJB" , "326535453");
		rod.getBook().add(noEJB);
		noEJB.getAuthor().add(rod);
		book.setPublisher(publisher);
		publisher.getBook().add(noEJB);
		
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);
		
		System.out.println("started in bootstrap");
		System.out.println("Number of books "+ bookRepository.count());
		System.out.println("Publisher books "+ publisher.getBook().size());
		
		
	}

}
