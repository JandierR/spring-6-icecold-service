package guru.springframework.spring6icecoldservice.services;

import guru.springframework.spring7restmvcapi.events.DrinkRequestEvent;

public interface DrinkRequestProcessor {

    void processDrinkRequest(DrinkRequestEvent drinkRequestEvent);
}
