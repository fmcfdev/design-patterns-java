package br.com.fabriciomcf.facade.service;

public class InventoryManager {
    public void updateStock(String productId, int quantity) {
        System.out.println("Updating stock for product: " + productId + " with quantity: " + quantity);
    }

}
