package br.com.fabriciomcf.simplefactory;

import br.com.fabriciomcf.simplefactory.factory.CoffeeFactory;
import br.com.fabriciomcf.simplefactory.modal.Coffee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe seu pedido: (L) Latte - (M) Machiato");
            System.out.print(">> ");
            String coffeeType = scanner.next().toUpperCase();
            makeOrder(coffeeType);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void makeOrder(String coffeeType) throws Exception {
        if (coffeeType == null || coffeeType.isEmpty()) {
            throw new Exception("Café não disponível!");
        }
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
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
