package priv.rdo.sdaspring.task05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task05Config {

    @Bean
    public String costam() {
        return "costam";
    }

    @Bean
    public NotManagedBySpring notManagedBySpring() {
        return new NotManagedBySpring("fa");
    }
}
