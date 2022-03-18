package mine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {

    @Bean(name="engineBean")
    @Scope("prototype")
    public Engine getEngine(){
        return new Engine();
    }
}
