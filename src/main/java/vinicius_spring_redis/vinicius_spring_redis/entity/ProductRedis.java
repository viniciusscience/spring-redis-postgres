package vinicius_spring_redis.vinicius_spring_redis.entity;

import java.util.UUID;

import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("ProductRedis")
public class ProductRedis {

	@org.springframework.data.annotation.Id
	private UUID id;

	@Column(name = "nome", nullable = true)
	private String nome;

	@Column(name = "sobrenome", nullable = true)
	private String sobrenome;

	
}
