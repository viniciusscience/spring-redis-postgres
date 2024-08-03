package vinicius_spring_redis.vinicius_spring_redis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;
import vinicius_spring_redis.vinicius_spring_redis.model.ProductModel;
import vinicius_spring_redis.vinicius_spring_redis.service.ProductService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	@PostMapping("/product")
	public ResponseEntity<ProductModel> create(@RequestBody ProductModel model) {
		return ResponseEntity.ok(productService.create(model));
	}

}
