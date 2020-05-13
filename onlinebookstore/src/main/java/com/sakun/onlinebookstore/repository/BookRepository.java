package com.sakun.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakun.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{//<entity name,pk type>

}
