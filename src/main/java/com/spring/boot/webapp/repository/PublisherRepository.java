package com.spring.boot.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
