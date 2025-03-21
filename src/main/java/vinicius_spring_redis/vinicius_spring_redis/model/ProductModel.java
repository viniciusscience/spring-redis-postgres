package vinicius_spring_redis.vinicius_spring_redis.model;

import java.util.UUID;

import vinicius_spring_redis.vinicius_spring_redis.entity.Product;

public record ProductModel(UUID id, String nome, String sobrenome) {

	public Product toEntity() {
		return new Product(nome, sobrenome);
	}

}
