package com.kingoftech.api.rules;

import org.junit.runner.RunWith;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.kingoftech.api")
public class NamingArchitectureTest {

	@ArchTest
	public static ArchRule services_should_be_prefixed = classes().that()//
			.resideInAPackage("com.kingoftech.api.services")//
			.should().haveSimpleNameEndingWith("Service");//

	@ArchTest
	public static ArchRule servicesImpl_should_be_prefixed = classes().that()//
			.resideInAPackage("com.kingoftech.api.services.impl")//
			.should().haveSimpleNameEndingWith("ServiceImpl");//

	@ArchTest
	public static ArchRule constrollers_should_be_prefixed = classes().that()//
			.resideInAPackage("com.kingoftech.api.constrollers")//
			.should().haveSimpleNameEndingWith("Controller");//

	@ArchTest
	public static ArchRule exceptions_should_be_prefixed = classes().that()//
			.resideInAPackage("com.kingoftech.api.exceptions")//
			.should().haveSimpleNameEndingWith("Exception");//

	@ArchTest
	public static ArchRule dtos_should_be_prefixed = classes().that()//
			.resideInAPackage("com.kingoftech.api.dto")//
			.should().haveSimpleNameEndingWith("DTO");//

	@ArchTest
	public static ArchRule repository_should_be_prefixed = classes().that()//
			.resideInAPackage("com.kingoftech.api.repositories")//
			.should().haveSimpleNameEndingWith("Repository");//
	
}
