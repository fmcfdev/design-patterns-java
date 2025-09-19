package br.com.fabriciomcf.facade.model;

public record Order(String productId, int quantity, String ammount, String address, String email) {

}
