package com.example.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.example.tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
}
