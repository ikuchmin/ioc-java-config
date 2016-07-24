package ru.example.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ikuchmin on 24.07.16.
 */
@Configuration
public class TestConfiguration {
    @Bean
    public Integer m1() {
        return 42;
    }

    @Bean
    public Integer m2() {
        return 42;
    }

    @Bean
    public Integer m3(Integer m1) {
        return 42;
    }

    @Bean
    public Integer m4(Integer m3) {
        return 42;
    }

    @Bean
    public Integer m5(Integer m4, Integer m2) {
        return 42;
    }

    @Bean
    public Integer m6(Integer m3, Integer m2) {
        return 42;
    }
}
