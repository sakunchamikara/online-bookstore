package com.sakun.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakun.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{

}
