package com.kingoftech.api.audity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class JpaConfig {
	@Bean(name = "auditorAware")
    public AuditorAware<String> auditorAware() {
		
        return new AuditorAwareImpl();
    }
}