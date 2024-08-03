package vinicius_spring_redis.vinicius_spring_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ViniciusSpringRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViniciusSpringRedisApplication.class, args);
	}

}
