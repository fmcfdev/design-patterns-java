package br.com.fabriciomcf.factorymethod.model;

public class CoffeMachiatto extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Aguarde enquanto preparamos seu café Machiatto!");
    }

    @Override
    public void serve() {
        System.out.println("Seu café Machiatto está pronto para beber!");
    }
}
