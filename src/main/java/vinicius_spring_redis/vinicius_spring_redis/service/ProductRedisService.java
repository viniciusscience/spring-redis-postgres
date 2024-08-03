package vinicius_spring_redis.vinicius_spring_redis.service;

import java.util.List;

import vinicius_spring_redis.vinicius_spring_redis.entity.ProductRedis;


public interface ProductRedisService {

	ProductRedis create(ProductRedis product);

	List<ProductRedis> findAll();
}
