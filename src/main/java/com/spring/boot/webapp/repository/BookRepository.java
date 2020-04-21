package com.spring.boot.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
