package vinicius_spring_redis.vinicius_spring_redis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vinicius_spring_redis.vinicius_spring_redis.entity.ProductRedis;
import vinicius_spring_redis.vinicius_spring_redis.repository.ProductRedisRepository;

@Service
@RequiredArgsConstructor
public class ProductRedisServiceImpl implements ProductRedisService {

	private final ProductRedisRepository productRedisRepository;

	@Override
	public ProductRedis create(ProductRedis product) {

		return productRedisRepository.save(product);
	}

	@Override
	public List<ProductRedis> findAll() {

		return productRedisRepository.findAll();
	}

}
