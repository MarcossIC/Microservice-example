package com.example.apigateway.filters;

import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.ResponseCookie;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
@Slf4j
public class CustomGlobalFilterExample implements GlobalFilter, Ordered{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("ejecutando filtro pre");
		exchange.getRequest().mutate().headers(h -> h.add("token", "123456"));
		
		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
			log.info("ejecutando filtro post");
			
			Optional.ofNullable(
					exchange.getRequest().getHeaders().getFirst("token")
			).ifPresent(value ->
				exchange.getResponse().getHeaders().add("token", value)
			);
		}));
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
