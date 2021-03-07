package com.liujf.springcloud02.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class ApiGlobalFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getQueryParams().getFirst("token");
//        if (StringUtils.isBlank(token)) {
//            ServerHttpResponse response = exchange.getResponse();
//            Map<String,Object> message = new HashMap<>();
//            message.put("status", -1);
//            message.put("data", "鉴权失败");
//            byte[] bits = message.toString().getBytes(StandardCharsets.UTF_8);
//            DataBuffer buffer = response.bufferFactory().wrap(bits);
//            response.setStatusCode(HttpStatus.UNAUTHORIZED);
//            response.getHeaders().add("Content-Type", "text/json;charset=UTF-8");
//            return response.writeWith(Mono.just(buffer));
//        }
        return chain.filter(exchange);
    }
}
