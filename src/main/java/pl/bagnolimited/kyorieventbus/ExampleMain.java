package pl.bagnolimited.kyorieventbus;

import net.kyori.event.EventBus;
import net.kyori.event.SimpleEventBus;

public final class ExampleMain {

    /* Registers new EventBus for all Event objects */
    private static final EventBus<ExampleAbstractEvent> eventBus = new SimpleEventBus<>(ExampleAbstractEvent.class);;

    public static void main(String[] args) {

        registerEventListeners();
        postEvent();
    }

    private static void registerEventListeners() {
        /* Registers new EventSubscriber (event listener) */
        eventBus.register(ExampleEvent.class, new ExampleSubscriber());
    }

    private static void postEvent() {
        /* Create our custom event object */
        final ExampleEvent customEvent = new ExampleEvent("Hello world!", 123);
        /* Posts our custom event */
        // Also checks if posting our event was successful
        if (!eventBus.post(customEvent).wasSuccessful())
            System.out.format("Couldn't post %s", customEvent.getClass().getSimpleName());
    }

}