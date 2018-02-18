package ro.dg.springex.service.impl;

import ro.dg.springex.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
    public void sayHi(String name) {
        System.out.println(name);
    }
}
