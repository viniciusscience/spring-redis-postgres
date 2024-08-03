package vinicius_spring_redis.vinicius_spring_redis.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vinicius_spring_redis.vinicius_spring_redis.entity.ProductRedis;

@Repository
public interface ProductRedisRepository extends CrudRepository<ProductRedis, UUID> {


    List<ProductRedis> findAll();
}
