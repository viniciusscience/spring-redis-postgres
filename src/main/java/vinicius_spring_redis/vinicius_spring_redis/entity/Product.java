package vinicius_spring_redis.vinicius_spring_redis.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "nome", nullable = true)
	private String nome;

	@Column(name = "sobrenome", nullable = true)
	private String sobrenome;

	public Product(String nome2, String sobrenome2) {
		this.nome = nome2;
		this.sobrenome = sobrenome2;
	}

}
