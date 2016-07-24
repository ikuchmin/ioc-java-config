package ru.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ikuchmin on 24.07.16.
 */
@Configuration
public class TestConfigurationWithQualifier {
    @Bean
    public Integer m1() {
        return 42;
    }

    @Bean
    public Integer m2() {
        return 42;
    }

    @Bean
    public Integer m3(@Qualifier("m1") Integer m1) {
        return 42;
    }

    @Bean
    public Integer m4(@Qualifier("m3") Integer m3) {
        return 42;
    }

    @Bean
    public Integer m5(@Qualifier("m4") Integer m4, @Qualifier("m2") Integer m2) {
        return 42;
    }

    @Bean
    public Integer m6(@Qualifier("m3") Integer m3, @Qualifier("m2") Integer m2) {
        return 42;
    }
}
