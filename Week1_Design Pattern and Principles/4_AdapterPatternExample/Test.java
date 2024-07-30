public class Test {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment(100.0);

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(200.0);
    }
}
