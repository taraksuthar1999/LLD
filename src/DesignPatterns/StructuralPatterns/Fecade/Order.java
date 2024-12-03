package DesignPatterns.StructuralPatterns.Fecade;

public class Order {

//    private PaymentGateway paymentGateway;
//
//    private Inventory inventory;
//    private EmailService emailService;
//    private ShippingService shippingService;

    private OrderProcessor orderProcessor;

    public void placeOrder(){

//        paymentGateway.pay();
//        inventory.update();
//        emailService.send();
//        shippingService.send();
        orderProcessor.process();

    }


}
