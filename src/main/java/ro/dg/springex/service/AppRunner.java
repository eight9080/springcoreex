package ro.dg.springex.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.dg.springex.service.client.HelloWorldClient;
import ro.dg.springex.service.impl.HelloWorldServiceImpl;

@Configuration
public class AppRunner {

    @Bean
    public HelloWorldService createHelloWorldService() {
        return new HelloWorldServiceImpl();
    }

    @Bean
    public HelloWorldClient createClient() {
        return new HelloWorldClient();
    }

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        final HelloWorldClient client = context.getBean(HelloWorldClient.class);
        client.showMessage();
    }

}
