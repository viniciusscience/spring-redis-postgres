package vinicius_spring_redis.vinicius_spring_redis.entity;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("product")
public class ProductRedis implements Serializable {



	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;

	@org.springframework.data.annotation.Id
	@Indexed
	private UUID id;

	@Column(name = "nome", nullable = true)
	private String nome;

	@Column(name = "sobrenome", nullable = true)
	private String sobrenome;

}
