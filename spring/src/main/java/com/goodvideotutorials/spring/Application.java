package com.goodvideotutorials.spring;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Achille
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableAsync
public class Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        logger.info("Beans in application context:");
        
        String beanNames[] = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        
        for (String beanName: beanNames)
        	logger.info(beanName);
    }
}
