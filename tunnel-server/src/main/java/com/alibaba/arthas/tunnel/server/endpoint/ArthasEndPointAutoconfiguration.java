package com.alibaba.arthas.tunnel.server.endpoint;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.arthas.tunnel.server.app.ArthasProperties;

@EnableConfigurationProperties(ArthasProperties.class)
@Configuration
public class ArthasEndPointAutoconfiguration {

    @ConditionalOnMissingBean
    @ConditionalOnEnabledEndpoint
    @Bean
    public ArthasEndpoint arthasEndPoint() {
        return new ArthasEndpoint();
    }
}
