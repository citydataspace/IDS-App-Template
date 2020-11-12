package de.fraunhofer.fit.IDSSmartDataAppTemplate.annotations;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestController
@RequestMapping("/input")
@Tag(name="App: Data Input", description = "App Data Input")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AppInputEndpoint {

}
