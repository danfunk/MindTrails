import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * This is a Spring based application.
 * The annotations below will cause components in the mindtrails library to be loaded
 * alongside any custom code you create to manage your study.
 *
 * If you are using this as a template, be sure to replace "org.mindtrails.example" in the scan
 * paths below with the package or your own code base.
 */
@ComponentScan ({"org.mindtrails.example", "org.mindtrails"})
@Configuration
@EnableJpaRepositories(basePackages = {"org.mindtrails.example", "org.mindtrails"})
@EnableAutoConfiguration
@EntityScan(basePackages = {"org.mindtrails.example", "org.mindtrails"})
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}