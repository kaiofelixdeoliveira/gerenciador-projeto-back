package com.kingoftech.api.rules;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;
import static com.tngtech.archunit.library.GeneralCodingRules.NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

import org.junit.runner.RunWith;
import org.slf4j.Logger;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.kingoftech.api",importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class LayerArchitetureTest {
	
	@ArchTest
    public static final ArchRule layer_dependencies_are_respected=
        layeredArchitecture()
                .layer("Controllers").definedBy("com.kingoftech.api.controllers..")//
                .layer("Services").definedBy("com.kingoftech.api.services..")//
                .layer("Repositories").definedBy("com.kingoftech.api.repositories..")//
                .layer("Entities").definedBy("com.kingoftech.api.entities..")//
                .layer("Dto").definedBy("com.kingoftech.api.dto..")//
                
                .whereLayer("Controllers").mayNotBeAccessedByAnyLayer()//
                .whereLayer("Services").mayOnlyBeAccessedByLayers("Controllers")//
                .whereLayer("Repositories").mayOnlyBeAccessedByLayers("Services")//
                .whereLayer("Entities").mayOnlyBeAccessedByLayers("Repositories", "Services");
    
	     
	
	@ArchTest
	private final ArchRule loggers_should_be_private_static_final = fields().that()//
	.haveRawType(Logger.class).should()//
			.bePrivate()//
			.andShould()//
			.beFinal()//
			.because("we agreed on this convention");//


	@ArchTest
	private final ArchRule no_java_util_logging = NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

}
