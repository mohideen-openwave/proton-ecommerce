package com.proton.order.Repository;

import org.springframework.data.repository.CrudRepository;

import com.proton.order.Entity.OrderProducts;

public interface OrderProductsRepository extends CrudRepository<OrderProducts, Long> {

}
