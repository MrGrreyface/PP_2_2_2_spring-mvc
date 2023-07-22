package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import web.service.CarService;
import web.service.CarServiceImpl;

@Configuration
@ComponentScan("web")
public class AppConfig {

    @Bean
    public CarService carService() {
        return new CarServiceImpl();
    }
}
