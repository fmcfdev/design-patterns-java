package br.com.fabriciomcf.facade.model;

public class Order {
    private final String orderId;
    private final String productId;
    private final int quantity;
    private final String ammount;
    private final String address;
    private final String email;

    public Order(String orderId, String productId, int quantity, String ammount, String address, String email) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.ammount = ammount;
        this.address = address;
        this.email = email;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getAmmount() {
        return ammount;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }

}
