package ro.dg.springex.service.usingdependson;

import org.springframework.context.annotation.*;
import ro.dg.springex.service.usingdependson.bean.EventListenerBean;
import ro.dg.springex.service.usingdependson.bean.EventPublisherBean;

@Configuration
@ComponentScan("ro.dg.springex.service.usingdependson.bean")
public class AppConfig {

    @Bean(initMethod = "initialize")
    @DependsOn("eventListener")
    public EventPublisherBean eventPublisherBean () {
        return new EventPublisherBean();
    }

    @Bean(name = "eventListener", initMethod = "initialize")
    // @Lazy
    public EventListenerBean eventListenerBean () {
        return new EventListenerBean();
    }

    public static void main (String... strings) {
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
