package br.com.fabriciomcf.simplefactory.factory;

import br.com.fabriciomcf.simplefactory.modal.Coffee;
import br.com.fabriciomcf.simplefactory.modal.LatteCoffee;
import br.com.fabriciomcf.simplefactory.modal.MachiattoCoffee;

public class CoffeeFactory {
    public static Coffee createCoffee(String coffeeType) throws Exception {
        if("L".equals(coffeeType)) {
            return new LatteCoffee();
        } else if ("M".equals(coffeeType)) {
            return new MachiattoCoffee();
        }
        throw new Exception("Não servimos o café solicitado!");
    }
}
