package com.ecommerce.springbootecommerce.dao;

import com.ecommerce.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//collectionResourceRel = Name of JSON Entry
// path = ruta /product-category
//@CrossOrigin habilita poder acceder a este recurso desde el mismo dominio(CORS enable)
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
