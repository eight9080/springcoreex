package ro.dg.springex.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import ro.dg.springex.service.HelloWorldService;

public class HelloWorldClient {

    @Autowired
    private HelloWorldService helloWorldService;

    public void showMessage() {
        helloWorldService.sayHi("Hello world!");
    }
}
