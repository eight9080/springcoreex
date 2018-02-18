package ro.dg.springex.service.usingdependson.bean;

import ro.dg.springex.service.usingdependson.EventManager;

public class EventPublisherBean {

    public void initialize() {
        System.out.println("EventPublisherBean initializing");
        EventManager.getInstance().publish("event published from EventPublisherBean");
    }
}
