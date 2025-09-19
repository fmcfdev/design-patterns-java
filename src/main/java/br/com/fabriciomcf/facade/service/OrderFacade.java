package br.com.fabriciomcf.facade.service;

import br.com.fabriciomcf.facade.model.Order;

public class OrderFacade {
    private final PaymentProcessor paymentProcessor;
    private final ShippingService shippingService;
    private final Notifier notifier;
    private final InventoryManager inventoryManager;

    public OrderFacade() {
        this.paymentProcessor = new PaymentProcessor();
        this.shippingService = new ShippingService();
        this.notifier = new Notifier();
        this.inventoryManager = new InventoryManager();
    }

    public void processOrder(Order order) {
        paymentProcessor.processPayment(order.getAmmount());
        inventoryManager.updateStock(order.getProductId(), order.getQuantity());
        shippingService.initiateShipping(order.getAddress());
        notifier.sendOrderConfirmation(order.getEmail());
    }
}
