package com.proton.order.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proton.order.Entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
