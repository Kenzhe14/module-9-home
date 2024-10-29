interface IPaymentProcessor1{
    void processpayment(double amount);
}
class PayPalPaymentProcessor implements IPaymentProcessor1{
    @Override
    public void processpayment(double amount){
        System.out.println("PayPal payed " + amount);
    }
}
class StripePaymentService {
    public void maketransaction(double amount){
        System.out.println("Stripe payed " + amount);
    }
}
class PaymentAdapterS implements IPaymentProcessor1 {
    private StripePaymentService stripePay;

    public PaymentAdapterS(StripePaymentService stripePay){
        this.stripePay = stripePay;
    }

    @Override
    public void processpayment(double amount){
        stripePay.maketransaction(amount);
    }
}
public class Adapter {
    public static void main(String[] args) {
        IPaymentProcessor1 paypal = new PayPalPaymentProcessor();
        paypal.processpayment(200);


        StripePaymentService stripeService = new StripePaymentService();
        IPaymentProcessor1 stripe = new PaymentAdapterS(stripeService);
        stripe.processpayment(500);
    }
}