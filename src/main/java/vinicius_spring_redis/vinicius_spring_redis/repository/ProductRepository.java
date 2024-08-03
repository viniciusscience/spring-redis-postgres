package vinicius_spring_redis.vinicius_spring_redis.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vinicius_spring_redis.vinicius_spring_redis.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

}
