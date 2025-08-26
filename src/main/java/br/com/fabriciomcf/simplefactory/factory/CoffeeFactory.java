package br.com.fabriciomcf.simplefactory.factory;

import br.com.fabriciomcf.simplefactory.modal.Coffee;
import br.com.fabriciomcf.simplefactory.modal.LatteCoffee;
import br.com.fabriciomcf.simplefactory.modal.MachiattoCoffee;

public class CoffeeFactory {
    public static Coffee createCoffee(String coffeeOrder) throws Exception {
        if("L".equals(coffeeOrder)) {
            return new LatteCoffee();
        } else if ("M".equals(coffeeOrder)) {
            return new MachiattoCoffee();
        }
        throw new Exception("Invalid coffee order!");
    }
}
