package ro.dg.springex.service.usingdependson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventManager {

    private static class SingletonHolder {
        private static final EventManager INSTANCE = new EventManager();
    }

    public static EventManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private final List<Consumer<String>> listeners = new ArrayList<>();

    private EventManager() {
    }

    public void addListener(Consumer<String> eventConsumer) {
        listeners.add(eventConsumer);
    }

    public void publish(final String message) {
        listeners.forEach(l -> l.accept(message));
    }

}
