package vinicius_spring_redis.vinicius_spring_redis.model;

import java.util.UUID;

import vinicius_spring_redis.vinicius_spring_redis.entity.ProductRedis;

public record ProductRedisModel(UUID id, String nome, String sobrenome) {

	public ProductRedis toEntity() {
		return new ProductRedis(id, nome, sobrenome);
	}



}
