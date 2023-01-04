package com.sample.demo;

import com.sample.demo.aspect.TestAspect;
import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

/**
 * @author M.khoshnevisan
 * @since 1/2/2023
 */
@Configuration
@EnableLoadTimeWeaving()
public class DemoConfig {

    @Bean
    public TestAspect testAspect() {
        TestAspect testAspect = Aspects.aspectOf(TestAspect.class);
        return testAspect;
    }
}
