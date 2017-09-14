package priv.rdo.sdaspring.task05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String costam() {
        return "costam";
    }
}
