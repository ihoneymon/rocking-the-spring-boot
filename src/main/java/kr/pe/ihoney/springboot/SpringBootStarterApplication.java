package kr.pe.ihoney.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * SpringBoot 1.2.0.Release 에서 큰 변화중 하나라면, 1.1.9까지는 3개의 애노테이션
 * {@code @Configuration}, {@code @EnableAutoConfiguration} and
 * {@code @ComponentScan}를 사용해야했지만, 1.2.0. 부터는 {@code @SpringBootApplication}
 * 애노테이션 하나로 통일되었다는 것.
 * 
 * @author jiheon
 *
 */
@SpringBootApplication
public class SpringBootStarterApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootStarterApplication.class);
    }
}
