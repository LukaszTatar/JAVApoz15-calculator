package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PercentageOperationConfiguration {
    @Bean
    PercentageOperation percentageOperation() {
        return new PercentageOperation();
    }
}
