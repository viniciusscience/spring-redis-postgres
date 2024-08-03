package vinicius_spring_redis.vinicius_spring_redis.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vinicius_spring_redis.vinicius_spring_redis.model.ProductModel;
import vinicius_spring_redis.vinicius_spring_redis.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	@Override
	public ProductModel create(ProductModel product) {
		var entity = productRepository.save(product.toEntity());
		return new ProductModel(entity.getId(), entity.getNome(), entity.getSobrenome());
	}

}
