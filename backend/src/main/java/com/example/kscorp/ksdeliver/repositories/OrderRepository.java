package com.example.kscorp.ksdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kscorp.ksdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
