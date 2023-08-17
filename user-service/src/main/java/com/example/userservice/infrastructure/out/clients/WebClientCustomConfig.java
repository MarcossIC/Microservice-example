package com.example.userservice.infrastructure.out.clients;

import com.example.userservice.infrastructure.out.clients.exchange.CarExchangeClient;
import com.example.userservice.infrastructure.out.clients.exchange.CarServerExchange;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@RequiredArgsConstructor
public class WebClientCustomConfig {
    private final LoadBalancedExchangeFilterFunction filterFunction;

    /**
     * RestTemplate esta deprecado despues de Spring Framework 5.0+
     * */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * La forma recomendada apartir de Spring Framework 6.0 es utilizar WebClient Exchange
     */
    @Bean
    public WebClient carWebClient(){
        return WebClient.builder()
                .baseUrl("http://car-service")
                .filter(filterFunction)
                .build();
    }

    @Bean
    public CarExchangeClient carExchangeClient(){
        var httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(carWebClient())).build();

        return httpServiceProxyFactory.createClient(CarExchangeClient.class);
    }
}
