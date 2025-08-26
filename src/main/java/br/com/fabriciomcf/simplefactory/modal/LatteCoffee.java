package br.com.fabriciomcf.simplefactory.modal;

public class LatteCoffee implements Coffee{

    @Override
    public void prepare() {
        System.out.println("Estamos preparando seu café Latte!");
    }

    @Override
    public void serve() {
        System.out.println("Seu café Latte está pronto para beber!");
    }
}
