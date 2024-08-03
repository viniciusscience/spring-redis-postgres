package vinicius_spring_redis.vinicius_spring_redis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vinicius_spring_redis.vinicius_spring_redis.model.ProductRedisModel;
import vinicius_spring_redis.vinicius_spring_redis.service.ProductRedisService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProductRedisController {

	private final ProductRedisService productRedisService;

	@PostMapping("/product-redis")
	public ResponseEntity<ProductRedisModel> create(@RequestBody ProductRedisModel model) {
		return ResponseEntity.ok(productRedisService.create(model));
	}
}
