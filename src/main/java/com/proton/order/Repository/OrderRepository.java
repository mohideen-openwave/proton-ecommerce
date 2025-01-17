package com.proton.order.Repository;

import org.springframework.data.repository.CrudRepository;

import com.proton.order.Entity.Orders;

public interface OrderRepository extends CrudRepository<Orders, Long>{

}
