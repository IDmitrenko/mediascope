package dias.mediascope.testmsproject.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Configuration
@ComponentScan("dias.mediascope.testmsproject")
@EnableAutoConfiguration
public class MainClass {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("dias.mediascope.testmsproject"))
                .build()
                .apiInfo(apiInfo());
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Test App Rest API",
                "For more info visit something",
                "1.0",
                "",
                "",
                "",
                ""
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
}
