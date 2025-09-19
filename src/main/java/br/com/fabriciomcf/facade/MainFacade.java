package br.com.fabriciomcf.facade;

import br.com.fabriciomcf.facade.controller.OrderController;
import br.com.fabriciomcf.facade.model.Order;

public class MainFacade {
    public static void main(String[] args) {
        Order order = new Order("100", 1,"122","123 Main St", "asd@fsa.com");
        OrderController orderController = new OrderController();
        orderController.newOrder(order);
    }
}
