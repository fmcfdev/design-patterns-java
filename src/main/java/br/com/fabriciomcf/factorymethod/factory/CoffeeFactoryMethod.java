package br.com.fabriciomcf.factorymethod.factory;

import br.com.fabriciomcf.factorymethod.model.Coffee;

public abstract class CoffeeFactoryMethod {
    public abstract Coffee createCoffee(int coffeeType);
}
