package com.spring.boot.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
