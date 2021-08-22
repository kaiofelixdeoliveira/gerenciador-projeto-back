package com.kingoftech.api.rules;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.kingoftech.api", importOptions = { ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class })
public class AnotationArchitetureTest {

	@ArchTest
	public static ArchRule repositoryClassesShouldHaveSpringRepositoryAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api.repositories")//
			.should().beAnnotatedWith(Repository.class);//

	@ArchTest
	public static ArchRule serviceImplClassesShouldHaveSpringServiceAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api.services.impl")//
			.should().beAnnotatedWith(Service.class);//

	@ArchTest
	public static ArchRule ApplicationBootClassesShouldHaveSpringBootAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api")//
			.should().beAnnotatedWith(SpringBootApplication.class);//

	@ArchTest
	public static ArchRule ApplicationBootClassesShouldHaveEnableJpaRepositoriesAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api")//
			.should().beAnnotatedWith(EnableJpaRepositories.class);//

	@ArchTest
	public static ArchRule ControllersClassesShouldHaveRestControllerAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api.controllers")//
			.should().beAnnotatedWith(RestController.class);//

	@ArchTest
	public static ArchRule ControllersClassesShouldHaveRequestMappingAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api.controllers")//
			.should().beAnnotatedWith(RequestMapping.class);//

	@ArchTest
	public static ArchRule EntitiesClassesShouldHaveTableAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api.entities")//
			.should().beAnnotatedWith(Table.class);//

	@ArchTest
	public static ArchRule EntitiesClassesShouldHaveEntityAnnotation = classes()//
			.that()//
			.resideInAPackage("com.kingoftech.api.entities")//
			.should().beAnnotatedWith(Entity.class);//

}
