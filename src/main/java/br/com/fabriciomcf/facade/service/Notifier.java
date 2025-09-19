package br.com.fabriciomcf.facade.service;

public class Notifier {
    public void sendOrderConfirmation(String email) {
        System.out.println("Sending order confirmation to: " + email);
    }
}
