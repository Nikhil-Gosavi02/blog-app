package com.blog.apis.repositories;
//
//
//
//import java.util.Locale.Category;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface CategoryRepo extends JpaRepository<Category, Integer>{
//
//	
//	
//}
// 



import com.blog.apis.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    // custom queries if needed
}
