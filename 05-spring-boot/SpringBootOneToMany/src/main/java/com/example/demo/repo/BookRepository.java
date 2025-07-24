package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.example.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
