package vinicius_spring_redis.vinicius_spring_redis.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vinicius_spring_redis.vinicius_spring_redis.model.ProductRedisModel;
import vinicius_spring_redis.vinicius_spring_redis.repository.ProductRedisRepository;

@Service
@RequiredArgsConstructor
public class ProductRedisServiceImpl implements ProductRedisService {

	private final ProductRedisRepository productRedisRepository;

	@Override
	public ProductRedisModel create(ProductRedisModel product) {
		var entity = productRedisRepository.save(product.toEntity());

		return new ProductRedisModel(entity.getId(), entity.getNome(), entity.getSobrenome());
	}

}
