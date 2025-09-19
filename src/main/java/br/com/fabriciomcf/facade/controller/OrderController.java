package br.com.fabriciomcf.facade.controller;

import br.com.fabriciomcf.facade.model.Order;
import br.com.fabriciomcf.facade.service.OrderFacade;

public class OrderController {
    private final OrderFacade orderFacade;

    public OrderController() {
        this.orderFacade = new OrderFacade();
    }
    public void newOrder(Order order) {
        orderFacade.processOrder(order);
    }
}
