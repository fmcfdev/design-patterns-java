package br.com.fabriciomcf.simplefactory.modal;

public class MachiattoCoffee implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Aguarde enquanto preparamos seu café Machiatto!");
    }

    @Override
    public void serve() {
        System.out.println("Seu café Machiatto está pronto para beber!");
    }
}
