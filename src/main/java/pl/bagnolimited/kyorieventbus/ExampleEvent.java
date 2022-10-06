package pl.bagnolimited.kyorieventbus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class ExampleEvent extends ExampleAbstractEvent {
    //do whatever you want with these things
    @Getter private final String someString;
    @Getter private final Integer someInteger;

    //do some other bunch of stuff
    //...
}