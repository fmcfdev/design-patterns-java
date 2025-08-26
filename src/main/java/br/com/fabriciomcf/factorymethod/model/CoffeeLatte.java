package br.com.fabriciomcf.factorymethod.model;

public class CoffeeLatte extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Aguarde enquanto preparamos seu café Latte!");
    }

    @Override
    public void serve() {
        System.out.println("Seu café Latte está pronto para beber!");
    }
}
