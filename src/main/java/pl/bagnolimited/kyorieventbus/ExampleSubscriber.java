package pl.bagnolimited.kyorieventbus;

import net.kyori.event.EventSubscriber;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class ExampleSubscriber implements EventSubscriber<ExampleEvent> {

    @Override
    public void invoke(@NonNull ExampleEvent event) throws Throwable {
        System.out.println("Hello world!");

        //do some other bunch of stuff
        //...
    }

}