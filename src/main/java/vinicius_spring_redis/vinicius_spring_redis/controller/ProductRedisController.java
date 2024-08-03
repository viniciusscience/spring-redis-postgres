package vinicius_spring_redis.vinicius_spring_redis.controller;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vinicius_spring_redis.vinicius_spring_redis.entity.ProductRedis;

import vinicius_spring_redis.vinicius_spring_redis.service.ProductRedisService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProductRedisController {

	private final ProductRedisService productRedisService;

	@PostMapping("/product-redis")
	public ResponseEntity<ProductRedis> create(@RequestBody ProductRedis model) {
		return ResponseEntity.ok(productRedisService.create(model));
	}

	@GetMapping("/product-redis")
	@Cacheable("product")
	public List<ProductRedis> get() {
		System.out.print("VERIFICA SE ENTRA APENAS UMA FEZ NA CHAMADA, DEPOIS PEGA DO CACHE");
		return productRedisService.findAll();
	}

	@GetMapping("/clear-cache")
    @CacheEvict(value = "product")
	public void clearCache() {
		System.out.print("LIMPA O CACHE, PARA PODER CONSULTAR NOVAMENTE VALORES POSSIVELMENTE ATUALIZADO");

	}
}
