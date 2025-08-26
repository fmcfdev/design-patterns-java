package br.com.fabriciomcf.factorymethod.factory;

import br.com.fabriciomcf.factorymethod.model.CoffeMachiatto;
import br.com.fabriciomcf.factorymethod.model.Coffee;
import br.com.fabriciomcf.factorymethod.model.CoffeeLatte;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CoffeeFactory extends CoffeeFactoryMethod {
    private static final Map<Integer, Supplier<Coffee>> coffeeMap = new HashMap<>();

    public CoffeeFactory() {
        coffeeMap.put(1, CoffeeLatte::new);
        coffeeMap.put(2, CoffeMachiatto::new);
    }

    @Override
    public Coffee createCoffee(int coffeeType) {
        Supplier<Coffee> coffeeSupplier = coffeeMap.get(coffeeType);
        if(coffeeSupplier == null) throw new RuntimeException("Infelizmente não servimos o café solicitado!");
        return coffeeSupplier.get();
    }


}
