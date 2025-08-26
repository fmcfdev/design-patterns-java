package br.com.fabriciomcf.factorymethod;

import br.com.fabriciomcf.factorymethod.factory.CoffeeFactory;
import br.com.fabriciomcf.factorymethod.model.Coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe seu pedido: (1) Latte - (2) Machiato");
            System.out.print(">> ");
            int coffeeCode = scanner.nextInt();
            makeOrder(coffeeCode);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void makeOrder(int coffeeCode) throws Exception {
        if (coffeeCode == 0) {
            throw new Exception("Café não disponível!");
        }
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(coffeeCode);
        coffee.prepare();
        threadSleep(); //delay to simulate coffee preparation time
        coffee.serve();
    }

    private static void threadSleep() {
        System.out.print("Aguarde");
        int totalSeconds = 10 + (int)(Math.random() * 11);
        for (int i = 0; i < totalSeconds; i++) {
            System.out.print(".");
            loading();
            if ((i + 1) % 5 == 0) {
                clearDots();
                System.out.print("Aguarde");
            }
        }
        clearDots();
        System.out.println();
    }

    private static void clearDots() {
        System.out.print("\r   \r");
    }

    private static void loading() {
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
