package com.ecommerce.springbootecommerce.dao;

import com.ecommerce.springbootecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin habilita poder acceder a este recurso desde el mismo dominio(CORS enable)
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    //behind the scenes Spring will execute a query similar to: SELECT * FROM product WHERE category_id=?
Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

}
