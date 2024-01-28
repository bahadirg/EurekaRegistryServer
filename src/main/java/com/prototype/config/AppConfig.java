package com.prototype.config;

import java.awt.print.Book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class AppConfig {

	@Bean
	public RedisTemplate<Long, Book> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<Long, Book> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);
		return template;
	}
}
