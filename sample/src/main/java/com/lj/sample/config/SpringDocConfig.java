package com.lj.sample.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringDocConfig {

    @Value("${server.scheme}://${server.name}")
    String serverEndpoint;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("샘플 시스템").version("0.0.1").description("LJ Microservices 샘플 시스템"))
                .servers(Arrays.asList(new Server().url(serverEndpoint)));
    }
}
