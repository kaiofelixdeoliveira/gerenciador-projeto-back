package com.kingoftech.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
		
		 private Predicate<RequestHandler> apis() {
		        return RequestHandlerSelectors.basePackage("br.com.kingoftech.api.*");
		    
	}
		 
		 private ApiInfo apiInfo() {
			 
		        ApiInfo apiInfo = new ApiInfoBuilder()
		                .title ("API de Gerenciamento de Projetos")
		                .description ("Essa é a API de Gerenciamento de Projetos.")
		                .license("kingoftech License Version 2.0")
		                .licenseUrl("https://www.kingoftech.org/licenses/LICENSE-2.0")
		                .termsOfServiceUrl("/service.html")
		                .version("1.0.0")
		                .contact(new Contact("kingoftech","www.kingoftech.com.br",null))
		                .build();
		 
		        return apiInfo;
		    }
}