public class StrategyTest {
    public static void main(String args[]){
        PaymentContext context=new PaymentContext(new CreditCardPayment());
        context.executePayment(2500);
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(1800);
    } 
}
